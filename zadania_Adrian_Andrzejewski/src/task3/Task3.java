package task3;

import java.util.Arrays;

public class Task3 {
    static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("wynik: " + Arrays.toString(array));
    }
}