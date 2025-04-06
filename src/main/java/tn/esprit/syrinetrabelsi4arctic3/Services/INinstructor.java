package tn.esprit.syrinetrabelsi4arctic3.Services;

import tn.esprit.syrinetrabelsi4arctic3.Entity.Instructor;

import java.util.List;

public interface INinstructor {
    Instructor addInstructor(Instructor In);
    Instructor update(Instructor In);
    Instructor retrieveInstructor(Long numInstructor);
    void deleteInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
    //tp5
    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long
            numCourse);

}
