package tn.esprit.syrinetrabelsi4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Repos.SikierRepository;

import java.util.List;
@Service
public class SkierService implements ISkierService{
    @Autowired
    private SikierRepository skierRepository;

    @Override
    public Skier addSkier(Skier s) {
        return skierRepository.save(s);
    }

    @Override
    public Skier update(Skier s) {
        return skierRepository.save(s);
    }

    @Override
    public Skier retrieveSkier(int numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public void deleteSkier(int numSkier) {
         skierRepository.deleteById(numSkier);

    }

    @Override
    public List<Skier> retrieveAll() {
        return  skierRepository.findAll();
    }
}
