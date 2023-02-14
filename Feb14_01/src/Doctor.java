public class Doctor {
    public static void callP () {
        System.out.println("환자분 들어오세요");
    }

    public double askHeight(Patient p){
        System.out.println("키가 어떻게 되시나요?");
        return p.answerH();
    }

    public double askWeight(Patient p){
        System.out.println("몸무게가 어떻게 되시나요?");
        return p.answerW();
    }

    public void printInfo(Patient p){
        System.out.println("환자분 키: " + p.height);
        System.out.println("환자분 몸무게: " + p.weight);
    }
    public void printP(Patient p){
        callP();
        askHeight(p);
        askWeight(p);
        printInfo(p);
    }
}
