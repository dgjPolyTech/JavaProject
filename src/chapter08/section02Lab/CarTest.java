package chapter08.section02Lab;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SportsCar sp = new SportsCar();
        sp.setName("스포츠카");
        
        SchoolBus sb = new SchoolBus();
        sb.setName("스쿨버스");

        while(true){
            System.out.print("가속할 속도: ");
            int speed = sc.nextInt();

            if(speed <= 0){
                System.out.println("종료합니다.");
                break;
            }

            sp.setSpeed(speed);
            sb.setSpeed(speed);

            System.out.println("** "+sp.getName() + "의 속력: "+sp.getSpeed());
            System.out.println("** "+sb.getName() + "의 속력: "+sb.getSpeed());
        }

    }
}
