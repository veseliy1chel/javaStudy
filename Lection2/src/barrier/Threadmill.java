package barrier;

import members.Activities;
import members.Runnable;

public class Threadmill implements Barrier {
    private int distance;

    public Threadmill(int distance){
        this.distance=distance;
    }

    public void takePart(Activities activities){
        activities.run(distance);
    }

}
