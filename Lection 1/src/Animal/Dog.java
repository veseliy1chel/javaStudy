package Animal;

public class Dog extends Animal {
    public static int count;

    public Dog(String name, int swimLimit, int runLimit) {
        super("Dog", name, swimLimit, runLimit);
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
