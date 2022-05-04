package lection.p2_race_condition;

public class SynchCounter {
    private int c;
    public int value() {return c;}
    public SynchCounter(){c=0;}
    public synchronized  void dec(){c--;}
    public synchronized void inc(){c++; }
}
