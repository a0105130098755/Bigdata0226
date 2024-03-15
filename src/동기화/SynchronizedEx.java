package 동기화;

public class SynchronizedEx {
    private static int counter = 0;

    public static void main(String[] args) {
        // 여러 스레드 생성
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        // 스레드 시작
        thread1.start();
        thread2.start();

        // 모든 스레드가 종료될 때까지 대기
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 최종 카운터 값 출력
        System.out.println("Counter: " + counter);
    }

    // Runnable 구현 클래스
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // 카운터를 1000번 증가시킴
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        }

        // 카운터를 증가시키는 메서드 (동기화)
        private synchronized void incrementCounter() {
            counter++;
        }
    }
}

