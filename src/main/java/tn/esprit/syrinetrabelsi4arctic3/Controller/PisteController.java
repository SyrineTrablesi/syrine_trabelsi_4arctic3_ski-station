package tn.esprit.syrinetrabelsi4arctic3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;
import tn.esprit.syrinetrabelsi4arctic3.Services.IPisteServices;

import java.util.List;

@RestController
@RequestMapping("piste")
public class PisteController {

    @Autowired
    private IPisteServices pisteServices;

    @PostMapping("add")
    public Piste addPiste(@RequestBody Piste p){
        return pisteServices.addPiste(p);
    }

    @PutMapping("update")
    public Piste update(@RequestBody Piste p){
        return pisteServices.update(p);
    }

    @GetMapping("get/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste){
        return pisteServices.retrievePiste(numPiste);
    }

    @GetMapping("getall")
    public List<Piste> retrieveAll(){

        return pisteServices.retrieveAll();
    }

    @DeleteMapping ("delete/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste){
        pisteServices.deletePiste(numPiste);
    }

}






