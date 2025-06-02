package chapter07.rabbit;

public class Rabbit {
    private String name;
    private String shape;
    private int x, y;

    public Rabbit(){ // 기본값
        shape = "기본 토끼";
        x = 30;
        y = 30;
    }

    public Rabbit(String shape, int x, int y) { // 매개변수 줘서 생성.
        this.shape = shape;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setPosition 메소드를 만들어서 쓸 것이므로 굳이 setter는 설정 안함.
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        //System.out.println("토끼가 ("+getX()+", "+getY()+") 좌표로 이동합니다.");
        System.out.println("토끼가 ("+x+", "+y+") 좌표로 이동합니다.");
    }

    @Override
    public String toString() {
        return "rabbit{" +
                "name='" + name + '\'' +
                ", shape='" + shape + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
