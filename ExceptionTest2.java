package Lesson3;

import java.lang.reflect.Array;

public class ExceptionTest2 {
    public static void main(String[] args) {

        //ArithmeticException:
     int x = 1000000;
     int y = 5500000;
     String s = null;
        try {
            System.out.println(Math.multiplyExact(x, y));
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: integer overflow");
        }


        //IllegalArgumentException:
        try {
            System.out.println(Array.getLength(y));
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException: Argument is not an array");
        }


        //NullPointerException:
        try {
            System.out.println(s.getBytes());
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException: string is null");
        }

    }
}