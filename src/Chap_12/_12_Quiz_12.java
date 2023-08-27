package Chap_12;

public class _12_Quiz_12 {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i +"/5");
            }
            System.out.println(" -- A 상품 준비 완료 -- ");
        };
        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i +"/5");
            }
            System.out.println(" -- B 상품 준비 완료 -- ");
        };
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

//        while (threadA.isAlive() || threadB.isAlive()) {
//
//        }
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" -- 세트 상품 포장 시작");
        Runnable runnableSet = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 준비 " + i +"/5");
            }
            System.out.println(" -- 세트 상품 준비 완료 -- ");
        };
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
    public void pack() {

    }
}
class Box1{
    int boxNumber = 1;

}
