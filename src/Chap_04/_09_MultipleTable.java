package Chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단

        int sum = 0;

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " 단 ");
            for (int j = 1; j <= 9 ; j++) {
                sum = i * j;
                System.out.print(i + " * " + j + " = " + sum + "\n");
            }
        }
    }
}
