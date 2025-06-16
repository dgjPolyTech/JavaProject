package chapter08.section02;

public class MountainRabbit extends Rabbit {
    String mountainName; // 토끼가 사는 산의 이름.

    public MountainRabbit() {
        System.out.println("MountainRabbit의 생성자가 실행됨");
    }

    void eatWildGlass() {
        System.out.println("산토끼는 풀을 먹는다.");
    }
}
