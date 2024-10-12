package Employee;

import User.DbConnection;
import java.sql.*;
import java.util.*;

public class FullTimeEmployee extends Employee {

    private int empId = 49401;
    

    public FullTimeEmployee() {
        
    }

    @Override
    public boolean addEmployee(String name, int age, String gender, String date, int sal, String post) {
        String query1 = "INSERT INTO ftemp(empId,empName,empAge,empGender,hireDate,empSalary,Post) VALUES(?,?,?,?,?,?,?)";
        String query2 = "SELECT * FROM ftemp";
        try {
            PreparedStatement statement1 = DbConnection.connection.prepareStatement(query2);
            ResultSet resultSet = statement1.executeQuery();
            while (resultSet.next()) {
                empId += 1;
            }
            PreparedStatement statement2 = DbConnection.connection.prepareStatement(query1);
            statement2.setInt(1, empId);
            statement2.setString(2, name);
            statement2.setInt(3, age);
            statement2.setString(4, gender);
            statement2.setString(5, date);
            statement2.setInt(6, sal);
            statement2.setString(7, post);
            int rs = statement2.executeUpdate();
            if (rs > 0) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    @Override
    public boolean removeEmployee(int id) throws SQLException {
        String query = "DELETE FROM ftemp WHERE empId= ?";
        PreparedStatement statement = DbConnection.connection.prepareStatement(query);
        statement.setInt(1, id);
        int rs = statement.executeUpdate();
        if (rs > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateEmployee(String name, int id, int age, String gender, String date, int sal, String post) throws SQLException {

        String query = "UPDATE ftemp SET empName=?,empAge=?,empGender=?,hireDate=?,empSalary=?,Post=? WHERE empId=?";
        PreparedStatement statement1 = DbConnection.connection.prepareStatement(query);
        statement1.setInt(7, id);

        statement1.setString(1, name);

        statement1.setInt(2, age);

        statement1.setString(3, gender);

        statement1.setString(4, date);

        statement1.setInt(5, sal);

        statement1.setString(6, post);
        int rs = statement1.executeUpdate();
        if (rs > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<String[]> showAllEmployee() throws SQLException {
        String query = "SELECT * FROM ftemp";
        PreparedStatement statement = DbConnection.connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        List<String[]> employees = new ArrayList<>();

        while (rs.next()) {
            String id = String.valueOf(rs.getInt(1));
            String name = rs.getString(2);
            String age = String.valueOf(rs.getInt(3));
            String gender = rs.getString(4);
            String date = rs.getString(5);
            String sal = String.valueOf(rs.getInt(6));
            String post = rs.getString(7);
            String[] info = {name, id, age, gender, date, sal, post};
            employees.add(info);
        }
        return employees;
    }

    @Override
    public HashMap getEmployeeInfo(int id) throws SQLException {
        String query = "SELECT * FROM ftemp WHERE empId=?";
        PreparedStatement statement = DbConnection.connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        HashMap<String, String> info = new HashMap<>();
        while (rs.next()) {
            if (rs.getInt(1) == id) {
                info.put("Name", rs.getString(2));
                info.put("ID", String.valueOf(rs.getInt(1)));
                info.put("Age", String.valueOf(rs.getInt(3)));
                info.put("Gender", rs.getString(4));
                info.put("HireDate", rs.getString(5));
                info.put("Salary", String.valueOf(rs.getInt(6)));
                info.put("Post", rs.getString(7));
                return info;
            }
        }

        return null;
    }
}
