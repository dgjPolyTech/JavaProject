package chapter08.section01;

public class RabbitTestStatic {
    public static void main(String[] args) {
        System.out.println("Rabbit 객체 생성 전의 토끼 객체 수: "+Rabbit.count);

        Rabbit r1 = new Rabbit();
        System.out.println("Rabbit 객체 1번 생성  후 토끼 객체 수: "+Rabbit.count);

        Rabbit r2 = new Rabbit();
//        System.out.println("Rabbit 객체 2번 생성 후 토끼 객체 수: "+Rabbit.count);
        System.out.println("Rabbit 객체 생성 후 토끼 객체 수: "+r2.count);
        // 이렇게 쓰는 것도 가능은 함. 다만 어차피 같은 count 의미하는거라 딱히 이렇게 쓸 이유가 없음.

    }
}
