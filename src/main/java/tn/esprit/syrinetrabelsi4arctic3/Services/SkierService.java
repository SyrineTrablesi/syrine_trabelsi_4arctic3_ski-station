package tn.esprit.syrinetrabelsi4arctic3.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Course;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Entity.TypeSubscription;
import tn.esprit.syrinetrabelsi4arctic3.Repos.CourseRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.PisteRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.SikierRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class SkierService implements ISkierService{

    private SikierRepository skierRepository;
    private CourseRepository courREp ;
    private PisteRepository pisteRepository;

    @Override
    public Skier addSkier(Skier s) {
        return skierRepository.save(s);
    }

    @Override
    public Skier update(Skier s) {
        return skierRepository.save(s);
    }

    @Override
    public Skier retrieveSkier(long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public void deleteSkier(long numSkier) {
         skierRepository.deleteById(numSkier);

    }

    @Override
    public List<Skier> retrieveAll() {
        return  skierRepository.findAll();
    }


    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        Course course = courREp.findById(numCourse).orElse(null);
        skier.getRegistrations().forEach(r ->
                {
                    r.setC(course);
                    r.setSk(skier);
                }
        );
        return skierRepository.save(skier);
    }

    // tp5 :
    @Override
    public Skier assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
         if (skier != null && piste != null) {
             skier.getPistes().add(piste);
             piste.getSkiers().add(skier);
         }
        return skierRepository.save(skier);
    }

    @Override
    public List<Skier> findBySubscription_TypeSubscription(TypeSubscription typeAbonnement) {
        return skierRepository.findBySubscription_TypeSubscription(typeAbonnement);
    }


}
