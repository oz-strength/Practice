import java.util.Random;
import java.util.Scanner;

public class practice1 {

    // 거스름돈 환전 프로그램
    // 함수 사용

    // <입력>
    // 구매한 물건 가격 : 35000
    // 낸 돈 : 20000

    // 거스름돈 : 15000을
    // 50000 : 0
    // 10000 : 1
    // 5000 : 1
    // 1000 : 0
    // 500 : 0
    // 100: 0
    // 50 : 0
    // 10 : 0
    // => 0개짜리는 출력 x

    // 물건 값 랜덤하게 생성하는 함수
    public static int itemPrice() {
        Random r = new Random();
        int itemPrice = 0;
        itemPrice = r.nextInt(100000) + 1;
        System.out.printf("물건값은 : %,d 입니다.\n", itemPrice);
        return itemPrice;
    }

    // 돈을 내는 함수
    public static int payMoney(int itemPrice) {
        Scanner k = new Scanner(System.in);
        int userMoney = 0;
        System.out.print("값을 지불하세요: ");
        userMoney = k.nextInt();
//        if (userMoney < itemPrice) {
//            System.out.println("금액이 부족합니다!! 다시 입력하세요: ");
//            payMoney(itemPrice); // if문 안에 함수 재실행하면 userMoney에 저장되는 값이 처음의 입력값을 유지하는데 이유가 뭔지 모르겠다.
//        }
        if (userMoney < itemPrice) {
            System.out.println("금액이 부족합니다!! 다시 입력하세요: ");
        }
        return userMoney < itemPrice ? payMoney(itemPrice) : userMoney;  // else { return userMoney;}   *else로 userMoney 리턴하면 왜 안되는지??
    }

    // 거슬러주는 함수
    public static void payBack(int itemPrice, int userMoney) {
        int change = 0;
        change = userMoney - itemPrice;
        System.out.println("거스름돈 총액: " + change);
        // 50000원 10000원 5000원 1000원 500원 100원 50원 10원 1원
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] result = new int[9];
        for (int i = 0; i < money.length; i++) {
            result[i] = change / money[i];
            if (result[i] != 0) {
                change = change % money[i];
            } else if (result[i] == 0) {
                change = change;
            }
        }
        System.out.println("화폐 단위 별 거스름돈");
        System.out.println("====================");
        for (int i = 0; i < result.length; i++) {
            System.out.println(money[i] + " : " + result[i]);
        }
    }

    // 위의 과정들을 실행시켜 줄 함수
    public static void start() {
        int itemPrice = 0;
        int userMoney = 0;
        System.out.println("=== 물건 값을 생성합니다 ===\n");
        itemPrice = itemPrice(); // 리턴값을 저장해줘야 하는데 까먹고 자꾸 안하다가 오류떠서 고생한다.
        userMoney = payMoney(itemPrice);
        System.out.println("지불한 금액: " + userMoney);
        payBack(itemPrice, userMoney);

    }

    public static void main(String[] args) {
        start();
    }


}
