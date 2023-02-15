public class Judge {
    String[] ruleBook = new String[]{" ", "가위", "바위", "보"};
    // 숫자를 입력했을때 스트링이 나오게 하는 방법, 어차피 1부터라서 처음 값을 비워두는게 포인트

    public void readRuleBook() {
        System.out.println("==============");
        for (int i = 1; i < ruleBook.length; i++) {
            System.out.printf("%d.%s\n", i, ruleBook[i]);
            System.out.println("====================");
        }
    }

    public int askAns(Maru m) {
        System.out.print("마루 뭐 낼래? : ");
        int maruAns = m.fire();
        if (!(maruAns >= 1 && maruAns <= 3)) {
            System.out.println("다시 입력해라");
        }
        // 어긋난 답을 했을 때 다시 입력하라고 출력해주는 방법
        return (maruAns >= 1 && maruAns <= 3) ? maruAns : askAns(m);
        // 삼항연산자를 통해 질문에 어긋난 답을 했을 때 다시 메소드를 실행시키는 방법
    }

    // 오버로딩....!!
    public int askAns(Brother b) {
        int broAns = b.fire();
        return broAns;
    }
// 누가 뭐 냈는지
    public void printHand(int broHand, int maruHand) {
        System.out.printf("마루는 %s\n", ruleBook[maruHand]);
        System.out.printf("동생은 %s\n", ruleBook[broHand]);
    }

    // 판정
    public boolean judgeWin(int maruHand, int broHand, Maru m) {
        int result = maruHand - broHand;
        if (result == 0) {
            System.out.println("비겼다!");
            m.draw++;
        } else if (result == -1 || result == 2) { 
            // 가위바위보 처음 낸사람이 다음 사람에게 지는 경우의 수를 
            // 차이로 비교하는게 굉장히 깔끔하다
            System.out.println("동생이 이겼다 !");
        } else {
            System.out.println("마루가 이겼다 !");
            m.win++;
        }
        return (result == -1 || result == 2);
    }

    public void sayMaruWin(Maru m) {
        System.out.printf("마루는 %d번 비겼고, %d개의 간식을 얻을거야 !\n", m.draw, m.win);
    }

    // 시작
    public void start(Maru m, Brother b) {
        readRuleBook();
        int maruHand = 0;
        int broHand = 0;
        while (true) {
            maruHand = askAns(m); // 결국 start 메소드에서 maruHand / broHand로 리턴값을 받아서
            broHand = askAns(b);    // printHand 메소드에서 매개변수로 쓸 수 있는 것이다.
            printHand(maruHand, broHand);
            System.out.println("====================");
            if (judgeWin(maruHand, broHand, m))
            // judgeWin(maruHand, broHand, m) 메소드를 불리언 타입으로
                //반환하여 if문을 구성
            {
                sayMaruWin(m);
                break;
            }
            System.out.println("====================");
        }

    }

}

