package User;

import java.sql.*;

public class  Admin {

    public boolean login(String id, String pass) {
        try {
            String query = "SELECT * FROM admininfo";
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                if (id.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean updateLoginIfo(String id, String pass) {
        try {
            String query = "UPDATE admininfo SET adminMail=?,password=? WHERE adminMail=?";
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setString(1, id);
            statement.setString(2, pass);
            statement.setString(3, id);
            int rs = statement.executeUpdate();
            if (rs > 0) {

                return true;

            } else {
                return false;
            }
        } catch (SQLException e) {
        }
        return false;
    }
}
