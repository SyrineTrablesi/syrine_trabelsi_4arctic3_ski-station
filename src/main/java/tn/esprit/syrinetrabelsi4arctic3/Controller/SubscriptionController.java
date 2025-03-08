package tn.esprit.syrinetrabelsi4arctic3.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Subscription;
import tn.esprit.syrinetrabelsi4arctic3.Services.ISubscriptionService;

import java.util.List;

@RestController
@RequestMapping("subscription")
public class SubscriptionController {
    @Autowired
    private ISubscriptionService SubService;

    @PostMapping("add")
    public Subscription addSub(@RequestBody Subscription s){
        return SubService.addSub(s);
    }

    @PutMapping("update")
    public Subscription update(@RequestBody Subscription s){
        return SubService.update(s);
    }

    @GetMapping("get/{numSub}")
    public Subscription retrieveSub(@PathVariable Long numSub){
        return SubService.retrieveSubscription(numSub);
    }

    @GetMapping("getall")
    public List<Subscription> retrieveAll(){

        return SubService.retrieveAll();
    }

    @DeleteMapping ("delete/{numSub}")
    public void deleteSub(@PathVariable long numSub){
        SubService.deleteSubscription(numSub);
    }

}
