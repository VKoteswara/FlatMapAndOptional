package com.nisum;

import java.util.Optional;

public class OptionalWithOrElseGetDemo {

    public static void main(String[] args) {
        //orElseGet() will only be executed when Optional<T> is null.

        /*Optional<String> nonEmptyOptional = Optional.of("Nisum");
        String value = nonEmptyOptional.orElseGet(()-> "I got executed");
        System.out.println(value);*/

        Optional<String> emptyOptional = Optional.ofNullable(null);
        String value1 = emptyOptional.orElseGet(()-> "I got executed");

        System.out.println(value1);
    }
}
