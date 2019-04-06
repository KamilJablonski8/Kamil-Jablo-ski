package com.Functional;

import com.Stat.Math;

import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambdas2 {


    public static void main(String[] args) {
        //#1
        useLambdas();

        //#2
        useStreams();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
        Supplier<Double> doubleSupplier = () -> 10.6;
        System.out.println(doubleSupplier.get());

        Consumer<String> stringConsumer = s -> System.out.println("stringConsumer1:" + s);
        System.out.println();
        stringConsumer.accept("lambda");

        Predicate<String> stringPredicte = s -> {
            if (s != null) {
                return s.length() > 10;
            }
            return false;
        };
        Predicate<String> stringPredicate = s -> s != null && s.length() > 10;
        System.out.println(stringPredicte.test(null));
        System.out.println(stringPredicte.test("abc"));
        System.out.println(stringPredicte.test("kjasdkirudc"));

        BiFunction<Integer, Integer, String> integerStringBiFunction = ((integer, integer2) -> String.valueOf(integer + integer2));
        System.out.println(integerStringBiFunction.apply(5, 7));
    }

    private static void useOptional() {
        Optional<String> optional = Optional.ofNullable("test");
        System.out.println(optional.isPresent());
        optional.ifPresent(s -> System.out.println("ok"));
        System.out.println(optional.orElse(""));
    }

    /**
     * 3. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     * i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.1);
        doubleSet.add(2.2);
        doubleSet.add(3.3);

        Stream<Double> stream = doubleSet.stream();

        Double sum = stream.reduce(1.1, (d1, d2) -> d1 + d2);
        OptionalDouble avg = stream.mapToDouble(value -> value).average();
        System.out.println(sum);
        System.out.println(((OptionalDouble) avg).getAsDouble());

        IntStream.range(10, 40).filter(value ->  value % 2 !=0).sum();


    }
}