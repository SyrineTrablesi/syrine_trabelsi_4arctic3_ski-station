package tn.esprit.syrinetrabelsi4arctic3.Services;

import tn.esprit.syrinetrabelsi4arctic3.Entity.Course;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course c);
    Course update(Course c);
    Course retrieveCourse(Long numCourse);
    void deleteCourse(Long numCourse);
    List<Course> retrieveAll();
}
