package 쓰레드2번;

public class ThreadEx2 {
    public static void main(String[] args) {
        // 쓰레드 생성
        MyThread myThread = new MyThread();

        // 쓰레드 시작
        myThread.start();

        // 사용자가 엔터 키를 입력할 때까지 대기
        System.out.println("Press ENTER to stop the thread...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 쓰레드 종료
        myThread.stopThread();
        System.out.println("Thread stopped.");
    }
}

class MyThread extends Thread {
    private volatile boolean running = true; // 쓰레드 종료를 위한 플래그

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); // 1초에 한 번씩 실행
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 쓰레드를 종료하기 위한 메서드
    public void stopThread() {
        running = false;
    }
}

