
package TeamManager_Module;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public interface Team_manager_interface {

    
    public abstract void AcceptVacation();

    public abstract void RefuesVacation();

    public abstract void Empolyee_vaction();

    public abstract void CompleteTasks();

    public abstract void Assign_task_to_empolyee();

    public abstract void AssignedProject();

    public abstract void viewReports();

    public abstract void projectPrograss();

    public abstract void writePenalties();

}
