package Admin_Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public interface Admin_interface {


    public abstract void AddUsers();

    public abstract void UpdateUsers();

    public abstract void Viewusers();

    public abstract void Viewprojects();

    public abstract void deleteuser();

}
