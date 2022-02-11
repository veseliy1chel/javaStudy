import barrier.Barrier;
import barrier.Threadmill;
import barrier.Wall;
import members.*;
import members.Runnable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Activities> list = new ArrayList<>();
        list.add(new Cat("cat",140,100));
        list.add(new Robot("robot",100,200));
        list.add(new Human("Human",300,150));
        list.add(new Human("superman",1000,10000));
        list.add(new Cat("tiger",400,1000));
        List<Barrier>barrier = new ArrayList();
        barrier.add(new Wall(50));
        barrier.add(new Threadmill(20));
        barrier.add(new Wall(100));
        barrier.add(new Threadmill(100));
        barrier.add(new Wall(500));
        barrier.add(new Threadmill(500));

        for(Barrier barriers:barrier){
            for(Activities member:list){
                if(member.isCanTakePart()) barriers.takePart(member);
            }
        }
    }
}
