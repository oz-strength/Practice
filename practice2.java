import java.util.Random;
import java.util.Scanner;

public class practice2 {

    // 가위바위보 게임 (함수 사용)
// 컴퓨터와 대결 형식!!
// 콘솔창에 1을 입력하면 가위
// 2를 입력시 바위
// 3을 입력시 보
// 컴퓨터와 가위바위보를 해서 한번 질 동안 몇 번 이겼는지 출력!

    // 게임을 시작하는 함수
    public static void startGame(){
        System.out.println("===게임을 시작합니다.===");
        System.out.println("1: 가위 | 2: 바위 | 3: 보");
        System.out.println("=======================");
    }

    // 플레이어의 숫자를 입력받는 함수
    public static int getPlayerNum(){
        Scanner k = new Scanner(System.in);
        System.out.println("플레이어는 숫자를 입력하세요");
        int player = k.nextInt();
        if (player == 1){
            System.out.println("플레이어: " + "가위");
        } else if (player == 2) {
            System.out.println("플레이어: " + "바위");
        } else {
            System.out.println("플레이어: " + "보");
        }
        if (player < 1 || player > 3){
            System.out.println("숫자를 잘 못 입력하였습니다.");
        }
        return player < 1 || player > 3 ? getPlayerNum() : player;
    }

    // 컴퓨터의 숫자를 생성하는 함수
    public static int getComNum(){
        Random r = new Random();
        int computer = 0;
        computer = r.nextInt(3)+1;
        return computer;
    }

    // 플레이어와 컴퓨터의 숫자를 비교하는 함수 = 이기거나 졌을경우를 리턴
    public static String compare(int player, int computer){
        if (computer == 1){
            System.out.println("컴퓨터: " + "가위");
        } else if (computer == 2) {
            System.out.println("컴퓨터: " + "바위");
        } else {
            System.out.println("컴퓨터: " + "보");
        }

        if (player + 1 == computer || player == computer + 2){
            return "패배";
        } else if (player == computer) {
            return "비김";
        } else {
            return "승리";
        }
    }

    // 이기거나 졌을 경우
    public static void winOrLose(String result){
        if (result.equals("패배")){
            System.out.println("패배하였습니다");
        }else if(result.equals("승리")){
            System.out.println("승리하였습니다");
        }else if(result.equals("비김")){
            System.out.println("비겼습니다");
        }
    }

    // 반복해서 게임을 실행할 함수
    public static void reGame(int player, int computer, String result){
        Scanner k = new Scanner(System.in);
        while (true){
            System.out.println("게임을 계속 진행하시겠습니까? (Y/N): ");
            String yesOrNo = k.next();
            if (yesOrNo.equals("Y") || yesOrNo.equals("y")){
                startGame();
                player = getPlayerNum();    // 자꾸 실수하는 부분이다. 함수를 실행시키는걸로 끝내면 처음 입력된 값이 그대로 들어가기 때문에 다시 변수에 담아줘야 한다.
                computer = getComNum();
                result = compare(player, computer);
                winOrLose(result);
            }else if (yesOrNo.equals("N") || yesOrNo.equals("n")){
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        startGame();
        int player = getPlayerNum();
        int computer = getComNum();
        String result = compare(player,computer);
        winOrLose(result);
        reGame(player, computer, result);

    }
}
