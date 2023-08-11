package ss10_list.repository;

import ss10_list.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRepo implements IFruitRepo {
    List<Fruit> fruitList= new ArrayList<>();

    {
        fruitList.add(new Fruit("Tao","A","25/04/2017","15/05/2017","Viet Nam",30000));
        fruitList.add(new Fruit("Chuoi","B","25/09/2019","07/10/2019","China",20000));
        fruitList.add(new Fruit("Vai","C","15/06/2020","15/07/2020","Uc",34678.4));
    }

    @Override
    public List<Fruit> getAll() {
        return fruitList;
    }

    @Override
    public void add(Fruit fruit) {
        fruitList.add(fruit);
    }
}
