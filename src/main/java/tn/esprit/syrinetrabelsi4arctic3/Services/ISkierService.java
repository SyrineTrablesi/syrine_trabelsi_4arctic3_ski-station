package tn.esprit.syrinetrabelsi4arctic3.Services;
import tn.esprit.syrinetrabelsi4arctic3.Entity.Skier;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier s);
    Skier update(Skier s);
    Skier retrieveSkier(int numSkier);
    void deleteSkier(int numSkier);
    List<Skier> retrieveAll();
}
