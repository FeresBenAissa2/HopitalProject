package org.example;

import java.util.Comparator;

public class TriePatientsParNom implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
