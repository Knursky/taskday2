package task8;

import java.util.Scanner;

public class dividedByZero {

    public static void main(String arg[]) {
        try {
            int firstNumber;
            int secondNumber;
            int result;

            Scanner scanner = new Scanner(System.in);
            System.out.print("pierwsza liczba ");
            firstNumber = scanner.nextInt();
            System.out.print("druga liczba");
            secondNumber = scanner.nextInt();

            result = firstNumber / secondNumber;

            System.out.println("wynik" + result);
        } catch (ArithmeticException e) {
            System.out.println("blad" + e.getMessage());
            System.out.println("blad " + e);
        }
    }

}