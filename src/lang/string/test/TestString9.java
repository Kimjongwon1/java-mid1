package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String Id = parts[0];
        String domain = parts[1];

        System.out.println("Id = " + Id);
        System.out.println("domain = " + domain);
    }
}
