package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String origibnal = "      Hello Java     ";
        String trimmed = origibnal.trim();
        String trimmed2 = origibnal.strip();
        System.out.println("trimm = "  +trimmed);
        System.out.println("trimm = "  +trimmed2);
    }
}
