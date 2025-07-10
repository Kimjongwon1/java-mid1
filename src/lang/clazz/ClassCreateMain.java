package lang.clazz;

public class ClassCreateMain {
//    Class<Hello> helloClass= Hello.class;
        public static void main(String[] args) throws Exception {
        Class helloClass= Hello.class;
//        Class helloClass2 = Class.forName("lang.clazz.Hello");
//        Object object =  (Hello)helloClass.getDeclaredConstructor().newInstance();
            Hello hello =(Hello)helloClass.getDeclaredConstructor().newInstance();
            String result = hello.Hello();
            System.out.println("hello = " + hello);
            System.out.println("result = " + result);
        }

}
