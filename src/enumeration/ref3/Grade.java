package enumeration.ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30),VIP(40);

    private final int discountPercent;

    //앞에 private 안적어도 됨
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price){
        return price * discountPercent/100;
    }
}
