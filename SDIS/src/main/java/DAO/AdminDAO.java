/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import bddUtil.ConnexionBdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Situation;

/**
 *
 * @author ts1sio
 */
public class AdminDAO {
    
    Connection cnt  =null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    
     public static ArrayList<Situation> getLesSituations(Connection cnt){
         
        ArrayList<Situation> lesSituations = new ArrayList<Situation>();
       //Situation uneSitu = new Situation();
        try{
            requete=cnt.prepareStatement("SELECT * FROM SITUATION");
            
            rs=requete.executeQuery();
            
        while ( rs.next() ){
            
            // instancier un esitation
            
            Situation uneSituation = new Situation();
            
            //hydrater chaque situation avec le rs
            
            uneSituation.setSituId(rs.getInt("SIT_ID"));
            uneSituation.setSituLibelle(rs.getString("SIT_LIBELLE"));
            
            // add la situation dans l'AL
           lesSituations.add(uneSituation);
           
            
        }
        ConnexionBdd.fermerConnexion(rs);
        ConnexionBdd.fermerConnexion(requete);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return lesSituations;
    }
    
}
