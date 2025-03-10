package tn.esprit.syrinetrabelsi4arctic3.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Course;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Instructor;
import tn.esprit.syrinetrabelsi4arctic3.Repos.CourseRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.InstructorRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class InstructorService implements INinstructor{

    private InstructorRepository InRepo;
    private CourseRepository courRep;
    @Override
    public Instructor addInstructor(Instructor In) {
        return  InRepo.save(In);
    }

    @Override
    public Instructor update(Instructor In) {
        return  InRepo.save(In);    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return InRepo.findById(numInstructor).orElse(null);
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        InRepo.deleteById(numInstructor);

    }

    @Override
    public List<Instructor> retrieveAll() {
        return InRepo.findAll();
    }

    @Override
    public Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse) {
        Course coure= courRep.findById(numCourse).orElse(null);


        if (instructor.getCourses() == null) {
            Set<Course> setCourses = new HashSet<>();
            instructor.setCourses(setCourses); // Affecter l'ensemble à l'instructeur
        }

        instructor.getCourses().add(coure);

        return InRepo.save(instructor);
    }
}
