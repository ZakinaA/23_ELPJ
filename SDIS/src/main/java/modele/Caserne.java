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
public class Caserne {
    private int casId;
    private String casNom;
    private String casAdrs;
    private String casVille;
    private String casCP;
    private ArrayList<Engin> Engins; 
    
    public Caserne() {
    }

    public Caserne(int casId, String casNom, String casAdrs, String casVille, String casCP) {
        this.casId = casId;
        this.casNom = casNom;
        this.casAdrs = casAdrs;
        this.casVille = casVille;
        this.casCP = casCP;
    }


    public int getCasId() {
        return casId;
    }

    public void setCasId(int casId) {
        this.casId = casId;
    }

    public String getCasNom() {
        return casNom;
    }

    public void setCasNom(String casNom) {
        this.casNom = casNom;
    }

    public String getCasAdrs() {
        return casAdrs;
    }

    public void setCasAdrs(String casAdrs) {
        this.casAdrs = casAdrs;
    }

    public String getCasVille() {
        return casVille;
    }

    public ArrayList<Engin> getEngins() {
        return Engins;
    }

    public void setEngins(ArrayList<Engin> Engins) {
        this.Engins = Engins;
    }


    public void setCasVille(String casVille) {
        this.casVille = casVille;
    }

    public String getCasCP() {
        return casCP;
    }

    public void setCasCP(String casCP) {
        this.casCP = casCP;
    }
    public void addUnEngin (Engin pUnEngin){
            if (Engins == null){
                Engins = new ArrayList<Engin>();
            }
            Engins.add(pUnEngin);
             }
    
}
