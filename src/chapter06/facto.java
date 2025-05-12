package chapter06;

public class facto {
    public static void main(String[] args) {
        int sum = 1;
        int count = 7;

        for(int i = sum; i<= count; i++){
            sum *= i;
        }
        System.out.print(count+"명의 학생들을 순서대로 세우는 경우의 수: "+sum);
    }
}
