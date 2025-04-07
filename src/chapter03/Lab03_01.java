package chapter03;

import java.util.Scanner;

public class Lab03_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg, lb;

        System.out.print("파운드(lb)를 입력하세요.: ");
        lb = sc.nextInt();
        System.out.println((float) lb+"파운드(lb)는 "+(float)lb*0.453592+"킬로그램(kg)입니다.");

        System.out.print("킬로그램(kg)을 입력하세요.: ");
        kg = sc.nextInt();
        System.out.println((float) kg+"킬로그램(kg)는 "+(float)kg*2.204623+"파운드(lb)입니다.");

        sc.close();
    }
}
