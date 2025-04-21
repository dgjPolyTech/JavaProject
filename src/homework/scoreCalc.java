package homework;

import java.util.Scanner;

public class scoreCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cls1, cls2, cls3;
        float cls1_grade, cls2_grade, cls3_grade; // 이수 학점
        float cls1_score, cls2_score, cls3_score; // 성적 학점
        float total, avg;//평균 출력

        //과목명 셋 입력
        System.out.print("과목명 1: ");
        cls1 = sc.nextLine();
        System.out.print("과목명 2: ");
        cls2 = sc.nextLine();
        System.out.print("과목명 3: ");
        cls3 = sc.nextLine();

        //과목별 이수 학점/성적 학점을 입력
        System.out.print(cls1+"의 이수 학점: ");
        cls1_grade = sc.nextFloat();
        System.out.print(cls1+"의 성적 학점: ");
        cls1_score = sc.nextFloat();

        System.out.print(cls2+"의 이수 학점: ");
        cls2_grade = sc.nextFloat();
        System.out.print(cls2+"의 성적 학점: ");
        cls2_score = sc.nextFloat();

        System.out.print(cls3+"의 이수 학점: ");
        cls3_grade = sc.nextFloat();
        System.out.print(cls3+"의 성적 학점: ");
        cls3_score = sc.nextFloat();

        // 과목별 총점 계산 후, 6으로 나눠 평균값을 avg 변수에 입력
        total = (cls1_grade*cls1_score)+(cls2_grade*cls2_score)+(cls3_grade*cls3_score);
        avg = total/6;
        
        // 최종 평균값을 출력
        System.out.printf("평균 학점 : %.2f", avg);
    }
}
