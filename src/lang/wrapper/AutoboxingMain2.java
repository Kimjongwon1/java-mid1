package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토 박싱
        System.out.println("boxedValue = " + boxedValue);

        //Wrapper -> Primitive
        int unBoxedBValue = boxedValue; //오토 언박싱
        System.out.println("unBoxedBValue = " + unBoxedBValue);

    }
}
