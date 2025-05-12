package chapter06;

public class gugu2 {
    public static void main(String[] args) {
        System.out.println("가로 1(2 x 1 = 2, 2 x 2 = 2...)");
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf(i+"x"+j+"="+i*j+" ");
            }
            System.out.printf("\n");
        }

        System.out.println("\n가로 2(2 x 1 = 2, 3 x 1 = 3...)");

        for(int i = 1; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.printf(j+"x"+i+"="+i*j+" ");
            }
            System.out.printf("\n");
        }
    }
}
