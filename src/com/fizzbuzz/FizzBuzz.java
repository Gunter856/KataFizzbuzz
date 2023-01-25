package com.fizzbuzz;

public class FizzBuzz {

    public String classify(int num) {

        // La 1ª condición comprueba si un número es divisible por 3 y 5 a la vez

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";


            // La 2ª condición comprueba si un número es divisible por 3
        } else if (num % 3 == 0) {
            return "Fizz";


            // La 3ª condición comprueba si un número es divisible por 5
        } else if (num % 5 == 0) {
            return "Buzz";

            // Y si no, el número que hemos introducido será devuelto por la salida estándar
        } else

            return String.valueOf(num);

    }
}
