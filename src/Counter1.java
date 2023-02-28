public class Counter1 {
    private int value;
    public Counter1() {

    }
    public Counter1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void count(){
        if (value < 0) {
            value = 0;
        }
        value++;
        System.out.println(value);
    }
}
