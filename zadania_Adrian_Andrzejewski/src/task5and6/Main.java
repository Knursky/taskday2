package task5and6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Summing summing = new Summing();
        Average average = new Average();


        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("suma " +summing.sum(list));
        System.out.println("srednia " + Average.avr(list));

        list.add(10);

        System.out.println("suma " + summing.sum(list));
        System.out.println("srednia " + Average.avr(list));

    }
}
