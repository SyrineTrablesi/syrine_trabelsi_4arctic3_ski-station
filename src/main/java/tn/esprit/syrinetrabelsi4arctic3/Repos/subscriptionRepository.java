package tn.esprit.syrinetrabelsi4arctic3.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Subscription;
import tn.esprit.syrinetrabelsi4arctic3.Entity.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface subscriptionRepository extends JpaRepository<Subscription,Long> {
    //tp 5:
    Set<Subscription> getSubscriptionByTypeSub(TypeSubscription type);
    List<Subscription>findByStartDateGreaterThanEqualAndEndDateLessThanEqual(LocalDate startDate, LocalDate endDate);

}
