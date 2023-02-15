public class VariableTest {

    int a;
    int b;
    static int c;
    int add () {
        return a + b;
    }

    int add2() {
        return a + b + c;
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add3() {
        return (c + c);
    }

    public static void main(String[] args) {
        System.out.println(VariableTest.add(1, 2));
        System.out.println("==============");
        VariableTest v = new VariableTest();
        v.a = 10;
        v.b = 5;
        System.out.println(v.add());
        System.out.println("================");
        VariableTest.c = 25;
        System.out.println(c);
        System.out.println(add3());
    }
}
