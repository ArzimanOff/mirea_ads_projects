package ru.mirea.bonus_task;

import org.jetbrains.annotations.NotNull;

public class BracketSequence {
    private String exp;
    private boolean isBalanced;
    private static MyStack<Character> stack = new MyStack<>();

    public BracketSequence(String exp) {
        this.exp = exp;
        this.isBalanced = checkBalance(this.exp);
    }

    public static boolean checkBalance(@NotNull String exp) {
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

    public String getExp() {
        return exp;
    }

    public boolean isBalanced() {
        return isBalanced;
    }
}
