package chapter08.Phone;

// 인터페이스 생성 > 생성할 폴더 우클릭 후 클래스 > i로 된 인터페이스 선택
// new 연산자로 객체 생성 불가
//필드: 상수, 메소드: 추상메소드
public interface Phone {
    // 인터페이스의 필드는 상수로만 사용: 상수는 항상 같은 값을 갖는 필드.
    // static final 생략 가능.
    String name = "Phone";
    // 인터페이스는 추상메소드에 public과 abstract를 생략 가능
    void callPhone(String phoneNumber);
    public abstract void receivePhone(String phoneNumber);
}