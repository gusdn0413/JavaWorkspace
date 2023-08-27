package Chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallaBongAde = true; // 한라봉 에이드
        boolean mangoAde = true; // 망고 에이드
        if(hallaBongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoAde) {
            System.out.println(("망고 에이드 +1"));
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문 완료 #1");

        // else if 는 여러번 사용 가능
        hallaBongAde = false;
        mangoAde = false;
        boolean orangeJuice = true;
        if(hallaBongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoAde) {
            System.out.println(("망고 에이드 +1"));
        } else if (orangeJuice) {
            System.out.println("오렌지 쥬스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문 완료 #2");

        //else 는 없어도 가능
        hallaBongAde =false;
        mangoAde = false;
        orangeJuice = false;
        if(hallaBongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoAde) {
            System.out.println(("망고 에이드 +1"));
        } else if (orangeJuice) {
            System.out.println("오렌지 쥬스 +1");
        }
        System.out.println("음료 주문 완료 #3");

    }
}
