package chapter02;

import java.util.Scanner;

public class Lab02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("정수1 ==> ");
        num1 = sc.nextInt();
        System.out.print("정수2 ==> ");
        num2 = sc.nextInt();

        int resPlus = num1 + num2;
        int resMinus = num1 - num2;
        int resMultiply = num1 * num2;
        double resDivide = (double) num1 / num2;
        int resMod = num1 % num2;

        System.out.printf("%d+%d=%d\n", num1, num2, resPlus); //printf로도 쓸 수 있음.
        //System.out.println(num1+"+"+num2+"="+resPlus);
        System.out.println(num1+"-"+num2+"="+resMinus);
        System.out.println(num1+"x"+num2+"="+resMultiply);
        System.out.println(num1+"/"+num2+"="+resDivide); // 나눗셈은 실수형
        System.out.println(num1+"%"+num2+"="+resMod); // 나머지는 보통 mod라고 함.

        sc.close();
    }
}
