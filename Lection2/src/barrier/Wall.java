package barrier;

import members.Activities;
import members.Jumpable;

public class Wall implements Barrier {
    private int wallHight;

    public Wall(int wallHight){
        this.wallHight=wallHight;
    }

    public void takePart(Activities jumpable){
        jumpable.jump(wallHight);
    }
}
