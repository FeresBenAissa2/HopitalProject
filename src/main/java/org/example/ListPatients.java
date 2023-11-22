package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListPatients implements InterfacePatient{
    private List<Patient> listP;
    public ListPatients() {
        listP = new ArrayList<>();
    }

    public List<Patient> getListP() {
        return listP;
    }

    public void setListP(List<Patient> listP) {
        this.listP = listP;
    }


    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    @Override
    public boolean rechercherPatient(Patient p) {
        return listP.contains(p);
    }

    @Override
    public boolean rechercherPatient(int cin) {
        for (Patient p :listP)
            if(p.getCin()==cin) return true;
        return false;
    }

    @Override
    public void afficherPatients() {
        for (Patient p :listP)
            System.out.println(p);
    }

    @Override
    public void trierPatientsParNom() {
        Collections.sort(listP,new TriePatientsParNom());
    }
}
