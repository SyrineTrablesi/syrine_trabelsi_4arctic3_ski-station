package tn.esprit.syrinetrabelsi4arctic3.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Entity.TypeSubscription;

import java.util.List;

public interface SikierRepository extends JpaRepository<Skier,Long> {
    //tp 5
    List<Skier> findBySubscription_TypeSubscription(TypeSubscription typeAbonnement);
}
