package chapter07;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(); // 뒤에 new ~ 이렇게 붙는 걸 "생성자"라고 함.
        Car car2 = new Car(); // 지금처럼 아무 매개변수도 값을 안 넣는 생성자를 기본 생성자라 함.
        Car car3 = new Car();

        //ctrl+R 누르면 지정한 범위만 값을 바꿀 수 있음.
        car1.setName("아이오닉9");
        car1.setPrice(7000);
        car1.setProduct("현대");
        car1.setCc(3000);
        car1.setYear(2025);

        car2.setName("X7");
        car2.setPrice(15000);
        car2.setProduct("BMW");
        car2.setCc(3500);
        car2.setYear(2024);

        car3.setName("EV6");
        car3.setPrice(6000);
        car3.setProduct("기아");
        car3.setCc(2000);
        car3.setYear(2023);

        System.out.println(car1.toString()); // 그냥 쓰면 속성값이 아니라 주소값이 나온다.
        System.out.println(car2.toString()); // 아래는 클래스에서 toString을 오버라이드해서 원하는 값이 나온 것
        System.out.println(car3.toString());

        System.out.println(car1.getName() + "자동차가 ");
        car1.start();
        car1.drive(60);
        car1.foward();
        car1.stop();

        System.out.println("-----------------");

        System.out.println(car3.getName() + "자동차가 ");
        car3.start();
        car3.drive(30);
        car3.foward();
        car3.stop();
        car3.backgward();
        car3.stop();
    }
}
