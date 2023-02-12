/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectManager_Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public interface Project_manager_interface {

   

    public abstract void Viewproject_prograss();

    public abstract void Pmrepots_to_team_manger();

    public abstract void Add_project();

    public abstract void view_attendance();

}
