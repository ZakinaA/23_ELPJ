/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sdis;

import bddUtil.ConnexionBdd;
import java.sql.Connection;
import java.util.ArrayList;
import modele.Pompier;
import modele.Profession;

/**
 *
 * @author paul.cuquemelle
 */
public class SDIS {

    public static void main(String[] args) {
        Connection  con=ConnexionBdd.ouvrirConnexion();
        
        Pompier p1 = DAO.PompierDAO.getPompierByID(con, 1);
        
        System.out.println("Nom: " + p1.getNom() + " prenom: "+ p1.getPrenom() + " " + p1.getCaserne().getCasNom() +" " + p1.getGrade().getLibelle() + " " + p1.getCaserne().getCasVille());
        
    }
    
    
}
