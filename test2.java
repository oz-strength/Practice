import java.util.Scanner;

public class test2 {
        // 플레이어 2명중 첫 엔터를 누르고 다음 엔터를 누를 때까지의 시간이
    // 10초에 가까운 사람이 승리 하는 게임
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("첫번째 사람: ");
        String player1 = k.next();

        k.nextLine();
        System.out.println(player1 + " >> 준비가 되면 <ENTER>키를 누르세요");
        k.nextLine();
        long a = System.currentTimeMillis();

        System.out.println(player1 + " >> 10초가 된 것 같다면 <ENTER>키를 누르세요");
        k.nextLine();
        long b = System.currentTimeMillis();

//        System.out.println((double)a/1000);
//        System.out.println((double)b/1000);
        double player1Count = (b - a)/1000;
        System.out.println("player1의 엔터입력간 시간 : " + player1Count);

        double player1Result = Math.abs(10 - player1Count);
        System.out.println("player1의 10초와의 차이값 : " + player1Result);

        System.out.println("두번째 사람: ");
        String player2 = k.next();

        k.nextLine();
        System.out.println(player2 + " >> 준비가 되면 <ENTER>키를 누르세요");
        k.nextLine();
        long c = System.currentTimeMillis();

        System.out.println(player2 + " >> 10초가 된 것 같다면 <ENTER>키를 누르세요");
        k.nextLine();
        long d = System.currentTimeMillis();

//        System.out.println((double)a/1000);
//        System.out.println((double)b/1000);
        double player2Count = (d - c)/1000;
        System.out.println("player2의 엔터입력간 시간 : " + player2Count);

        double player2Result = Math.abs(10 - player2Count);
        System.out.println("player2의 10초와의 차이값 : " + player2Result);

        if (player1Result > player2Result) {
            System.out.println("player2가" + Math.abs(player1Result - player2Result) + "초 차이로 승리");
        } else if(player1Result < player2Result){
            System.out.println("player1이" + Math.abs(player1Result - player2Result) + "초 차이로 승리");
        } else {
            System.out.println("비겼습니다!!");
        }

    }
}
