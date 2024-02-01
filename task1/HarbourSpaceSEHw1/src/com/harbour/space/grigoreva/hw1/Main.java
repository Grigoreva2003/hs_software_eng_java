package com.harbour.space.grigoreva.hw1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String integer = scanner.nextLine();
        System.out.println(integer.contentEquals(new StringBuilder(integer).reverse()));
    }
}