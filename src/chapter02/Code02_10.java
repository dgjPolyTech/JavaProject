package chapter02;

import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        // main 입력하고 tab으로 자동완성 시, public static void main 자동완성 됨.
        // Scanner만 입력해도 tab으로 자동완성 가능. import도 자동으로 됨.
        //System.in > System은 java의 lang 패키지 안에 있는 클래스로, import를 하지 않아도 자동으로 됨.
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in); //nextLine으로 문자열을 받을 것이므로, 스캐너를 따로 받음.

        int num1;
        System.out.print("정수값 입력 ==> ");
        num1 = s.nextInt();//입력값을 정수(int)로 받겠다는 의미.
        System.out.println("사용자가 입력한 값 ==> " + num1);

        double num2;
        System.out.print("실수값 입력 ==> ");
        num2 = s.nextDouble();
        System.out.println("사용자가 입력한 실수 값 ==> " + num2);

        String name;
        System.out.print("성명 입력 ==> ");
        name = s2.nextLine(); //s.nextLine();를 사용해도 됨.
        System.out.println("사용자가 입력한 성명 ==> " + name);
        
        // scanner가 더 이상 할 일이 없으면, 메모리를 먹지 않게 close로 닫아주기
        s.close();
        s2.close();
    }
}
