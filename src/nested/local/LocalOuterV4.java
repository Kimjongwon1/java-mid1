package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;
    public Printer process(int paramVar){
        int localVar = 1; //지역 변수는 스택 영역 종료되는 순간 함께 제거

        class LocalPrinter implements Printer{
            int value = 0;


            @Override
            public void print(){
            System.out.println("value = " + value);

            //인스턴스는 지역 변수보다 더 오래 살아남는다.
            System.out.println("localVar = " + localVar);
            System.out.println("paramVar = " + paramVar);
            System.out.println("outInstanceVar = " + outInstanceVar);
        }
        }
        LocalPrinter localPrinter = new LocalPrinter();
//        만약 localVar 값을 변경한다면? 다시 캡쳐하는건지?
        //localVar = 10;
        paramVar =20;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
       Printer printer =  localOuter.process(2);
       //printer.pritn()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
       printer.print();
       //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
            
        }
    }
}
