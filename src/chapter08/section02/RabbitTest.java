package chapter08.section02;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit h1 = new HouseRabbit();
        MountainRabbit m1 = new MountainRabbit();

        h1.ownerName = "오폴리";
        h1.shape = "그라미";
        h1.move(50, 100);
        h1.eatFeed();

        m1.mountainName = "폴리산";
        m1.shape = "네모";
        m1.move(200, 700);
        m1.eatWildGlass();
    }
}
