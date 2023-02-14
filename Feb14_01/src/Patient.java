import java.util.Scanner;

public class Patient {
    Scanner k = new Scanner(System.in);

    double height;
    double weight;
    public double answerH(){
        height = k.nextDouble();
        return height;
    }

    public double answerW(){
        weight = k.nextDouble();
        return weight;
    }

}
