package org.example;

import java.util.TreeSet;

public interface InterfaceMedecin {
    void ajouterMedecin(Medecin m) ;
    boolean rechercherMedecin(int cin) ;
    void afficherMedecins() ;
    long nombreMedecins();
    TreeSet<Medecin> trierMedecins();
}
