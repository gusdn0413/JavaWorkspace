package Chap_04;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 5; // 주차 시간
        boolean isSmallerCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000;

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallerCar || withDisabledPerson) {
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
