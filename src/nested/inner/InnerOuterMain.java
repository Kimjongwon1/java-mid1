package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 이거 단독으로 생성할수는 없고 바깥인스턴스에서 생성할수있다.
        inner.print();

        System.out.println("inner = " + inner.getClass());
    }
}
