package enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price){
        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        }else {
            System.out.println(grade + "할인 상품 아님");
        }

        //10000 * (20/100)
        return price * discountPercent /100;
    }
}
