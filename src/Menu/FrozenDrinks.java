package Menu;

import User.DbConnection;
import static User.DbConnection.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FrozenDrinks extends Food {

    public FrozenDrinks() {
        
    }

    @Override
    public boolean addFood(String foodName, int REGprice, int LGprice, int SMprice) {
        String query = "INSERT INTO frozendrinks(FrozenDrinksName,REGPrice,LGPrice) VALUES (?,?,?)";
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setString(1, foodName);
            statement.setInt(2, REGprice);
            statement.setInt(3, LGprice);
            int affectedRows = statement.executeUpdate();
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
        String query = "DELETE from frozendrinks WHERE FrozenDrinksName= ?";
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
    public boolean updatePrice(String foodName, int REGprice, int LGprice, int SMprice) {
        String query = "UPDATE frozendrinks SET REGPrice=?,LGPrice=? WHERE FrozenDrinksName=?";
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setInt(1, REGprice);
            statement.setInt(2, LGprice);
            statement.setString(3, foodName);
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

        String query = "SELECT * FROM frozendrinks";
        List<String[]> info = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString(1);

                String REGprice = String.valueOf(resultSet.getInt(2));
                String LGprice = String.valueOf(resultSet.getInt(3));
                String data[] = {name, REGprice, LGprice};
                info.add(data);
            }
        } catch (Exception e) {
            return null;
        }
        return info;
    }

}
