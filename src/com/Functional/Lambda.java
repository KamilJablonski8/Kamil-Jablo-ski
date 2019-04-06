package com.Functional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//public class Lambda {
//    public static void main(String[] args) {
//

//        public static void useLambdas () {
//            Supplier<Double> doubleSupplier = () -> 10.6;
//            System.out.println(doubleSupplier.get());
//
//            Consumer<String> stringConsumer = s -> System.out.println("stringConsumer1:" + s);
//            System.out.println();
//            stringConsumer.accept("lambda");
//
//            Predicate<String> stringPredicte = s -> {
//                if (s != null) {
//                    return s.length() > 10;
//                }
//                return false;
//            };
//            Predicate<String>stringPredicate = s -> s != null && s.length() > 10;
//            System.out.println(stringPredicte.test(null));
//            System.out.println(stringPredicte.test("abc"));
//            System.out.println(stringPredicte.test("kjasdkirudc"));
//
//            BiFunction<Integer, Integer, String>integerStringBiFunction = ((integer, integer2) -> String.valueOf(integer+integer2));
//            System.out.println(integerStringBiFunction.apply(5,7));
//        }
//
//    }
//
//}