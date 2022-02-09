package Animal;

public abstract class Cat extends Animal {
    public static int count;

    public Cat(String type, String name, int swimLimit, int runLimit) {
        super(type, name, swimLimit, runLimit);
        count++;
    }

}
