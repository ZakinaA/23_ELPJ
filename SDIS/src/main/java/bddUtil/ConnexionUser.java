/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bddUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author paul.cuquemelle
 */
public class ConnexionUser {

    public static void main(String[] args) {
        String url = "jdbc:mysql://172.20.177.77/23ELPJ";
        String username = "ADM_ELPJ";
        String password = "mpElpj";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom d'utilisateur : ");
        String inputUsername = scanner.nextLine();

        System.out.print("Mot de passe : ");
        String inputPassword = scanner.nextLine();

        try {
            // Établir une connexion à la base de données
            Connection connection = DriverManager.getConnection(url, username, password);

            // Préparer une requête SQL pour récupérer le compte utilisateur correspondant
            String sql = "SELECT * FROM POMPIER WHERE POM_username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, inputUsername);

            // Exécuter la requête SQL et récupérer le résultat
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Vérifier le mot de passe
                String storedPassword = resultSet.getString("POM_mdp");
                if (inputPassword.equals(storedPassword)) {
                    System.out.println("Authentification réussie !");
                    
                } else {
                    System.out.println("Mot de passe incorrect !");
                }
            } else {
                System.out.println("Nom d'utilisateur incorrect !");
            }
                resultSet.close();
            
            // Fermer la connexion, le PreparedStatement et le ResultSet
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }

    }
}