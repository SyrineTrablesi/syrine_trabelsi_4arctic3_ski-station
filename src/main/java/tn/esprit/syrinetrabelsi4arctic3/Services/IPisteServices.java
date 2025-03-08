package tn.esprit.syrinetrabelsi4arctic3.Services;

import tn.esprit.syrinetrabelsi4arctic3.Entity.Piste;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste p);
    Piste update(Piste p);
    Piste retrievePiste(Long numPiste);
    void deletePiste(Long numPiste);
    List<Piste> retrieveAll();
}
