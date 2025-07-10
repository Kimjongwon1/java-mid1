package lang.immutable.change;

public class ImmuutableObj {
    private final int value;

    public ImmuutableObj(int value){
        this.value = value;
    }

    public ImmuutableObj add(int addValue){
        int result = value + addValue;
        return new ImmuutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
