package 메소드와필드;

public class MethodEx {
    // 필드(멤버 변수)
    private int myField;

    // 메소드
    public void setMyField(int value) {
        this.myField = value;
    }

    public int getMyField() {
        return this.myField;
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // 필드에 값 설정
        myObject.setMyField(10);

        // 필드에서 값 가져오기
        int fieldValue = myObject.getMyField();
        System.out.println("My field value is: " + fieldValue);
    }

    private static class MyClass {
        public void setMyField(int i) {
        }

        public int getMyField() {
            return 0;
        }
    }
}
