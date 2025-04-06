package tn.esprit.syrinetrabelsi4arctic3.Services;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Entity.TypeSubscription;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier s);
    Skier update(Skier s);
    Skier retrieveSkier(long numSkier);
    void deleteSkier(long numSkier);
    List<Skier> retrieveAll();
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
    //tp 5
    Skier assignSkierToPiste(Long numSkier, Long numPiste);
    List<Skier> findBySubscription_TypeSubscription(TypeSubscription typeAbonnement);

}
