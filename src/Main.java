import org.w3c.dom.css.Counter;

public class Main {

    public static void main(String[] args) {
        Counter1 c = new Counter1(-1);
        c.count();
        c.count();
        c.count();
        c.count();
        c.count();
        System.out.println("---------------");
        System.out.println(c.getValue());
    }
}