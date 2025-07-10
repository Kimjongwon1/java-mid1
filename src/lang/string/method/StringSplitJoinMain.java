package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";
        //split()
        String[] split = str.split(",");
        for (String string : split) {
            System.out.println(string);
        }

        String joinStr = "";
        for (String string : split) {
            joinStr += string + "-";
        }
        System.out.println("joinStr = " + joinStr);

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        //문자열 배열 연결
            String result = String.join("-", split);
        System.out.println("result = " + result);
    }
}
