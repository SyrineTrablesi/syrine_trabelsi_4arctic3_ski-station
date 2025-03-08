package tn.esprit.syrinetrabelsi4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Subscription;
import tn.esprit.syrinetrabelsi4arctic3.Repos.subscriptionRepository;

import java.util.List;
@Service
public class SubscriptionService implements ISubscriptionService {

    @Autowired
    private subscriptionRepository subRepo;
    @Override
    public Subscription addSub(Subscription s) {
        return subRepo.save(s);
    }

    @Override
    public Subscription update(Subscription s) {
        return subRepo.save(s);
    }

    @Override
    public Subscription retrieveSubscription(long numSubscription) {
        return subRepo.findById(numSubscription).orElse(null);
    }


    @Override
    public void deleteSubscription(long numSubscription) {
        subRepo.deleteById(numSubscription);

    }

    @Override
    public List<Subscription> retrieveAll() {
        return subRepo.findAll();
    }
}
