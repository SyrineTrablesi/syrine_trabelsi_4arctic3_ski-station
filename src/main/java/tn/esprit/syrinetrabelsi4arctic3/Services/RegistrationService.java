package tn.esprit.syrinetrabelsi4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Registration;
import tn.esprit.syrinetrabelsi4arctic3.Repos.RegistrationRepository;

import java.util.List;

@Service
public class RegistrationService implements IRegistrationService{
    @Autowired
    private     RegistrationRepository RegRepo;
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
}
