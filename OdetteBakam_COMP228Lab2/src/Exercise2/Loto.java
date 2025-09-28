package Exercise2;

import java.util.Random;

public class Loto {
    private final int[] ranNumbers;
    



    public Loto() {
        ranNumbers = new int[3];
        setRanNumbers();
    }

    //ranNumbers = new int[3];
    public void setRanNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            ranNumbers[i] = rand.nextInt(9) + 1; // 1 to 9
        }
    }

    public int[] getRanNumbers() {

        return ranNumbers;
    }


    public int getSum() {
        int sum = 0;
        for (int num : ranNumbers) {
            sum += num;
        }
        return sum;
    }
}