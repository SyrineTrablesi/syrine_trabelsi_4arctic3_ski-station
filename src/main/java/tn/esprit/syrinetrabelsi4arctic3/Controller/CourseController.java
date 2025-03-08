package tn.esprit.syrinetrabelsi4arctic3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Course;
import tn.esprit.syrinetrabelsi4arctic3.Services.ICourseService;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private ICourseService courseService;


    @PostMapping("add")
    public Course addCourse(@RequestBody Course c){
        return courseService.addCourse(c);
    }

    @PutMapping("update")
    public Course update(@RequestBody Course c){
        return courseService.update(c);
    }

    @GetMapping("get/{numCourse}")
    public Course retrieveCourse(@PathVariable Long numCourse){
        return courseService.retrieveCourse(numCourse);
    }

    @GetMapping("getall")
    public List<Course> retrieveAll(){

        return courseService.retrieveAll();
    }

    @DeleteMapping ("delete/{numCourse}")
    public void deleteCourse(@PathVariable long numCourse){
        courseService.deleteCourse(numCourse);
    }

}
