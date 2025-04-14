package chapter04;

public class Code04_12 {
    public static void main(String[] args) {
        String str1 = "한국폴리텍대학 AISoftWare";

        String s1 = str1.toUpperCase();
        System.out.println(s1);

        String s2 = str1.toLowerCase();
        System.out.println(s2);

        System.out.println(str1);

        String str2 = "   AisoftWare    Seoul   ";
        System.out.println(str2);
        String str3 = str2.trim(); // 앞뒤의 공백만을 제거한다.
        System.out.println(str3);
    }
}
