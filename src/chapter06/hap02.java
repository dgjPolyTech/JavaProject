package chapter06;

public class hap02 {
    public static void main(String[] args) {
        int sum = 0;
        int start = 500;
        int count = 1000;

        String oddEven = "";

        for(int i = 500; i <= count; i+=2) {
            if(i % 2 == 0) {
                sum += i;
            }

            oddEven = "짝수";
        }
        System.out.println(start+"부터 "+count+"까지의 합계: "+sum);
    }
}
