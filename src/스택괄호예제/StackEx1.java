package 스택괄호예제;

import java.util.Stack;

public class StackEx1 {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket); // 여는 괄호일 경우 스택에 추가
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false; // 닫는 괄호인데 스택이 비어있으면 불일치
                }

                char topBracket = stack.pop(); // 스택에서 가장 최근의 여는 괄호 가져오기

                // 여는 괄호와 닫는 괄호가 일치하지 않으면 불일치
                if ((topBracket == '(' && bracket != ')') ||
                        (topBracket == '[' && bracket != ']') ||
                        (topBracket == '{' && bracket != '}')) {
                    return false;
                }
            }
        }

        // 모든 문자를 확인한 후에 스택이 비어있어야 괄호가 일치함
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "(){}[]"; // 괄호가 일치하는 경우
        String input2 = "([{}])"; // 괄호가 일치하는 경우
        String input3 = "([)]";   // 괄호가 일치하지 않는 경우

        System.out.println("입력 \"" + input1 + "\"은(는) " + (isValid(input1) ? "올바른" : "올바르지 않은") + " 괄호입니다.");
        System.out.println("입력 \"" + input2 + "\"은(는) " + (isValid(input2) ? "올바른" : "올바르지 않은") + " 괄호입니다.");
        System.out.println("입력 \"" + input3 + "\"은(는) " + (isValid(input3) ? "올바른" : "올바르지 않은") + " 괄호입니다.");
    }
}

