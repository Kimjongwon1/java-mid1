package lang.object.tostring;

public class ObjectPriinter {
    public static void print(Object obj){
        String string  = "객체 정보 출력 : " + obj.toString();
        System.out.println(string);
    }
}
