package tn.esprit.syrinetrabelsi4arctic3.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import tn.esprit.syrinetrabelsi4arctic3.Entity.*;
import tn.esprit.syrinetrabelsi4arctic3.Repos.CourseRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.RegistrationRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.SikierRepository;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class RegistrationService implements IRegistrationService{

    private     RegistrationRepository RegRepo;
    private SikierRepository skiRep;
    private CourseRepository courseRep;
    @Override
    public Registration addReg(Registration reg) {
        return RegRepo.save(reg);
    }

    @Override
    public Registration update(Registration reg) {
        return RegRepo.save(reg);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return RegRepo.findById(numRegistration).orElse(null);
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        RegRepo.deleteById(numRegistration);

    }

    @Override
    public List<Registration> retrieveAll() {
        return RegRepo.findAll();
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkieur) {
        Skier skier =skiRep .findById(numSkieur).orElse(null);
        if(skier != null)
            registration.setSk(skier);
        return RegRepo.save(registration);
}

//tp 5:


    @Override
    public Registration assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Registration reg = RegRepo.findById(numRegistration).orElse(null);
        Course course = courseRep.findById(numCourse).orElse(null);
        if(reg != null && course != null) {
            reg.setC(course);
            course.getRegistrations().add(reg);
        }
        return RegRepo.save(reg) ;
    }

    @Override
    public Registration addRegistrationAndAssignToSkierAndCourse(Registration registration, Long numSkier, Long numCourse) {


        Skier skier = skiRep.findById(numSkier)
                .orElseThrow(() -> new IllegalArgumentException("Skier with ID " + numSkier + " not found"));

        Course course = courseRep.findById(numCourse)
                .orElseThrow(() -> new IllegalArgumentException("Course with ID " + numCourse + " not found"));

        int maxNbSkPerCourse = 6;
        int ageSk = Period.between(skier.getDateOfBirth(), LocalDate.now()).getYears();
        TypeCourse typeCourse = course.getTypeCourse();


        if (course.getRegistrations().size() >= maxNbSkPerCourse) {
            throw new IllegalStateException("The course with ID " + numCourse + " is full (max " + maxNbSkPerCourse + " skiers allowed).");
        }


        if (ageSk < 18 && typeCourse != TypeCourse.COLLECTIVE_CHILDREN) {
            throw new IllegalArgumentException("A child cannot be registered in an adult course.");
        }
        if (ageSk >= 18 && typeCourse != TypeCourse.COLLECTIVE_ADULT) {
            throw new IllegalArgumentException("An adult cannot be registered in a children’s course.");
        }


        registration.setC(course);
        registration.setC(course);
        return RegRepo.save(registration);
    }
}