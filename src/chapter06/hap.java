package chapter06;

public class hap {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;

        String oddEven = "";

        for(int i = 1; i <= count; i++) {
            if(i % 2 == 0){
                sum += i;
                oddEven += "짝수";
            }

        }
        System.out.println("1~10까지의 합계: "+sum);
    }
}
