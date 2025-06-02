package chapter07;

public class Car {
    // 클래스는 속성/기능으로 구성된다.
    // 속성은 필드, 기능은 메소드로 표현한다.

    private String name; // 자동차명
    private String product; // 제조사
    private int price; // 가격
    private int year; // 제조 년도
    private int cc; // 자동차 배기량

    //shift+Enter 동시에 누르고, 나오는 창에서 generate getter/setter하면 get/set 모두 동시에 바로 생성됨.

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    // 매개 변수를 받아, 이 클래스의 이름을 설정.
    public void setName(String name) {
        this.name = name;
    }

    // 리턴값이 string이기에 자료형도 string으로 함.
    public String getName() {
        return name;
    }

    //메소드
    public void start(){
        System.out.println("시동을 건다.");
    }

    public void drive(int speed){
        System.out.println("시속 몇"+speed +"km로 달린다.");
    }

    public void foward(){
        System.out.println("전진한다.");
    }

    public void backgward() {
        System.out.println("후진한다.");
    }

    public void stop(){
        System.out.println("멈춘다.");
    }

    // 오버라이딩
    // 기존 클래스에 있던 toString을 내 맘대로 사용함.
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", cc=" + cc +
                '}';
    }
}
