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
public class Profession {
    
    private int Code;
    private String libelle;
    private String ville;
    private ArrayList<Volontaire> lesVolontaires;

    public Profession() {
    }

    public Profession(int Code, String libelle, String ville) {
        this.Code = Code;
        this.libelle = libelle;
        this.ville = ville;
    }

    public ArrayList<Volontaire> getLesVolontaires() {
        return lesVolontaires;
    }

    public void setLesVolontaires(ArrayList<Volontaire> lesVolontaires) {
        this.lesVolontaires = lesVolontaires;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
     public void addUnVolontaire(Volontaire pUnVolontaire)
 	{
 		if (lesVolontaires == null)
 	{
 		lesVolontaires = new ArrayList<Volontaire>();
 	}
 		lesVolontaires.add(pUnVolontaire);
 	}
}
