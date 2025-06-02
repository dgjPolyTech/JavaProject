package chapter07.rabbit;

import java.util.Scanner;

public class RabbitMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit r1 = new Rabbit();

        while(true) {
            int x, y;
            System.out.print("토끼의 x좌표 입력: ");
            x = sc.nextInt();

            System.out.print("토끼의 y좌표 입력: ");
            y = sc.nextInt();

            r1.setPosition(x, y);
            //System.out.println("토끼의 현재 좌표는  ("+r1.getX()+", "+r1.getY()+")입니다.");
            r1.move();
        }
    }
}
