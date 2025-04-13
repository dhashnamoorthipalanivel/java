package java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number for comparison;
        int temp = num;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        while (originalNum != 0) {
            int digit = originalNum % 10;
            if (digit >= 0) {
                sum += Math .pow(digit, count);
            }
            originalNum /= 10;
        }
        if (sum == temp) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
        sc.close();
    }
}

