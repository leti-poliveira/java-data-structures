package edu.java.ResolvendoProblemas;

import java.util.Set;
import java.util.Stack;

public class BalanceamentoColchetes {

    public boolean solve(String expression) {
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openSymbols.contains(c)) {
                stack.push(c);
            } else if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '[' && c != ']') return false;
                if (open == '{' && c != '}') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalanceamentoColchetes bc = new BalanceamentoColchetes();
        String expression = "2*(3+4+5*[2+3)]";
        System.out.println(bc.solve(expression)); // false
    }
}
