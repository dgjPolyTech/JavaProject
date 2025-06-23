package chapter08.rabbitAbstract;

public class HouseRabbit extends Rabbit {

    // 부모 클래스의 추상 메서드 move <- 이거 구현 안하면 애초에 오류남.
    @Override
    public void move(int x, int y) {
        this.x  = x;
        this.y = y;
    }
}
