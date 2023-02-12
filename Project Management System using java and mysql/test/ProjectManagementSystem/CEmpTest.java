/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProjectManagementSystem;

import Empolyee_Module.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author amr
 */
public class CEmpTest {
    
    public CEmpTest() {
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
     * Test of uploadtask method, of class CEmp.
     */
    @Test
    public void testUploadtask() throws Exception {
        System.out.println("uploadtask");
        Employee instance = new Employee();
        instance.UploadFinishedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Enter method, of class CEmp.
     */
    @Test
    public void testEnter() throws Exception {
        System.out.println("Enter");
        Employee instance = new Employee();
        instance.EnterWork();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Exit method, of class CEmp.
     */
    @Test
    public void testExit() throws Exception {
        System.out.println("Exit");
        Employee instance = new Employee();
        instance.EndWork();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestvacation method, of class CEmp.
     */
    @Test
    public void testRequestvacation() throws Exception {
        System.out.println("requestvacation");
        Employee instance = new Employee();
        instance.RequestVacation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vacationstate method, of class CEmp.
     */
    @Test
    public void testVacationstate() throws Exception {
        System.out.println("vacationstate");
        Employee instance = new Employee();
        instance.vacationstate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewpenalties method, of class CEmp.
     */
    @Test
    public void testViewpenalties() throws Exception {
        System.out.println("viewpenalties");
        Employee instance = new Employee();
        instance.viewpenalties();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mytask method, of class CEmp.
     */
    @Test
    public void testMytask() {
        System.out.println("mytask");
        Employee instance = new Employee();
        instance.MyTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignedTask method, of class CEmp.
     */
    @Test
    public void testAssignedTask() {
        System.out.println("assignedTask");
        Employee instance = new Employee();
        instance.AssignedTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
