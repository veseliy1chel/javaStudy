package members;

public class Cat implements Activities {
    private String name;
    private int maxJumpLimit;
    private int maxRunLimit;
    private boolean canTakePart;

    public Cat(String name, int maxJumpLimit, int maxRunLimit) {
        this.name = name;
        this.maxJumpLimit = maxJumpLimit;
        this.maxRunLimit = maxRunLimit;
        this.canTakePart=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxJumpLimit() {
        return maxJumpLimit;
    }

    public void setMaxJumpLimit(int maxJumpLimit) {
        this.maxJumpLimit = maxJumpLimit;
    }

    public int getMaxRunLimit() {
        return maxRunLimit;
    }

    public void setMaxRunLimit(int maxRunLimit) {
        this.maxRunLimit = maxRunLimit;
    }

    public boolean isCanTakePart() {
        return canTakePart;
    }

    public void setCanTakePart(boolean canTakePart) {
        this.canTakePart = canTakePart;
    }

    @Override
    public void jump(int hight) {
        if(hight<maxJumpLimit)
            System.out.println("Cat "+name+" overcome this barrier");
        else{
            System.out.println("Cat "+name+" can`t jump this barrier");
            canTakePart=false;
        }
    }

    @Override
    public void run(int distance) {
        if(distance<maxRunLimit){
            System.out.println("Cat "+name+" overcome this running");
        }
        else{
            System.out.println("Cat "+name+" can`t overcome this barrier");
            canTakePart=false;
        }
    }
}
