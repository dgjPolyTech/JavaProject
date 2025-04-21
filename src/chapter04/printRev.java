package chapter04;

public class printRev {
    public static void main(String[] args) {
        String ss = "블랙핑크";
        System.out.println("원본 문자열 ==> "+ss);

//        for(int i=ss.length()-1; i >= 0; i--){ // 문자열 가운데는, 이 조건에 해당하면 실행한다는 의미.
//            System.out.print(ss.charAt(i));
//        }

        for(int i=0; i < ss.length(); i++){ // 문자열 가운데는, 이 조건에 해당하면 실행한다는 의미.
            //i<=ss.length로 하면, 더 낮을 때도 실행되어 인덱스 범위를 벗어나게 됨.
            System.out.print(ss.charAt(ss.length()-(i+1)));
        }

        System.out.println("\n");

        //대소문자 변환하기
        String str2 = "Java";
        String newSS = "";

        newSS += str2.substring(0,1).toLowerCase();
        newSS += str2.substring(1,2).toUpperCase();
        newSS += str2.substring(2,3).toUpperCase();
        newSS += str2.substring(3,4).toUpperCase();

        System.out.println("str2의 원본 문자열: "+str2);
        System.out.println("변환된 문자열: "+newSS);
    }
}
