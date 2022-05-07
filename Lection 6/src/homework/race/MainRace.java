package homework.race;

import homework.race.Car;
import homework.race.Race;
import homework.race.Road;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MainRace {
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(CARS_COUNT), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        CountDownLatch countFinish  = new CountDownLatch(cars.length);
        CountDownLatch countStart = new CountDownLatch(cars.length);
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10),countStart,countFinish);

        }

        for (int i = 0; i < cars.length; i++) {

            new Thread(cars[i]).start();

        }

        try{
            countStart.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            countFinish.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }


}

