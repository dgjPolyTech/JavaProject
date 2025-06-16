package chapter08.section01;

class Rabbit{
    String shape;
    int xPos;
    int yPos;
    static int count; // 이런걸 클래스 변수라고 함. 각각의 Rabbit 객체가 하나의 count값을 공유함.
    static final String RABBIT_NAME = "Rabbit";
    // 이런 식으로 상수를 클래스 변수로 사용하는 경우가 많음.
    // 상수는 위와 같이 완전 대문자로 선언하는 경우가 대부분.
    // RABBIT_NAME은 상수이기 때문에, 처음의 값을 계속 유지함. 바꿀 수 없음.

    // 기본 생성자
    // alt+Insert하면 생성자, gettter/setter 등 다양한 거 간편하게 추가 가능.
    public Rabbit() {
        count++;
    }
}