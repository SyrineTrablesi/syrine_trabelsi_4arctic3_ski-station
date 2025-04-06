package tn.esprit.syrinetrabelsi4arctic3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Subscription;
import tn.esprit.syrinetrabelsi4arctic3.Entity.TypeSubscription;
import tn.esprit.syrinetrabelsi4arctic3.Services.ISkierService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("skier")
public class SkierController {
    @Autowired
    private ISkierService skierService;

    @PostMapping("add")
    public Skier addSkier(@RequestBody Skier s){
        return skierService.addSkier(s);
    }

    @PutMapping("update")
    public Skier update(@RequestBody Skier s){
        return skierService.update(s);
    }

    @GetMapping("get/{numSkier}")
    public Skier retrieveSkier(@PathVariable int numSkier){
        return skierService.retrieveSkier(numSkier);
    }

    @GetMapping("getall")
    public List<Skier> retrieveAll(){

        return skierService.retrieveAll();
    }

    @DeleteMapping ("delete/{numSkier}")
    public void deleteSkier(@PathVariable int numSkier){
        skierService.deleteSkier(numSkier);
    }

    //tp 5
    @PostMapping("add-skierCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody  Skier skier, @PathVariable(name = "numCourse") Long numCourse){
        return skierService.addSkierAndAssignToCourse(skier, numCourse);
    }

    @PostMapping("assignSkierToPiste{numSkier}/{numPiste}")
    public Skier assignSkierToPiste (@PathVariable long numSkier, @PathVariable long numPiste){
        return skierService.assignSkierToPiste(numSkier,numPiste);
    }
    @GetMapping("/by-subscription-type/{type}")
    public List<Skier> getSkiersBySubscriptionType(@PathVariable("type") TypeSubscription typeAbonnement) {
        return skierService.findBySubscription_TypeSubscription(typeAbonnement);
    }
    @GetMapping("getAllSubsByType/{type}")
    public List<Skier> getSubscriptionByType(@PathVariable TypeSubscription type){
        return skierService.findBySubscription_TypeSubscription(type).stream().toList();
    }


}
