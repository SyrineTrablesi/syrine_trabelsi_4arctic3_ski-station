package tn.esprit.syrinetrabelsi4arctic3.Services;

import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Subscription;
import tn.esprit.syrinetrabelsi4arctic3.Entity.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ISubscriptionService {
    Subscription addSub(Subscription s);
    Subscription update(Subscription s);
    Subscription retrieveSubscription(long numSubscription);
    void deleteSubscription(long numSubscription);
    List<Subscription> retrieveAll();
    // tp5
    Set<Subscription> getSubscriptionByTypeSub(TypeSubscription type);
    List<Subscription> findSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

}
