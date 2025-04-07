package chapter03;

import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.println("====== 운전자 합격 조회 프로그램 ======");
        System.out.print("시험 점수를 입력하세요.: ");
        score = sc.nextInt();

        String result;

        if(score >= 70) {
            result = "합격";
        } else {
            result = "불합격";
        }

        System.out.println("현재 성적을 입력한 운전자는 "+result+"입니다.");
    }
}
