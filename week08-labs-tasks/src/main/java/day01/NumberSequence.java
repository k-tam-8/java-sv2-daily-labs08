package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> numberList = new ArrayList<>();

    public NumberSequence(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public NumberSequence(int a, int b, int c) {
        Random rnd = new Random();
        for (int i = 0; i < a; i++) {
            numberList.add(rnd.nextInt(b, c+1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> returnList = new ArrayList<>();
        int ave = getAverage();
        for (int i : numberList) {
            if (Math.abs(i - value) < value) {
                returnList.add(i);
            }
        }
        return returnList;

    }

    public int getAverage() {
        int sum = 0;
        for (int i : numberList) {
            sum += i;
        }
        sum /= numberList.size();
        return sum;
    }
}
