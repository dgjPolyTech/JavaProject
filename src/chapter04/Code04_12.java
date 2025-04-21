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

        String str4 = str2.replaceAll(" ",  "");//공백(" ")을 붙임("")으로 전환한다.
        System.out.println(str4);

        String str5 = str2.replaceAll(" ",  "");//공백(" ")을 붙임("")으로 전환한다.
        System.out.println(str5);

        String str6 = str2.replaceFirst(" ", "");
        System.out.println(str6);
    }
}
