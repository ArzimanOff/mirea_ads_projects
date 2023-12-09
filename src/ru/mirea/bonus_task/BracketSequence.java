package ru.mirea.bonus_task;

public class BracketSequence {
    private final boolean isBalanced;

    public BracketSequence(String exp) {
        this.isBalanced = checkBalance(exp);
    }

    public static boolean checkBalance(String exp) {
        MyStack<Character> stack = new MyStack<>();
        if (exp == null) {
            throw new IllegalArgumentException("Скобочная последовательность не может быть равна null !");
        }
        for (char bracket : exp.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public boolean isBalanced() {
        return isBalanced;
    }
}
