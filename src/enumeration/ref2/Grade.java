package enumeration.ref2;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);

    private final int discountPercent;

    //앞에 private 안적어도 됨
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
