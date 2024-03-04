package 회원정보예제;
import java.util.Scanner;
public class MemberMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 이름 입력 받기
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();

            // 나이 입력 받기 (1 ~ 199까지만 정상적인 값으로 판단)
            int age;
            while (true) {
                System.out.print("나이를 입력하세요 (1 ~ 200): ");
                age = scanner.nextInt();
                if (age >= 1 && age <= 200) {
                    break;
                } else {
                    System.out.println("1부터 199까지의 숫자를 입력해주세요.");
                }
            }

            // 성별 입력 받기 ('M' 또는 'F'로만 입력 가능)
            char gender;
            while (true) {
                System.out.print("성별을 입력하세요 (M/m 또는 F/f): ");
                gender = scanner.next().charAt(0);
                if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
                    break;
                } else {
                    System.out.println("성별은 M/m 또는 F/f로만 입력해주세요.");
                }
            }

            // 직업 입력 받기 (1 ~ 4까지의 숫자로만 입력 가능)
            int job;
            while (true) {
                System.out.println("직업을 선택하세요:");
                System.out.println("1. 학생");
                System.out.println("2. 회사원");
                System.out.println("3. 주부");
                System.out.println("4. 무직");
                job = scanner.nextInt();
                if (job >= 1 && job <= 4) {
                    break;
                } else {
                    System.out.println("1부터 4까지의 숫자 중 하나를 선택해주세요.");
                }
            }

            // 입력 받은 정보 출력
            System.out.println("\n입력한 정보:");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age + "세");
            System.out.println("성별: " + (gender == 'M' || gender == 'm' ? "남성" : "여성"));
            System.out.print("직업: ");
            switch (job) {
                case 1:
                    System.out.println("학생");
                    break;
                case 2:
                    System.out.println("회사원");
                    break;
                case 3:
                    System.out.println("주부");
                    break;
                case 4:
                    System.out.println("무직");
                    break;
            }

            scanner.close();
        }
    }


