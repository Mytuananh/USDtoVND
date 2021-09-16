package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        USD = scanner.nextDouble();
        double change = USD * 23000;
        System.out.print("Giá trị VND khi đổi từ USD: " + change);
    }
}
