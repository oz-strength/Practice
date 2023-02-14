import java.util.Random;

public class Computer {
    int coin = 20;
    Random cpu = new Random();
    public int askHowManyCoin(User u) {
        System.out.println("몇개로 할래?(1~20)");
        coin = u.answerHowMnayCoin();
        if (coin < 1 || coin >= 21) {
            System.out.println("다시 입력하세요");
        }
        return (coin >= 1 && coin <= 20) ? coin : askHowManyCoin(u);
    }

    public int shakeCoin(int userCoin){  // userCoin? 이게 어떻게 coin이랑 같아진건지 ??
        return cpu.nextInt(userCoin)+1;
    }

    public String askHJ(User u) {
        System.out.print("홀? 짝? : ");
        String userAns = u.answerHJ();
        return (userAns.equals("홀") || userAns.equals("짝")) ? userAns : askHJ(u);
    }

    public String judgeCoin(int shakeCoin){
        return (shakeCoin % 2 == 0) ? "짝" : "홀";
    }

    public String getResult(String userAns, String comAns){
        return userAns.equals(comAns) ? "정답" : "오답";
    }

    public void printResult(int shakeCoin, String result){
        System.out.printf("동전은 %d개 뽑았고, %s이야!\n", shakeCoin, result);
    }

    public void start(User u){
        int userCoin = askHowManyCoin(u);
        int shakeCoin = shakeCoin(userCoin);
        String userAns = askHJ(u);
        String comAns = judgeCoin(shakeCoin);
        String result = getResult(userAns, comAns);
        printResult(shakeCoin, result);
    }
}
