package com.oshin;

import java.util.Scanner;

public class Assignment6 {
    // 6. Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rupees to USD conversion1");
        System.out.print("Enter amount: Rs.");
        long amt = sc.nextLong();
        // conversion rate is based on 1st Sep 2022 data
        float usd = amt / 80f;
        System.out.println("Amount in USD = $" + usd);
    }
}
