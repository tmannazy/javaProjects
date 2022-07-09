package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY));

//        Function<Person, String> personStringFunction = person -> (person.name);
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;
//
//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(length)
////                .collect(Collectors.toSet())
//                .forEach(println);

        Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);

        long count = people.stream()
                .map(person -> FEMALE.equals(person.gender))
//                        person.gender.equals(FEMALE))
                .count();
        System.out.println(count);


    }


    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                   "name='" + name + '\'' +
                   ", gender=" + gender +
                   '}';
        }
    }
}
