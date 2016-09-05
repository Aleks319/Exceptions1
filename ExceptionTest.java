package Lesson3;

import java.util.Scanner;

public class ExceptionTest {
    //StringIndexOutOfBoundsException   and   NumberFormatException
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your string: ");
        String s = sc.nextLine();
        System.out.println("Your string: " + s);

        System.out.println("Input some number of character in your string: ");
        boolean b = true;
        int i = trueInteger(s, sc);
        while (b) {
            try {
                System.out.println("Character in your string: " + s.charAt(i));
                b = false;
            } catch (StringIndexOutOfBoundsException ex) {
                System.out.println("StringIndexOutOfBoundsException: index must be intrger from 0 to " + (s.length() - 1) + "!");
                System.out.println("Try again: ");
                i = trueInteger(s, sc);
            }
        }
    }

    public static int trueInteger(String s, Scanner sc) {
        boolean b = true;
        int result = 0;
        while (b) {
            try {
                result = Integer.parseInt(sc.nextLine());
                b = false;
            } catch (NumberFormatException nex) {
                System.out.println("NumberFormatException: you must put only intrger from 0 to " + (s.length() - 1) + "!");
                System.out.println("Try again: ");
            }
        }
        return result;
    }
}