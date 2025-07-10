package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1);
        int randomInt = random.nextInt();
        System.out.println("randomInt : "  +randomInt);

        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d
        System.out.println("randomDouble : " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위조회
        int randomRagne1 = random.nextInt(10); //0~9출력
        System.out.println("randomRagne1 = " + randomRagne1);
        int randomRange2 = random.nextInt(10)+1; //1~10까지
        System.out.println("randomRange2 = " + randomRange2);

    }
}
