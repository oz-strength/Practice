public class ParamTest {

    public int p1() {
        System.out.println("첫번째 수: ");
        return 1;
    }

    public int p2() {
        System.out.println("두번째 수: ");
        return 2;
    }

    public void takeParam(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ParamTest p = new ParamTest();
        int a = p.p1();
        int b = p.p2();
        p.takeParam(a,b);
    }
}
