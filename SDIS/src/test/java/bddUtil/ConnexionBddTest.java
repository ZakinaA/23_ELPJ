/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bddUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paul.cuquemelle
 */
public class ConnexionBddTest {
    public static Connection con;
    public ConnexionBddTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        con = ConnexionBdd.ouvrirConnexion();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ouvrirConnexion method, of class ConnexionBdd.
     */
    @Test
    public void testOuvrirConnexion() {
        System.out.println("ouvrirConnexion");
        Connection expResult = null;
        Connection result = ConnexionBdd.ouvrirConnexion();
        assertEquals(expResult, result);

    }

    /**
     * Test of fermerConnexion method, of class ConnexionBdd.
     */
    @Test
    public void testFermerConnexion_ResultSet() {
        System.out.println("fermerConnexion");
        ResultSet rs = null;
        ConnexionBdd.fermerConnexion(rs);

    }

    /**
     * Test of fermerConnexion method, of class ConnexionBdd.
     */
    @Test
    public void testFermerConnexion_Statement() {
        System.out.println("fermerConnexion");
        Statement stmt = null;
        ConnexionBdd.fermerConnexion(stmt);

    }

    /**
     * Test of fermerConnexion method, of class ConnexionBdd.
     */
    @Test
    public void testFermerConnexion_Connection() {
        System.out.println("fermerConnexion");
        Connection con = null;
        ConnexionBdd.fermerConnexion(con);

    }
    
}
