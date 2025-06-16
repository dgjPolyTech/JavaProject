package chapter07.access;

public class DiceLabTest {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();

        int count = 0;

        while(true) {
            count++;
            d1.setNumber((int)(Math.random() * 6 + 1)); // *6하게 되면 0~5.999... 사이 실수값 반환됨.(정수로 받으니까 실질적으로 0~5.) 뒤에 +1을 더해서 1~6까지의 값이 나오게 하는 것.
            d2.setNumber((int)(Math.random() * 6 + 1));
            d3.setNumber((int)(Math.random() * 6 + 1));

            if(d1.getNumber() == d2.getNumber() && d2.getNumber() == d3.getNumber()) {
                break;
            }
        }

        System.out.println("3개 주사위의 숫자가 모두 "+d1.getNumber()+"입니다.");
        System.out.println("3개의 주사위가 모두 같아지기 까지 "+count+"번 반복했습니다.");
    }
}
