package chapter06;

public class continueTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<= 100; i++)
        {
            if(i % 5 == 0) { continue; }
            sum += i;
        }

        System.out.println("1부터 100까지 합: "+sum);
    }
}
