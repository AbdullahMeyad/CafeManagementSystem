package Employee;

import java.sql.SQLException;
import java.util.*;

abstract public class Employee {

    public Employee() {
    }

    abstract public boolean addEmployee(String name, int age, String gender, String date, int sal, String post);

    abstract public boolean removeEmployee(int id) throws SQLException;

    abstract public boolean updateEmployee(String name, int id, int age, String gender, String date, int sal, String post) throws SQLException;

    abstract public List<String[]> showAllEmployee() throws SQLException;

    abstract public HashMap getEmployeeInfo(int id) throws SQLException;
}
