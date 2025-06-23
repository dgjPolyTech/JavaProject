package chapter08.section02Lab;

public class SchoolBus extends Car{

    // 이런 방식은 지양해야함. 실행 자체는 되지만, getter/setter는 오버로딩/오버라이딩 하지 않는게 맞음.
    public void setSpeed(int speed) {
        if(speed <= 60){
            this.speed = speed;
        } else {
            this.speed = 60;
        }
    }
}
