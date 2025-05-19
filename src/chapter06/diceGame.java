package chapter06;

import java.util.Random;

public class diceGame {
    public static void main(String[] args) {
//        Random rnd = new Random();

        int count = 0;
        int num1, num2, num3;

        while(true){
            num1 = (int)(Math.random() * 6 + 1);
            num2 = (int)(Math.random() * 6 + 1);
            num3 = (int)(Math.random() * 6 + 1);
//            num1 = rnd.nextInt(6) + 1;
//            num2 = rnd.nextInt(6) + 1;
//            num3 = rnd.nextInt(6) + 1;
            count++;

            System.out.println(num1 + "||" + num2 + "||" + num3);
            
            if(num1 == num2 && num2 == num3) {
                System.out.print("잭팟! ");
                System.out.println(count+"회 반복");
                break;
            }
        }
    }
}
