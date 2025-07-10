package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello","java","jvm","spring","jpa"};
        int p = 0;
        for(String i : arr){
            System.out.println("string = " + i);
            String k = i;
            System.out.println("k = " + k.length());
           p +=k.length();
            System.out.println("result = " +p);
        }

    }
}
