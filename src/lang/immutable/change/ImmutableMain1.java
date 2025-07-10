package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmuutableObj obj1 = new ImmuutableObj(10);
        ImmuutableObj obj2 = obj1.add(20);

        //기존값 신규값 모두 확인가능
        System.out.println("obj 1 = " + obj1.getValue());
        System.out.println("obj 2 = " + obj2.getValue());
    }
}
