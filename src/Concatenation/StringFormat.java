package Concatenation;
//            `%s`: for strings
//            `%c`: for character
//        *   `%d`: for integers
//        *   `%f`: for floating-point numbers (double precision)
//        *   `%x` or `%X`: for hexadecimal values
//        *   `%b`: for boolean values (0 for false, 1 for true)
//        *   `%h`: for characters (e.g., `%c`)
//        *   `%n`: for a newline character

import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Kofi";
        String name1 = "Ama";
        int age = 25;
        int year = 2026;
        int age1 = 32;
        int agedifference = age1 - age;

        System.out.println(String.format("%s is %d years old in %d.%n %s will be %d older than %s.%n How old is %s? ",
                name, age,year,name1,agedifference,name,name1));
        Scanner answer = new Scanner(System.in);
        int userInput = answer.nextInt();
        if(userInput == age1)
            System.out.println("Congratulations");
        else System.out.println("wrong answer.");
    }

}

