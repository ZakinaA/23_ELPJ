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
/**
 *
 * @author paul.cuquemelle
 */
public class ConnexionUserDAO {
        static Connection cnx=null;
        static PreparedStatement requete=null;
        static ResultSet rs=null;

    public static boolean GetLogin(Connection cnx, String POM_username, String POM_password ) {
        int nbcompte = 0 ;
        try {
            requete = cnx.prepareStatement("SELECT * FROM POMPIER WHERE POM_username=? and POM_mdp = ?");
            requete.setString(1, POM_username);
            requete.setString(2, POM_password);
            
            ResultSet rs = requete.executeQuery();
                if (rs.next()) {
                    nbcompte = 1;
                }
                ConnexionBdd.fermerConnexion(rs);
                ConnexionBdd.fermerConnexion(requete);
                if (nbcompte == 1){
                    return true;
                }
                else {
                    return false ;
                }
                
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("+Erreur lors de la connexion à la base de données : " + e.getMessage());
            return false;
        }
        
    }
}