package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();;
        child.parentMehthod();

        //toString()은 Object 클래스의 메소드
        String string  = child.toString();
        System.out.println(string);

    }
}
