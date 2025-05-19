package chapter07;

public class humanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human(); // 생성한 휴먼 클래스를 생성

        human1.name = "김폴리";
        human1.age = 20;

        human2.name = "홍인공";
        human2.age = 23;
    
        human1.walk("학생식당");
        human1.eat("치킨");

        human2.walk("이태원불꽃식당");
        human2.eat("짜장면");
    }
}
