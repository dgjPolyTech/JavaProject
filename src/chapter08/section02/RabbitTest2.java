package chapter08.section02;

public class RabbitTest2 {
    public static void main(String[] args) {
        HouseRabbit h = new HouseRabbit(); // 이렇게 선언만 해 두어도, 생성자들이 실행됨.
        // new HouseRabbit(); <- 이런 식으로 new만 써서 실행도 가능함.
        new MountainRabbit();
    }
}
