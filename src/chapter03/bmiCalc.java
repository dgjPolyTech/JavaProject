package chapter03;
import java.util.Scanner;

public class bmiCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg, cm;
        double bmi;

        System.out.println("체중(kg): ");
        kg = sc.nextDouble();

        System.out.println("키(m): ");
        cm = sc.nextDouble();
        bmi = kg / Math.pow(cm/100, 2);

        System.out.println("당신의 체중은 "+kg+"이고, 키는 "+cm+"이므로 "+"bmi는 "+bmi+"입니다.");

        sc.close();
    }
}
