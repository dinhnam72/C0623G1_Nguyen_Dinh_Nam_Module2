package ss12_java_collection.repository;

import ss12_java_collection.model.Fruit;

import java.util.Map;

public interface IFruitRepo {
    Map<String,Fruit> getAll();
    boolean checkKey(String key);
    void addFruit(String key,Fruit fruit);
    void removeFruit (String key);
    void editFruit (String key, Fruit fruit);
}
