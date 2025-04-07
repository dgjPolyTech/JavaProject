package chapter03;

import java.util.Scanner;

public class Conv {
    public static void main(String[] args) {
        int coffee_buy = 500;
        int coffee_sell = 1800;

        int samgak_buy = 900;
        int samgak_sell = 1400;

        int banana_buy = 800;
        int banana_sell = 1800;

        int dosirak_buy = 3500;
        int dosirak_sell = 4000;

        int coke_buy = 700;
        int coke_sell = 1500;

        int kkang_buy = 1000;
        int kkang_sell = 2000;

        int total = 0;

        total -= samgak_buy*10; // 삼각김밥 10개 구매
        total += banana_sell*2; // 바나나우유 2개 판매
        total -= dosirak_buy*5; // 도시락 5개 구매
        total += dosirak_sell*4; // 도시락 4개 판매
        total += coke_sell*1; // 콜라 1개 판매
        total += kkang_sell*4; // 새우깡 4개 판매
        total += coffee_sell*5; // 커피 5개 판매
        
        System.out.println("오늘 총 매출액은 "+total+"원 입니다.");
    }
}
