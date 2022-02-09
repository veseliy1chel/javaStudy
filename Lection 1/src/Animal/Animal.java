package Animal;

public abstract class Animal {
    public static int count=0;
    String type;
    String name;
    int swimLimit;
    int runLimit;

    public Animal(String type, String name, int swimLimit, int runLimit) {
        this.type = type;
        this.name = name;
        this.swimLimit = swimLimit;
        this.runLimit = runLimit;
        count++;
    }
    public abstract void swim(int distance);

    public abstract void run(int distance);
}
