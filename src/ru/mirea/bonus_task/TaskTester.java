package ru.mirea.bonus_task;

public class TaskTester {
    public static void main(String[] args) {
        String exp1 = "[()]{}{[()()]()}";
        String exp2 = "[(])";
        BracketSequence test1 = new BracketSequence(exp1);
        BracketSequence test2 = new BracketSequence(exp2);


        System.out.println("Expression 1 is balanced: " + test1.isBalanced());
        System.out.println("Expression 2 is balanced: " + test2.isBalanced());
    }
}
