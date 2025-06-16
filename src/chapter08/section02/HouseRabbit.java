package chapter08.section02;

public class HouseRabbit extends Rabbit {
    String ownerName; // 토끼의 주인의 이름

    // 이런 식으로 같은 메소드를 형식 바꿔서 쓰는 걸 "오버라이딩"이라 함.
//    void move(int x, int y){
//        System.out.printf("%d, %d 위치로 이동합니다.", x, y);
//    }

    public HouseRabbit() {
        //super();//super() > HouseRabbit 부모는 Rabbit. 따라서 Rabbit의 생성자가 실행됨.
        // 이걸 생략해도 Rabbit의 생성자가 실행되어 "Rabbit의 생성자가 실행됨" 문구가 출력됨
        System.out.println("HouseRabbit의 생성자가 실행됨");
    }

    // 부모 클래스의 move가 private으로 되어있으면, 오버라이딩도 안된다.
    //@Override <- 이런건 어노테이션이라고 함. 이게 안 뜨면 오버라이딩이 제대로 안된거임.
    // 오버라이딩을 처음하면 super.move(x, y); <- 이런 식으로 super의 메소드가 자동으로 추가되는 경우가 있음.
    // 필요한게 아니면 지워도 무방 ㅇㅇ
    
    @Override
    void move(int x, int y) {
        // 참고로 아래의 this.x/this.y는 부모 클래스 x/y값 의미하는 거임.
        if(x > 100) {
            this.x = 100;
        }

        if(y > 100) {
            this.y = 100;
        }

        System.out.printf("(%d, %d) 좌표로 이동한다.\n", this.x, this.y);
//        System.out.printf("(%d, %d) 좌표로 이동한다.\n", x, y); // 이렇게 쓸 수도 있긴한데, 이러면 그냥 매개변수로 받은 값이 나옴.
    }

    void eatFeed() {
        System.out.println("집토끼는 사료를 먹는다.");
    }
}
