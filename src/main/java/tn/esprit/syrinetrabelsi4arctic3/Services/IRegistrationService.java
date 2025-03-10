package tn.esprit.syrinetrabelsi4arctic3.Services;

import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addReg(Registration reg);
    Registration update(Registration reg);
    Registration retrieveRegistration(Long numRegistration);
    void deleteRegistration(Long numRegistration);
    List<Registration> retrieveAll();
    Registration addRegistrationAndAssignToSkier(
            Registration registration, Long numSkieur
    );


}
