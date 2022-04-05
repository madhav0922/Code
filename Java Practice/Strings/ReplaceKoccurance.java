package Strings;

import java.util.*;

class ReplaceKoccurance {
    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void printStack(Stack<Pair> stack) {
        int i = 0;
        String stackStr = "";
        while (i < stack.size()) {
            stackStr += stack.elementAt(i).ch;
            i++;
        }
        System.out.println(stackStr);
    }

    public static void withStack(List<Character> chars, int k) {
        Stack<Pair> stack = new Stack<>();

        if (chars.size() == 1) {
            System.out.println(chars);
        }

        for (int i = 0; i < chars.size(); i++) {
            if (stack.empty()) {
                stack.push(new Pair(chars.get(i), 1));
            } else {
                Character currChar = chars.get(i);
                // System.out.println(stack.lastElement().ch + " " + currChar);
                if (stack.peek().ch == currChar) {
                    stack.push(new Pair(currChar, stack.peek().count + 1));
                    if (stack.peek().count == k) {
                        int j = 0;
                        while (j++ != k) {
                            stack.pop();
                        }
                        // System.out.println("pop");
                    }
                } else {
                    stack.push(new Pair(chars.get(i), 1));
                }
            }
            // printStack(stack);
        }
        printStack(stack);
    }

    public static void main(String[] args) {
        List<Character> str = new ArrayList<>(
                Arrays.asList('g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'));

        List<Character> str2 = new ArrayList<>(
                Arrays.asList('q', 'd', 'd', 'x', 'x', 'x', 'd'));

        for (int i = 1; i < str.size() - 1; i++) {
            if (str.get(i - 1) == str.get(i)) {
                str.remove(i - 1);
                str.remove(i - 1);
            }
        }

        for (int i = 1; i < str2.size() - 3; i++) {
            if (str2.get(i - 1) == str2.get(i) && str2.get(i) == str2.get(i + 1)) {
                str2.remove(i - 1);
                str2.remove(i - 1);
                str2.remove(i - 1);
                i = i - 3;
            }
        }

        // System.out.println(str);
        // System.out.println(str2);
        withStack(str, 2);
        withStack(str2, 3);
    }
}