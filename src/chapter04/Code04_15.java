package chapter04;

public class Code04_15 {
    public static void main(String[] args) {
        String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";

        System.out.println(str.indexOf("처음"));// 가장 먼저 만나는 처음의 인덱스 번호 "2" 출력. "처"를 기준으로 인덱스 번호 반환.
        System.out.println(str.indexOf("처음", 4)); // 4번째 인덱스 이후 부터 처음을 찾음. 인덱스 번호는 0부터 시작
        System.out.println(str.indexOf("처음", 11));

        String str2 = "Java";
        System.out.println(str2.charAt(0));//이쪽은 반대로, 특정 인덱스 번호의 문자를 반환함.
        System.out.println(str2.charAt(1));
        System.out.println(str2.charAt(2));
        System.out.println(str2.charAt(3));
        //System.out.println(str2.charAt(4)); // 오류 발생. java는 0~3까지만 존재하기 때문.
        // 하지만 문자열 길이(str2.length)는 4로 취급됨.

        System.out.println(str2.substring(1,3)); //1부터 3 "직전"까지. 따라서 인덱스 1,2 위치의 av를 반환.

    }
}
