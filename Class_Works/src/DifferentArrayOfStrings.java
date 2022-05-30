package src;

public class DifferentArrayOfStrings {
    String color = "red";
    private void printColor(String color) {
        color = "purple";
        System.out.print(color);}

    public static void main(String[] args) {

        new DifferentArrayOfStrings().printColor("blue");
        System.out.print(Math.floor(5));
    }
}
