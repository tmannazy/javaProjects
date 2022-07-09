package di;

public interface Walk {
    void walk();

    default void run() {
        System.out.println("I am running");
    }
}
