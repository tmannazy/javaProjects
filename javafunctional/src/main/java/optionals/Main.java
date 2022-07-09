package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<IllegalStateException> execption = () -> new IllegalStateException("execption");
//        Object value = Optional.ofNullable("Hello Fineboy")
//                .orElseThrow(execption);
//        Optional.ofNullable("Fineboy")
        Optional.ofNullable(null )
//                .ifPresent(System.out::println);
//                .ifPresent(email -> System.out.println("Sending email to " + email));
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        ()-> System.out.println("Cannot send email"));


//        System.out.println(value);
    }
}
