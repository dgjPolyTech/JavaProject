package chapter06;

import java.util.Scanner;

public class numQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int count = 0;
        int result = 0;
        for(int i = 1;i<=10;i++){
            result = (int)(Math.random() * 5 + 1);
            System.out.println("임의의 숫자를 생각했습니다. 맞혀보세요.");
            num = sc.nextInt();

            count++;

            if(num == result){
                System.out.println(count+"회 만에 문제를 맞히셨습니다!");
                break;
            } else {
                System.out.println("제가 생각한 숫자는 "+result+"였습니다! ");
            }
        }

//        while(true){
//            int result = (int)(Math.random() * 5 + 1);
//            System.out.println("임의의 숫자를 생각했습니다. 맞혀보세요.");
//            num = sc.nextInt();
//
//            count++;
//
//            if(num == result){
//                System.out.println(count+"회 만에 문제를 맞히셨습니다!");
//                break;
//            } else if(count >= 10) {
//                System.out.println("프로그램 종료.");
//            }
//        }
        sc.close();
    }
}
