package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);
        while (index>=0) {
            index = str.indexOf(key, index + 1);
            System.out.println("index = "  + index);
            count++;
        }
        System.out.println("count = " +count );
    }
}
