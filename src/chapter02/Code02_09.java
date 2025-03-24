package chapter02;

public class Code02_09 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        double result;

        result = num1 + num2;

        //.1 > 소수점 1자릿수까지 출력
        System.out.printf("%d + %d = %.1f\n", num1, num2, result);
        System.out.println(num1+" + "+num2+" = "+result);

        // 결과값 무조건 0.0으로 나옴
        result = num1 / num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, result);

        // 정수형 둘 중 하나를 실수로 설정해야 결과도 실수로 값이 나옴.
        result = num1 / (double)num2;
        System.out.printf("%d / %d = %.1f\n", num1, num2, result);
    }
}
