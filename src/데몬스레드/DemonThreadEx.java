package 데몬스레드;

public class DemonThreadEx {
    public static void main(String[] args) {
        // 데몬 스레드 생성
        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true); // 데몬 스레드로 설정

        // 스레드 시작
        daemonThread.start();

        // 메인 스레드가 종료되면 데몬 스레드도 종료됨
        System.out.println("Main thread finished.");
    }

    // Runnable 구현 클래스
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // 데몬 스레드가 종료될 때까지 반복하여 실행
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000); // 1초마다 실행
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

