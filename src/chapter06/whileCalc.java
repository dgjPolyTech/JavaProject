package chapter06;

import java.util.Scanner;

public class whileCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num1 = 0, num2 = 0;

        while(true){
            System.out.print("숫자1 ==> ");
            num1 = sc.nextInt();

            if(num1 == 0) {
                break;
            }

            System.out.print("숫자2 ==> ");
            num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.println(num1+" + "+num2+" = " + sum);
        }

        System.out.println("프로그램 종료");
        sc.close();
    }
}
