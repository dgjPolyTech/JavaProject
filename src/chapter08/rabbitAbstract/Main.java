package chapter08.rabbitAbstract;

public class Main {
    public static void main(String[] args) {
//        Rabbit r = new Rabbit(); // 추상 클래스는 new 연산자로 객체 생성할 수 없다.
        HouseRabbit r1 = new HouseRabbit();
        MountainRabbit r2 = new MountainRabbit();

        r1.move(10, 20);
        r2.move(15, 25);

        r2.run();

        r1.shape = "House";
        r2.shape = "Mountain";

        r1.eat("Grasses");
        r2.eat("Meat");
    }
}
