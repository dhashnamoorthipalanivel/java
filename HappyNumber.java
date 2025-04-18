package java;
import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int temp = num;
        int sum = 0;
        while (true) {
            while (originalNum != 0) {
                int digit = originalNum % 10;
                sum += digit * digit;
                originalNum /= 10;
            }
            if (sum > 0 && sum < 9) {
                break;
            } else {
                originalNum = sum;
                sum = 0;
            }
        }
        if (sum == 1) {
            System.out.println(temp + " is a happy number.");
        } else {
            System.out.println(temp + " is not a happy number.");
        }
        sc.close();
    }
}
