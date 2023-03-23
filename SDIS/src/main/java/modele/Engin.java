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
public class Engin {
    private int enginId;
    private String enginNom;
    private ArrayList<Situation>Situations;
    public Engin() {
    }

    public Engin(int enginId, String enginNom) {
        this.enginId = enginId;
        this.enginNom = enginNom;
    }

    public ArrayList<Situation> getSituations() {
        return Situations;
    }

    public int getEnginId() {
        return enginId;
    }

    public void setEnginId(int enginId) {
        this.enginId = enginId;
    }

    public String getEnginNom() {
        return enginNom;
    }

    public void setSituations(ArrayList<Situation> Situations) {
        this.Situations = Situations;
    }

    public void setEnginNom(String enginNom) {
        this.enginNom = enginNom;
    }
        public void addUnSituation (Situation pUneSituation){
            if (Situations == null){
                Situations = new ArrayList<Situation>();
            }
            Situations.add(pUneSituation);
    }
    
}
