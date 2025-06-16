package chapter08.section02;

//Super class는 상속 받는 서브 클래스가 모두 갖고 있는 속성(필드)과 기능(메소드)으로 구현합니다.
// 사실 Rabbit도, 따로 extends로 상속 받는 것은 없으나, 묵시적으로 상속 받는 부모가 있다. 바로 Object이다.
// 따라서 extends가 없어도, 부모로 Object는 받는거고, 모든 클래스는 Object의 기능은 다 사용 가능하다는 의미임.
public class Rabbit {
    String shape;
//    private String shape;
    // 만약 이렇게 private 붙이면, 오류남. 하위 메소드에서 상위 메소드의 private 필드는 사용할 수 없기 때문.
    // default(혹은 접근 제어자 안씀)/public(공개) 쓰거나, 혹은 protected라는 속성 사용해야함.
    // 만약, 다른 패키지에 부모 클래스가 있으면, default는 사용 불가. public과 protected만 사용 가능.
    int x, y;

    public Rabbit() {
        super();//super() > Rabbit의 부모는 Object(명시는 안되어있지만)
        // 따라서 Object의 생성자를 불러오게 됨.(물론 Object에는 기본 생성자가 없기에 아무것도 실행 안됨)
        System.out.println("Rabbit의 생성자가 실행됨");
    }

    void move(int x, int y){
        this.x = x;
        this.y = y;
        System.out.printf("(%d, %d)좌표로 이동합니다. \n", this.x, this.y);
    }
}
