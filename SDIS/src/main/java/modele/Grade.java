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
public class Grade {
    
    private String code;
    private String libelle;
    private ArrayList<Pompier> lesPompiers;

    public Grade() {
    }

    public Grade(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public ArrayList<Pompier> getLesPompiers() {
        return lesPompiers;
    }

    public void setLesPompiers(ArrayList<Pompier> lesPompiers) {
        this.lesPompiers = lesPompiers;
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
