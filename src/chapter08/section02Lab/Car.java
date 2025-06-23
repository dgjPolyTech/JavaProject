package chapter08.section02Lab;

public class Car {
    String name;
    int speed;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void showSpeed(){
        System.out.println(name+"의 속력: "+speed);
    }
}
