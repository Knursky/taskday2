package task5and6;

import java.util.ArrayList;

public class Summing {

    public int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
