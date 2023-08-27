package Chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();

        System.out.println("------- 정수 -------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); // __1234 (6자리 공간 확보)
        System.out.printf("%06d%n", 1234); // 001234 (빈공간 0으로 채움)
        System.out.printf("%6d%n", -1234);
        System.out.printf("%06d%n", -1234);
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%+06d%n", 1234);
        System.out.printf("%,15d%n", 1000000000);
        System.out.printf("%-6d%n", 1234); // 6자리 확보 후 왼쪽 정렬

        System.out.println("------- 실수 -------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI);
        System.out.printf("%6.2f%n", Math.PI); // __3.14
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI);
        System.out.printf("%+6.2f%n", Math.PI);

        System.out.println("-------　문자열 -------");
        System.out.printf("%s%n", "Java"); // 일반 출력
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보 후 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보 후 좌측 정렬)
        System.out.printf("%6.2s", "Java"); // ____Ja (6자리 공간 확보 후 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s", "Java"); // Ja____ (6자리 공간 확보 후 좌측 정렬해서 2글자 출력)

        System.out.println("-------　응용1 -------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5);

        System.out.println("-------　응용2 -------");
        System.out.println("이름      영어   수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("-------　참고 -------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
