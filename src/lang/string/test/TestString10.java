package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruts = fruits.split(",");
        String apple = fruts[0];
        String banana  =fruts[1];
        String mango = fruts[2] ;
        String joinedString = fruts[0] + "->" + fruts[1] + "->" + fruts[2];

        System.out.println("apple = " + apple);
        System.out.println("banana = " + banana);
        System.out.println("mango = " + mango);
        System.out.println("joinedString = " + joinedString);

        for(String fruit : fruts){
            System.out.println(fruit);
        }
        String joined = String.join("->",fruits);
        System.out.println("joined = " + joined);
    }
}
