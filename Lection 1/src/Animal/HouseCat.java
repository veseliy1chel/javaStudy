package Animal;

public class HouseCat extends Cat {
    public static int count;

    public HouseCat(String name, int swimLimit, int runLimit) {
        super("House Cat", name, swimLimit, runLimit);
        count++;
    }

    @Override
    public void swim(int distance) {
        System.out.println((0<distance&&distance<=swimLimit)?(type + " "+name+ " swim "+distance+" meter"):
                type+" "+name+" can`t swim this distance");
    }

    @Override
    public void run(int distance) {
        System.out.println((0<distance&&distance<=runLimit)?(type + " "+name+ " run "+distance+" meter"):
                type+" "+name+" can`t run this distance");
    }
}
