package chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class pcRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== pc방 출입시간 제한 ====");
        System.out.print("* 출생년도 입력(4자리 정수로):");

        int birthYear = sc.nextInt();

        Calendar cal = Calendar.getInstance(); // Calender.getInstance
        int nowYear = cal.get(Calendar.YEAR);// 현재 년도를 반환 받음
        String resultStr;

        if(nowYear - birthYear >= 18) {
           resultStr = "즐거운 시간 보내세요 ^^";
        }
        else {
            resultStr = "집에 갈 시간입니다.";
        }
        System.out.println("귀하는 "+(nowYear - birthYear)+"세 이므로, "+resultStr);
        System.out.println("협조 감사합니다.");
        sc.close();
    }
}
