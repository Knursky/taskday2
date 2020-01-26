package task5and6;

import java.util.ArrayList;

public class Average {
    public static double avr(ArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum.doubleValue() / list.size();
    }
}

