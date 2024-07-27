package Practice;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(20);
        System.out.println(num);
    }
}
