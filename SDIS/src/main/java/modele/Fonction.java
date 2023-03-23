/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author louna.constantinescu
 */
public class Fonction {
    
    private int Code;
    private String libelle; 
    private ArrayList<Pompier> lesPompiers;

    public Fonction() {
    }

    public Fonction(int Code, String libelle) {
        this.Code = Code;
        this.libelle = libelle;
    }

    public ArrayList<Pompier> getLesPompiers() {
        return lesPompiers;
    }

    public void setLesPompiers(ArrayList<Pompier> lesPompiers) {
        this.lesPompiers = lesPompiers;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public void addUnPompier(Pompier pUnPompier)
 	{
 		if (lesPompiers == null)
 	{
 		lesPompiers = new ArrayList<Pompier>();
 	}
 		lesPompiers.add(pUnPompier);
 	}
    
}
