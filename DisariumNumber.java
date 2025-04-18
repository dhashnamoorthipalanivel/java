package java;
import java.util.*;
public class DisariumNumber {
    public static void main(String [] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int length = str.length();
        int originalNum = num;
        int sum = 0;
        int count = length;
        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit, count);
            count--;
            num /= 10;
        }
        if(sum == originalNum){
            System.out.println("The number is a Disarium number.");
        }else{  
            System.out.println("The number is not a Disarium number.");
        }
        sc.close();   
    }
}
