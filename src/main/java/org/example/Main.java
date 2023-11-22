package org.example;

public class Main {
    public static void main(String[] args) {
        Medecin m1 = new Medecin(1, "benAissa", "feres", 1);
        Medecin m2 = new Medecin(2, "boulares", "Mezen", 2);
        Patient p1 = new Patient(3, "souzana", "sawsen", 123);
        Patient p2 = new Patient(4, "Mohamed", "Mohamed", 123);
        Patient p3 = new Patient(5, "Mohamed", "Ali", 123);
        Patient p4 = new Patient(6, "salah", "salih", 123);

        ListPatients liste = new ListPatients() ;
        liste.ajouterPatient(p1);
        liste.ajouterPatient(p2);
        liste.ajouterPatient(p3);
        liste.ajouterPatient(p4);

        SetMedecins setMedecins  = new SetMedecins();
        setMedecins.ajouterMedecin(m1);
        setMedecins.ajouterMedecin(m2);

        Hopital h = new Hopital();
        h.ajouterMedecin(m1);
        h.ajouterPatient(m1, p3);
        h.ajouterPatient(m1, p2);
        h.ajouterPatient(m1, p1);
        h.afficherMedcinPatients(m1);
        h.ajouterMedecin(m2);
        h.afficherMedcinPatients(m2);

        System.out.println("---------afficher hashMap with stream ---------------");
        h.afficherMap();

    }
}