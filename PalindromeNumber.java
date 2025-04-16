package java;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;

        if (originalNum < 0) {
            System.out.println(originalNum + " not a palindrome number.");
        }
        while (num != 0) {
            int digit = num % 10;
            // Reverse the number
            // by multiplying the current reverse by 10 and adding the digit
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (originalNum == rev) {
            System.out.println(originalNum + " palindrome number.");
        } else {
            System.out.println(originalNum + " not a palindrome number.");
        }
        sc.close();
    }
}
