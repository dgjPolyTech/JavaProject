package chapter04;

public class dTypeTest {
    public static void main(String[] args) {
        boolean boo2 = 100 > 200;
        // boo3 = !boo1;

        char ch1 = 'A';
        char ch2 = 97;

        // byte byte1 = 128; //overflow 에러
        byte byte2 = 127;
        //byte byte3 = -129 //underflow
        byte byte4 = byte2;

        System.out.println("byte2: "+byte2);
        System.out.println("byte4: "+byte4);

        short short1 = 128;
        short short2 = byte2;
        //byte4 = short1-1;//큰 자료형에서 작은 자료형으로 값을 대입할 수 없다.
    }
}
