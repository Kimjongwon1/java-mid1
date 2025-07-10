package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //밀리초를 읽는다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        //현재시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경변수를 읽는다.
        System.out.println("getEnv = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("java Version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h','e','l','l','o'};
        char[] copie = new char[5];
        System.arraycopy(originalArray,0,copie,0,copie.length);

        //배열 출력
        System.out.println("copie + " + copie);
        System.out.println("copie2 + " + Arrays.toString(copie));

        //프로그램 종료
        System.exit(0);
    }

}
