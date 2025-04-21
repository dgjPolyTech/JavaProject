package chapter05;

import java.util.Scanner;

public class rockSicPap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나의 가위/바위/보 ==> ");
        String myHands = sc.nextLine();

        String[] hands = {"가위", "바위", "보"};
        int rnd = (int) (Math.random() * hands.length);
        // Math.random의 값은 0.0~1.0 미만의 값을 double 실수형 반환함.
        // 하지만 값을 int 형으로 받으므로, 소수점 없이 0~2 사이의 값 반환됨.
        // 이때, (Math.random() * hands.length) 라고 적어야 먼저 값을 연산한 후 int형으로 변환하게 됨.
        String comHands = hands[rnd];

        if(myHands.equals("가위")){
            if(comHands.equals("가위")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("비겼습니다.");
            }

            if(comHands.equals("바위")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("졌습니다...");
            }

            if(comHands.equals("보")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("이겼습니다. ^^");
            }
        }

        else if(myHands.equals("바위")){
            if(comHands.equals("가위")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("이겼습니다.^^");
            }

            if(comHands.equals("바위")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("비겼습니다.");
            }

            if(comHands.equals("보")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("졌습니다...");
            }
        }

        else if(myHands.equals("보")){
            if(comHands.equals("가위")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("졌습니다...");
            }

            if(comHands.equals("바위")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("이겼습니다.^^");
            }

            if(comHands.equals("보")) {
                System.out.println("나: "+myHands+"/컴: "+comHands);
                System.out.println("비겼습니다.");
            }
        }

        else{
            System.out.println("가위/바위/보 중 하나를 입력해주십시오.");
        }
        sc.close();
    }
}
