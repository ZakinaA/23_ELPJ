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
public class Pompier {
    
    private int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private int numeroBip;
    private Grade grade;
    private ArrayList<Fonction> lesFonction;
    private ArrayList<Intervention> lesIntervention;
    public Caserne Caserne;

    public Pompier() {
    }

    
    public Pompier(int id, String nom, String prenom, String dateNaissance, int numeroBip) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroBip = numeroBip;
    }

    public Caserne getCaserne() {
        return Caserne;
    }

    public void setCaserne(Caserne Caserne) {
        this.Caserne = Caserne;
    }
    
    public ArrayList<Fonction> getLesFonction() {
        return lesFonction;
    }

    public void setLesFonction(ArrayList<Fonction> lesFonction) {
        this.lesFonction = lesFonction;
    }

    public ArrayList<Intervention> getLesIntervention() {
        return lesIntervention;
    }

    public void setLesIntervention(ArrayList<Intervention> lesIntervention) {
        this.lesIntervention = lesIntervention;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getNumeroBip() {
        return numeroBip;
    }

    public void setNumeroBip(int numeroBip) {
        this.numeroBip = numeroBip;
    }
     public void addUneFonction(Fonction pUneFonction)
 	{
 		if (lesFonction == null)
 	{
 		lesFonction = new ArrayList<Fonction>();
 	}
 		lesFonction.add(pUneFonction);
 	}
     
      public void addUneIntervention(Intervention pUneIntervention)
 	{
 		if (lesIntervention == null)
 	{
 		lesIntervention = new ArrayList<Intervention>();
 	}
 		lesIntervention.add(pUneIntervention);
 	}
}
