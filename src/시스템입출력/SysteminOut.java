package 시스템입출력;

public class SysteminOut {
    public static void main(String[] args){
        String name = "곰돌이 사육사";
        String addr = "서울시 강남구 역삼동";
        char gender = 'M';
        int age = 22;
        int kor = 88;
        int eng = 85;
        int mat = 25;
        double aver = 0.0;

        System.out.println("=".repeat(5)+"JAVA STYLE 출력" + "=".repeat(5));
        System.out.println("이름:"+name);
        System.out.println("주소: "+ addr);
        System.out.println(("성별: "+gender));
        System.out.println("나이: "+age);
        System.out.println("총점: "+(kor +eng +mat));
        System.out.println("평균: "+(double)(kor+eng+mat)/3);
    }
}
