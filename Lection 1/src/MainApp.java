import Animal.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger("Tiger`s",100,1000));
        animals.add(new HouseCat("Barsik",0,300));
        animals.add(new Dog("Rizhik",400,600));
        animals.add(new Dog("Crazy",4000,5000));
        animals.add(new HouseCat("Filya",1,20));

        for(Animal animal:animals){
            animal.run(300);
            animal.swim(299);
        }
        System.out.println("Count of all animal - "+Animal.count+"\nCat - "+Cat.count+"\nDog - "+Dog.count+"\nHouse cat - "+HouseCat.count+"\nTiger - "+Tiger.count);


    }
}
