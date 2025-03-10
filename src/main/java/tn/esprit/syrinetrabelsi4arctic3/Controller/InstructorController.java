package tn.esprit.syrinetrabelsi4arctic3.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Instructor;
import tn.esprit.syrinetrabelsi4arctic3.Services.INinstructor;


import java.util.List;

@RestController
@RequestMapping("Instructor")
@AllArgsConstructor
public class InstructorController {

    private INinstructor InService;

    @PostMapping("add")
    public Instructor addInstructor(@RequestBody Instructor In){
        return InService.addInstructor(In);
    }

    @PutMapping("update")
    public Instructor update(@RequestBody Instructor In){
        return InService.update(In);
    }

    @GetMapping("get/{numInstructor}")
    public Instructor retrieveInstructor(@PathVariable Long numInstructor){
        return InService.retrieveInstructor(numInstructor);
    }

    @GetMapping("getall")
    public List<Instructor> retrieveAll(){

        return InService.retrieveAll();
    }

    @DeleteMapping ("delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor){
        InService.deleteInstructor(numInstructor);
    }

    @PostMapping("addInstructorAndAssignToCourse/{numCourse}")
    public Instructor addInstructorAndAssignToCourse(@RequestBody Instructor instructor, @PathVariable Long numCourse){
        return InService.addInstructorAndAssignToCourse(instructor,numCourse);
    }

}
