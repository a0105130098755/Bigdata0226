package 슈퍼변수와메소드;
public class SuperEx {
    private String name;
    private int age;

    public SuperEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    public static void main(String[] args) {
        SuperEx student1 = new SuperEx("철수", 20);
        student1.printInfo();
        student1.setName("영희");
        student1.setAge(22);
        student1.printInfo();
    }
}


