package chapter02;

import java.util.Scanner;

public class Lab02_01 {
    public static void main(String[] args) {
        String name, addr;
        double weight;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("## 택배보내기 입니다. 다음을 각각 입력하세요 ##");
        System.out.print("받는 사람 : ");
        name = sc2.nextLine();
        System.out.print("주소 : ");
        addr = sc2.nextLine();
        System.out.print("무게(g) : "); // 무게니까 double로 받기.
        weight = sc.nextDouble();

        System.out.println("** 받는 사람 ==> "+name + "님");
        System.out.println("** 주소 ==> "+addr);
        //배송비는 정수형으로 출력
        System.out.println("** 배송비 ==> "+(int)(weight*5)+"원");

        // close()를 안써도 오류는 안나지만, 써주는게 권장됨.
        // 그리고 close()를 안쓰면 파일이 안 만들어짐.
        sc.close();
        sc2.close();
    }
}
