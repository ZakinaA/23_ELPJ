/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import static DAO.PompierDAO.rs;
import bddUtil.ConnexionBdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.Caserne;
import modele.Grade;
import modele.Pompier;
/**
 *
 * @author paul.cuquemelle
 */
public class ConnexionUserDAO {
        static Connection cnx=null;
        static PreparedStatement requete=null;
        static ResultSet rs=null;

    public static Pompier getLogin(Connection cnx, String POM_username, String POM_password ) {
        //int nbcompte = 0 ;
        // instancier un pompier
        Pompier unPompier = new Pompier();
        try {
            requete = cnx.prepareStatement("SELECT * FROM POMPIER, CASERNE, GRADE WHERE POM_CODE_OCCUPE=GRA_CODE and POM_ID_ASSIGNIE=CAS_ID and  POM_username=? and POM_mdp = ?");
            requete.setString(1, POM_username);
            requete.setString(2, POM_password);
            
            ResultSet rs = requete.executeQuery();
                if (rs.next()) {
                    
                    //hydrater le pompier
                
                unPompier.setId(rs.getInt("POM_ID"));
                unPompier.setNom(rs.getString("POM_NOM"));
                unPompier.setPrenom(rs.getString("POM_Prenom"));
                unPompier.setDateNaissance(rs.getString("POM_DATENAISSANCE"));
                unPompier.setRole(rs.getString("POM_role"));

                Caserne uneCaserne= new Caserne();
                uneCaserne.setCasNom(rs.getString("CAS_NOM"));
                uneCaserne.setCasAdrs(rs.getString("CAS_ADRESSE"));
                uneCaserne.setCasCP(rs.getString("CAS_CP"));
                uneCaserne.setCasId(rs.getInt("CAS_ID"));
                uneCaserne.setCasVille(rs.getString("CAS_VILLE"));
                unPompier.setCaserne(uneCaserne);

                Grade unGrade = new Grade();
                unGrade.setCode(rs.getString("GRA_CODE"));
                unGrade.setLibelle(rs.getString("GRA_LIBELLE"));
                unPompier.setGrade(unGrade);
                    
                   return unPompier;
                }else{
                    return null;
                }                    
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("+Erreur lors de la connexion à la base de données : " + e.getMessage());
            return null;
        }
        
    }
}