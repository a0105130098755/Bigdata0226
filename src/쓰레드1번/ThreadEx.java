package 쓰레드1번;

// Runnable 인터페이스를 구현하여 스레드를 정의합니다.
class MyThread implements Runnable {
    // run 메서드를 구현하여 스레드가 실행할 작업을 정의합니다.
    public void run() {
        // 스레드가 실행할 작업 내용을 여기에 작성합니다.
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                // 일시 정지하여 다른 스레드에게 실행 기회를 주는 예시입니다.
                Thread.sleep(1000); // 1초간 일시 정지합니다.
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        // Runnable을 구현한 객체를 생성합니다.
        MyThread myThread = new MyThread();

        // Thread 객체를 생성하고 Runnable 객체를 전달합니다.
        Thread thread = new Thread(myThread);

        // 스레드를 시작합니다.
        thread.start();

        // 메인 스레드에서의 작업입니다.
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(500); // 0.5초간 일시 정지합니다.
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}

