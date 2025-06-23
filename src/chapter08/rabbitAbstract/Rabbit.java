package chapter08.rabbitAbstract;

// 추상클래스
// 추상 클래스는 new 연산자 통한 객체 생성 불가능
// 추상 클래스가 객체화되어 필드와 메소드를 사용하려면
// sub(자식) 클래스를 통해서 객체화 하여 사용해야함.
abstract public class Rabbit {
    String shape;
    int x, y;

    abstract public void move(int x, int y);

    public void eat(String food){
        System.out.println("Rabbit "+shape+" eats "+food);
    }
}
