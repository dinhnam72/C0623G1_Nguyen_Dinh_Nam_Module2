package ss10_list.repository;

import ss10_list.model.Fruit;

import java.util.List;

public interface IFruitRepo {
    List<Fruit> getAll();
    void add(Fruit fruit);
}
