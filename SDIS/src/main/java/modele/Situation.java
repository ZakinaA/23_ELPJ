/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author paul.cuquemelle
 */
public class Situation {
    private int situId;
    private String situLibelle;
    private ArrayList<Intervention>Interventions;
    private ArrayList<Engin>Engins;
    public Situation() {
    }
    
    public Situation(int situId, String situLibelle) {
        this.situId = situId;
        this.situLibelle = situLibelle;
    }

    public ArrayList<Intervention> getInterventions() {
        return Interventions;
    }

    public ArrayList<Engin> getEngins() {
        return Engins;
    }
    
    public int getSituId() {
        return situId;
    }

    public void setSituId(int situId) {
        this.situId = situId;
    }

    public String getSituLibelle() {
        return situLibelle;
    }

    public void setSituLibelle(String situLibelle) {
        this.situLibelle = situLibelle;
    }

    public void setEngins(ArrayList<Engin> Engins) {
        this.Engins = Engins;
    }

    public void setInterventions(ArrayList<Intervention> Interventions) {
        this.Interventions = Interventions;
    }
    public void addUneIntervention (Intervention pUneIntervention){
            if (Interventions == null){
                Interventions = new ArrayList<Intervention>();
            }
            Interventions.add(pUneIntervention);
    }
        public void addUnEngin (Engin pUnEngin){
            if (Engins == null){
                Engins = new ArrayList<Engin>();
            }
            Engins.add(pUnEngin);
    }
}
