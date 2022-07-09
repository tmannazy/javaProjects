package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementByOneFunction =
            number -> ++number;

    public static void main(String[] args) {
//        Function takes one argument and produces result
        int increment = incrementByOne(2);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(3);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

//        BiFunction takes 2 argument and produces 1 result
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );

        System.out.println(
                incrementByOneAndMultiplyFunction.apply(4,100)
        );
    }


    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;
    static int incrementByOne(int number) {
        return number + 1;
    }

   static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
