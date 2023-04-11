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
import modele.Caserne;
import modele.Grade;
import modele.Intervention;
import modele.Pompier;

/**
 *
 * @author Paul.Cuquemelle et louna.Constantinescu
 */
public class PompierDAO {
    
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public static Pompier getPompierByID(Connection connection,int idPompier){
        Pompier pom = new Pompier();
        try{
            requete=connection.prepareStatement("SELECT * FROM POMPIER, GRADE, CASERNE  WHERE  POM_ID=?;");
            requete.setInt(1,idPompier);
            rs=requete.executeQuery();
            
        if ( rs.next() ){
            pom.setId(rs.getInt("POM_ID"));
            pom.setNom(rs.getString("POM_NOM"));
            pom.setPrenom(rs.getString("POM_Prenom"));
            pom.setDateNaissance(rs.getString("POM_DATENAISSANCE"));
            
            Caserne uneCaserne= new Caserne();
            uneCaserne.setCasNom(rs.getString("CAS_NOM"));
            uneCaserne.setCasAdrs(rs.getString("CAS_ADRESSE"));
            uneCaserne.setCasCP(rs.getString("CAS_CP"));
            uneCaserne.setCasId(rs.getInt("CAS_ID"));
            uneCaserne.setCasVille(rs.getString("CAS_VILLE"));
            pom.setCaserne(uneCaserne);
            
            Grade unGrade = new Grade();
            unGrade.setCode(rs.getString("GRA_CODE"));
            unGrade.setLibelle(rs.getString("GRA_LIBELLE"));
            pom.setGrade(unGrade);
            
        }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return pom;
    }
    
    public static ArrayList<Intervention> getMesIntervention(Connection connection,int idPompier){
    ArrayList<Intervention> mesIntervention = new ArrayList<Intervention>();
    try
    {
        requete=connection.prepareStatement("SELECT * FROM INTERVENTION, POMPIER, INTERVIENT WHERE  int_id=IN_ID_1 AND IN_ID=POM_ID  AND pom_id= ?");
        requete.setInt(1,idPompier);
        
        
        System.out.println("requete="+ requete);
        rs=requete.executeQuery();
        while (rs.next()){
            
            Pompier unPompier = new Pompier();
            unPompier.setId(rs.getInt("pom_id"));
            
            Intervention uneIntervention = new Intervention();
            uneIntervention.setInterId(rs.getInt("INT_ID"));
            uneIntervention.setInterDate(rs.getString("INT_DATE"));
            uneIntervention.setInterLieu(rs.getString("INT_LIEU"));
            uneIntervention.setInterHeureAppel(rs.getString("INT_HEUREAPPEL"));
            uneIntervention.setInterHeureArrive(rs.getString("INT_HEUREARRIVE"));
            uneIntervention.setInterDuree(rs.getString("INT_DUREE"));
            
            
            uneIntervention.setLePompier(unPompier);
            mesIntervention.add(uneIntervention); 
            
            
        }
        ConnexionBdd.fermerConnexion(rs);
        ConnexionBdd.fermerConnexion(requete);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return mesIntervention;
     }
  
}
