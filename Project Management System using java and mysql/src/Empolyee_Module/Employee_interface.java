/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empolyee_Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public interface Employee_interface {
   
    public abstract void UploadFinishedTasks();

    public abstract void EnterWork();

    public abstract void EndWork();

    public abstract void RequestVacation();

    public abstract void vacationstate();

    public abstract void viewpenalties();

    public abstract void MyTasks();

    public abstract void AssignedTask();

}
