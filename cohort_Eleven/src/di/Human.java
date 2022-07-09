package di;

public class Human {
    Walk walkInPidgin = new DorcasWalk(); // field injection

    public Human() {
    }

    public Human(Walk walkInPidgin) { // constructor injection
        this.walkInPidgin = walkInPidgin;
    }

    void walk() {
        walkInPidgin.walk();
    }

    public void setWalkInPidgin(Walk walkInPidgin) { // setter injection
        this.walkInPidgin = walkInPidgin;
    }
}
