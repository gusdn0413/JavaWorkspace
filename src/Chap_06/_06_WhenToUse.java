package Chap_06;

public class _06_WhenToUse {
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static int getPower(int number){
        return getPower(number, 2);
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2제곱을 구하기

        System.out.println(getPower(2,2));
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 2;
//        }
//        System.out.println(result);

        // 3의 3승을 구하기

        System.out.println(getPower(3,3));
//        result = 1;
//        for (int i = 0; i < 3; i++) {
//            result *= 3;
//        }
//        System.out.println(result);

        System.out.println(getPower(2));
    }
}
