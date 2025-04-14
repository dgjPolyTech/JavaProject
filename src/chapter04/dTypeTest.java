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
        float float2 = (float)200.123;
        float float3 = short1;
        float float4 = 100;
        //float float4 = 100.0; // 이건 안됨.

        double double1 = 555.456;
        double double2 = float1;
        double double3 = byte2;//실수는 정수를 포함하므로, 실수형에 정수형 데이터 대입할 수 있다.
        double double4 = long3;
        double double5 = 333; //

        String str1 = new String("hello");
        str1= "hello";
        String str2 = new String("hello");

        boolean bool4 = str1 == str2;
        System.out.println("str1 == str2 : " + bool4); // 값은 hello로 같지만, 주소값이 달라 다르다고 판단하여, false로 나온다.
        System.out.println("srt1.equals(str2) : " + str1.equals(str2)); // 때문에 string 값 비교시에는 equals를 쓰는게 좋다.

    }
}
