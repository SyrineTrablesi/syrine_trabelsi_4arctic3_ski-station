package tn.esprit.syrinetrabelsi4arctic3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Course;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Registration;
import tn.esprit.syrinetrabelsi4arctic3.Services.IRegistrationService;

import java.util.List;

@RestController
@RequestMapping("Registration")
public class RegistrationController {
    @Autowired
    private IRegistrationService regService;

    @PostMapping("add")
    public Registration addRegistration(@RequestBody Registration reg){
        return regService.addReg(reg);
    }

    @PutMapping("update")
    public Registration update(@RequestBody Registration reg){
        return regService.update(reg);
    }

    @GetMapping("get/{numRegistration}")
    public Registration retrieveCourse(@PathVariable Long numRegistration){
        return regService.retrieveRegistration(numRegistration);
    }

    @GetMapping("getall")
    public List<Registration> retrieveAll(){

        return regService.retrieveAll();
    }

    @DeleteMapping ("delete/{numRegistration}")
    public void deleteRegistration(@PathVariable long numRegistration){
        regService.deleteRegistration(numRegistration);
    }




}
