package Menu;

import User.DbConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Meals extends Food {

    public Meals() {

    }

    @Override
    public boolean addFood(String foodName, int price, int REGprice, int LGprice) {

        String query = "INSERT INTO meals(MealName,Price) VALUES (?,?)";
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setString(1, foodName);
            statement.setInt(2, price);
            int affectedRows = statement.executeUpdate(); //executeUpdate() returns integer
            if (affectedRows > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean removeFood(String foodName) {

        String query = "DELETE from meals WHERE MealName= ?";
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setString(1, foodName);
            int rs = statement.executeUpdate();
            if (rs > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updatePrice(String foodName, int price, int LGprice, int REGprice) {

        String query = "UPDATE meals SET Price=? WHERE MealName=?";

        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setString(2, foodName);
            statement.setInt(1, price);
            int rs = statement.executeUpdate();
            if (rs > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<String[]> showMenu() {

        String query = "SELECT * FROM meals";
        List<String[]> info = new ArrayList<>();
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                String price = String.valueOf(resultSet.getInt(2));
                String data[] = {name, price};
                info.add(data);
            }
        } catch (Exception e) {
            return null;
        }
        return info;
    }

}
