package com.nisum;

import java.util.Optional;

public class OptionalWithOrElseDemo {

    public static void main(String[] args) {

        //orElse() will always be executed if the Optional<T> is null or not.

        Optional<String> nonEmptyOptional = Optional.of("Vishwa Ratna");
        String value = nonEmptyOptional.orElse(iAmStillExecuted());

        System.out.println(value);

        //orElseGet() will only be executed when Optional<T> is null.

        Optional<String> emptyOptional = Optional.ofNullable(null);
        String value1 = emptyOptional.orElse(iAmstillExecuted());

        System.out.println(value1);

       /* Optional<String> nonEmptyOptional = Optional.of("Nisum");
        String value = nonEmptyOptional.orElseGet(()-> "I got executed");
        System.out.println(value);

        Optional<String> emptyOptional = Optional.ofNullable(null);
        String value1 = emptyOptional.orElseGet(()-> "I got executed");

        System.out.println(value1);*/
    }

    public static String iAmStillExecuted(){
        System.out.println("nonEmptyOptional is not NULL,still I am being executed");
        return "I got executed";
    }

    public static String iAmstillExecuted(){
        System.out.println("emptyOptional is NULL, I am being executed, it is normal as per dictionary");
        return "I got executed";
    }
}
