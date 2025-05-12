package chapter06;

public class ForTest2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i+"\t");
            if(i % 7 == 0) {
                System.out.print("\n");
            }
        }
    }
}
