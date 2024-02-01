package com.harbour.space.grigoreva.hw1;

import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        Stack<Character> deck = new Stack<>();
        Boolean answer = null;

        for (int i = 0; i < s.length(); i++) {
            char char_ = s.charAt(i);

            if (char_ == '(' || char_ == '{' || char_ == '[')
                deck.push(char_);

            if (char_ == ')' && deck.pop() != '(')
                answer = Boolean.FALSE;
            if (char_ == '}' && deck.pop() != '{')
                answer = Boolean.FALSE;
            if (char_ == ']' && deck.pop() != '[')
                answer = Boolean.FALSE;
        }
        if (answer == null)
            System.out.println(deck.empty());
        else
            System.out.println(answer);
    }
}