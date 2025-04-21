package chapter05;

import java.util.Scanner;

public class Code5_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== 학점 프로그램 ====");
        System.out.print("점수 입력 : ");

        int score = sc.nextInt();
        char rank;

        if(score >= 90){
            rank = 'A';
        }
        else if(score >= 80) {
            rank = 'B';
        }
        else if(score >= 70) {
            rank = 'C';
        }
        else if(score >= 60) {
            rank = 'D';
        }
        else{
            rank = 'F';
        }

        System.out.println(score+"점은 "+rank+"학점 입니다.");

        sc.close();
    }
}
