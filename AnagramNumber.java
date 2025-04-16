package java;

import java.util.*;

public class AnagramNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        int s1 = 0;
        int p1 = 1;
        int s2 = 0;
        int p2 = 1;
        String a = String.valueOf(n1);
        String b = String.valueOf(n2);
        if (a.length() == b.length()) {
            while (n1 != 0) {
                int digit = n1 % 10;
                s1 += digit;
                p1 *= digit;
                n1 /= 10;
            }
            while (n2 != 0) {
                int digit = n2 % 10;
                s2 += digit;
                p2 *= digit;
                n2 /= 10;
            }
            if (s1 == s2 && p1 == p2) {
                System.out.println("The numbers are anagrams of each other.");
            } else {
                System.out.println("The numbers are not anagrams of each other.");
            }
        } else {
            System.out.println("The numbers are not anagrams of each other.");
        }
        sc.close();
    }
}
