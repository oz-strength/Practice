public class Main {
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Patient p = new Patient();
//
//        d.printP(p);
        
        // 홀짝 맞추기 게임
        // 컴퓨터 vs 유저
        // 시작
        // 컴퓨터가 동전을 가지고 있고 (20개)
        // 컴퓨터가 유저한테 동전 중에서 몇개로 시작할지 물어보고
        //  유저가 답하고
        //  컴퓨터가 짤짤이 해서 
        //  유저한테 홀/짝 물어보고
        //  판정
        Computer c = new Computer();
        User u = new User();
        c.start(u);
    }
}