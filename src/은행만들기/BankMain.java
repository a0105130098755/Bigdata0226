package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        // 은행 계좌 생성
        Bank account1 = new Bank("12345", 1000.0);

        // 잔액 확인
        double balance = account1.checkBalance();
        System.out.println("계좌 잔액: " + balance);
    }
}
