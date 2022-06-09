package src.InterfaceClass;

public class Main {
    public static void main(String... args) {
        Native tman = new Native("Emmanuel Anene", "SCNC11001", "Luminaries");
        Native amaka = new Native("Amaka C10", "SCNC10001", "Dekanorbs");
        System.out.println(tman.getCohortName());
        amaka.isEating();
        System.out.println(amaka.getEatStatus());
    }
}
