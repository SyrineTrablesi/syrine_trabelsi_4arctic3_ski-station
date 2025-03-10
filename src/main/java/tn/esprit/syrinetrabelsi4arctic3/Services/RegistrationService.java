package tn.esprit.syrinetrabelsi4arctic3.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Registration;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Repos.RegistrationRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.SikierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationService implements IRegistrationService{

    private     RegistrationRepository RegRepo;
    private SikierRepository skiRep;
    @Override
    public Registration addReg(Registration reg) {
        return RegRepo.save(reg);
    }

    @Override
    public Registration update(Registration reg) {
        return RegRepo.save(reg);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return RegRepo.findById(numRegistration).orElse(null);
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        RegRepo.deleteById(numRegistration);

    }

    @Override
    public List<Registration> retrieveAll() {
        return RegRepo.findAll();
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkieur) {
        Skier skier =skiRep .findById(numSkieur).orElse(null);
        if(skier != null)
            registration.setSk(skier);
        return RegRepo.save(registration);
}
}