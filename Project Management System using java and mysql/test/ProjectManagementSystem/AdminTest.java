/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProjectManagementSystem;

import Admin_Module.Admin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adduser method, of class Admin.
     */
    @Test
    public void testAdduser() {
        System.out.println("adduser");
        Admin instance = new Admin();
        instance.AddUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateuser method, of class Admin.
     */
    @Test
    public void testUpdateuser() {
        System.out.println("updateuser");
        Admin instance = new Admin();
        instance.UpdateUsers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Viewusers method, of class Admin.
     */
    @Test
    public void testViewusers() {
        System.out.println("Viewusers");
        Admin instance = new Admin();
        instance.Viewusers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Viewprojects method, of class Admin.
     */
    @Test
    public void testViewprojects() {
        System.out.println("Viewprojects");
        Admin instance = new Admin();
        instance.Viewprojects();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteuser method, of class Admin.
     */
    @Test
    public void testDeleteuser() {
        System.out.println("deleteuser");
        Admin instance = new Admin();
        instance.deleteuser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
