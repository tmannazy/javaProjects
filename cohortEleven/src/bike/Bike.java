package bike;

public class Bike {
    private boolean bikePower;
    public void startBike(boolean status) {
        bikePower = status;
    }

    public boolean isBikeStarted() {
        return bikePower;
    }
}
