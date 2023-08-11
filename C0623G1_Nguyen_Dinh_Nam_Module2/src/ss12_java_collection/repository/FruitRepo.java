package ss12_java_collection.repository;

import ss12_java_collection.model.Fruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitRepo implements IFruitRepo {
    Map<String, Fruit> fruitList = new HashMap<>();

    {
        fruitList.put("1", new Fruit("Dua", "A", "27/05/2020", "15/06/2020", "Viet Nam", 40000));
        fruitList.put("2", new Fruit("Chuoi", "B", "25/09/2019", "07/10/2019", "China", 20000));
        fruitList.put("3", new Fruit("Vai", "C", "15/06/2020", "15/07/2020", "Uc", 34678.4));
    }

    @Override
    public Map<String, Fruit> getAll() {

        return fruitList;
    }

    public boolean checkKey(String key) {
        for (String keys : fruitList.keySet()) {
            if (keys.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addFruit(String key, Fruit fruit) {
            fruitList.put(key, fruit);
    }

    @Override
    public void removeFruit(String key) {
            fruitList.remove(key);

    }

    @Override
    public void editFruit(String key, Fruit fruit) {
        fruitList.put(key, fruit);
    }
}
