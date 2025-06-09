package chapter07.access;

public class RabbitPublicTest {
    public static void main(String[] args) {
        RabbitPublic r1 = new RabbitPublic();
        r1.shape = "Rabbit"; // 속성이 public이므로 직접 접근해서 값을 줄 수 있다.
        // 다만 일반적으로는 속성값은 private으로 접근 제어자를 주고, getter/setter 쓰는게 낫다.

        // 일반적으로 속성은 private를 붙여 외부에서 직접 수정하지 못하게 함.
        // 반대로 메서드는 public으로 선언하여 외부에서 사용할 수 있도록 함.
        r1.x = 10;
        r1.y = 20;

        System.out.println("토끼 모양: "+r1.shape);
        System.out.println("토끼의 현재 위치: "+r1.x+", "+r1.y);
    }
}
