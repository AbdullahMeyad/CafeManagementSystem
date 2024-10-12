package Menu;

import User.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Espresso extends Food {

    

    public Espresso() {
        
    }

    @Override
    public boolean addFood(String foodName, int SMprice, int LGprice, int REGprice) {
        String query = "INSERT INTO espresso(EspressoName,SMPrice,REGPrice,LGPrice) VALUES (?,?,?,?)";
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setString(1, foodName);
            statement.setInt(2, SMprice);
            statement.setInt(3, REGprice);
            statement.setInt(4, LGprice);
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
        String query = "DELETE from espresso WHERE EspressoName= ?";
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
    public boolean updatePrice(String foodName, int SMprice, int LGprice, int REGprice) {
        String query = "UPDATE espresso SET SMPrice=?,REGPrice=?,LGPrice=? WHERE EspressoName=?";
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            statement.setInt(1, SMprice);
            statement.setInt(2, REGprice);
            statement.setInt(3, LGprice);
            statement.setString(4, foodName);
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
        String query = "SELECT * FROM espresso";
        List<String[]> info=new ArrayList<>();
        try {
            PreparedStatement statement = DbConnection.connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name=resultSet.getString(1); 
                String SMprice=String.valueOf(resultSet.getInt(2));
                String REGprice=String.valueOf(resultSet.getInt(3));
                String LGprice=String.valueOf(resultSet.getInt(4));
                String data[]={name,SMprice,REGprice,LGprice};
                info.add(data);
                
            }
        } catch (Exception e) {
            return null;
        }
        return info;
    }
}
