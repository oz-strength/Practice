import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);


//        String str1 = k.next(); // 1. a a 를 입력 => 공백과 a 가 다음으로 넘어감
//        System.out.println("=======");
//        String str2 = k.nextLine(); // 2. 공백 a 가 넘어와서
//        System.out.println(str1);
//        System.out.println(str2); // 3. 공백 a 가 그대로 출력

        // nextLine전에 nextXXX메소드를 사용했다면 반드시 버퍼를 비워줘야 한다.
        String str1 = k.next();
        System.out.println("=======");
        k.nextLine();
        String str2 = k.nextLine();
        System.out.println(str1);
        System.out.println(str2);



    }
}
