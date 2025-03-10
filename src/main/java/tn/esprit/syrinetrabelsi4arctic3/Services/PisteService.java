package tn.esprit.syrinetrabelsi4arctic3.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;
import tn.esprit.syrinetrabelsi4arctic3.Repos.PisteRepository;
import tn.esprit.syrinetrabelsi4arctic3.Repos.SikierRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class PisteService implements IPisteServices{

    private PisteRepository pisteRepository;
    private SikierRepository skierRep;
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

    public Piste assignSkierToPiste(Long numSkier, Long numPiste) {
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Skier skier = skierRep.findById(numSkier).orElse(null);

            piste.getSkiers().add(skier);
            return pisteRepository.save(piste);
    }
}
