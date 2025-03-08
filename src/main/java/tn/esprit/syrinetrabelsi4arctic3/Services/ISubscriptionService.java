package tn.esprit.syrinetrabelsi4arctic3.Services;

import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSub(Subscription s);
    Subscription update(Subscription s);
    Subscription retrieveSubscription(long numSubscription);
    void deleteSubscription(long numSubscription);
    List<Subscription> retrieveAll();
}
