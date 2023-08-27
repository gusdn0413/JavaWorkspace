package Chap_09;

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList <students> list = new ArrayList<>();
        list.add(new students("유재석", "파이썬"));
        list.add(new students("박명수", "자바"));
        list.add(new students("김종국", "자바"));
        list.add(new students("조세호", "C"));
        list.add(new students("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생\n----------------------------");
        for (students student :
                list) {
            if (student.license.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}
class students {
    public String name;
    public String license;

    public students(String name, String license) {
        this.name = name;
        this.license = license;
    }
}
