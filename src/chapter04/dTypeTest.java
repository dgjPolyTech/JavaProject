package chapter04;

public class dTypeTest {
    public static void main(String[] args) {
        // 논리형
        boolean boo2 = 100 > 200;
        // boo3 = !boo1;
        
        // 문자형(* 중간에 오류가 나서 다 못적음...)
        char ch1 = 'A';
        char ch2 = 97;

        // 정수형 데이터 타입
        // byte byte1 = 128; //overflow 에러
        byte byte2 = 127;
        //byte byte3 = -129 //underflow
        byte byte4 = byte2;

        System.out.println("byte2: "+byte2);
        System.out.println("byte4: "+byte4);

        short short1 = 128;
        short short2 = byte2;

        int int1 = byte2;
        int int2 = short1;
        int int3 = 1000000000;
        //byte4 = short1-1;//작은 자료형을 큰 자료형으로 값을 대입할 수 있으나
        // 작은 자료형에 큰 자료형의 데이터를 넣을 수 없다.

        long long1 = byte2;
        long long2 = short1;
        long long3 = int1;
        long long4 = (long)Math.pow(10, 30);// double을 long으로 형변환. 데이터 표시 한계 범위를 벗어나면, 최대 값까지만 출력된다. (9223372036854775807)
        //그 상태에서는 pow(10, 30)/pow(10,50) 등을 해도 결과가 같다.

        System.out.println("long4: "+long4);
        
        // 실수형 데이터 타입
        float float1 = 123.456f;
    }
}
