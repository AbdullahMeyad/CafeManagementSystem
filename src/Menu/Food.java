package Menu;

import java.util.*;

abstract public class Food {

    public Food() {
    }

    abstract public boolean addFood(String foodName, int SMprice, int REGprice, int LGprice);

    abstract public boolean removeFood(String foodName);

    abstract public boolean updatePrice(String foodName, int SMprice, int LGprice, int REGprice);

    abstract public List<String[]> showMenu();
}
