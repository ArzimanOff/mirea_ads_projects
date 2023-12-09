package ru.mirea.bonus_task;

public class TaskTester {
    public static void main(String[] args) {
        String exp1 = "[()]{}{[()()]()}";
        String exp2 = "[(])";
        String exp3 = "([{}])";
        String exp4 = "";
        //String exp5 = null;

        BracketSequence test1 = new BracketSequence(exp1);
        BracketSequence test2 = new BracketSequence(exp2);
        BracketSequence test3 = new BracketSequence(exp3);
        BracketSequence test4 = new BracketSequence(exp4);
        //BracketSequence test5 = new BracketSequence(exp5);


        System.out.println("Последовательность 1: " + test1.isBalanced());
        System.out.println("Последовательность 2: " + test2.isBalanced());
        System.out.println("Последовательность 3: " + test3.isBalanced());
        System.out.println("Последовательность 4: " + test4.isBalanced());

        //System.out.println("Последовательность 5: " + test5.isBalanced());
    }
}
