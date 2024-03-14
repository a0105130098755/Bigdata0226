package 스택만들기;

import java.util.Stack;

public class StackEx {
    private int maxSize; // 스택의 최대 크기
    private int[] stackArray; // 스택을 위한 배열
    private int top; // 스택의 맨 위 항목을 가리키는 인덱스

    // 스택 생성자
    public StackEx(int size) {
        this.maxSize = size; // 스택의 최대 크기 설정
        this.stackArray = new int[maxSize]; // 배열 생성
        this.top = -1; // 스택이 비어있음을 나타내는 -1로 초기화
    }

    // 스택에 데이터 추가(push)
    public void push(int data) {
        if (isFull()) {
            System.out.println("스택이 가득 찼습니다.");
            return;
        }
        stackArray[++top] = data; // top을 증가시키고 데이터 추가
        System.out.println(data + "이(가) 스택에 추가되었습니다.");
    }

    // 스택에서 데이터 제거(pop)
    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
            return -1;
        }
        int removedItem = stackArray[top--]; // top을 감소시키고 데이터 제거
        System.out.println(removedItem + "이(가) 스택에서 제거되었습니다.");
        return removedItem;
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return (top == -1);
    }

    // 스택이 가득 찼는지 확인
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // 스택의 맨 위 데이터 확인(peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
            return -1;
        }
        return stackArray[top];
    }

    // 스택 출력
    public void display() {
        System.out.print("스택 내용: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // 크기가 5인 스택 생성
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // 스택이 가득 차서 추가 불가능
        stack.empty(); // 스택 출력

        stack.pop(); // 스택에서 데이터 제거
        stack.pop();
        stack.empty(); // 스택 출력

        System.out.println("맨 위 항목: " + stack.peek()); // 맨 위 항목 확인
    }
}
