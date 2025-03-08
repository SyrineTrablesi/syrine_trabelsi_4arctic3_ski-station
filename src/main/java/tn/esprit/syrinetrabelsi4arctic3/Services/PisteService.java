package tn.esprit.syrinetrabelsi4arctic3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;
import tn.esprit.syrinetrabelsi4arctic3.Repos.PisteRepository;

import java.util.List;
@Service
public class PisteService implements IPisteServices{
    @Autowired
    private PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public Piste update(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
         return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

    @Override
    public List<Piste> retrieveAll() {
         return pisteRepository.findAll();
    }
}
