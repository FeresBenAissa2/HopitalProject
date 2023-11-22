package org.example;

import java.util.HashMap;
import java.util.Map;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            ListPatients liste = medecinPatiens.get(m);
            liste.ajouterPatient(p);
            medecinPatiens.put(m, liste);

        } else {
            ListPatients liste = new ListPatients();
            liste.ajouterPatient(p);
            medecinPatiens.put(m, liste);
        }
    }

    public void afficherMap() {
        medecinPatiens.entrySet().stream()
                .forEach(
                        entry -> {
                            System.out.println("Key: " + entry.getKey() ) ;
                            entry.getValue().afficherPatients();
                        }
                        );
    }

    public void afficherMedcinPatients(Medecin m) {
        medecinPatiens.entrySet().stream()
                .filter(entry -> entry.getKey().equals(m))
                .forEach(entry -> {
                    System.out.println("Medical Doctor: " + entry.getKey().getNom()); // Assuming Medecin has a nom (name) attribute
                    System.out.println("Liste Patient:");
                    entry.getValue().getListP().stream().filter(
                            patient -> patient.getNom() .equals("Mohamed")

                    ).forEach(patient -> System.out.println(patient));
                });
    }
}
