package 은행만들기;


public class Bank {
    // 은행 계좌 정보를 관리하기 위한 변수
    private String accountNumber;
    private double balance;

    // 생성자: 계좌 개설 시 초기화
    public Bank(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    // 계좌 잔액 확인 메소드
    public double checkBalance() {
        return balance;
    }
}
