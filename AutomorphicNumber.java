package java;
import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int digit = String.valueOf(num).length();
        int lastDigits = square % (int)Math.pow(10, digit);
        if(num == lastDigits){
            System.out.println(num + " is Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
        sc.close();
    }
}