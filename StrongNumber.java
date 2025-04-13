import java.util.*;
public class StrongNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number for comparison  
        int sum =0;
        int factorial = 1;
        while(num !=0){
            int digit = num%10;
            if(digit >=0){
                for(int i=1;i<=digit;i++){
                    factorial*=i;
                }
                sum += factorial;
                factorial = 1; // Reset factorial for next digit
                num /= 10;
            }
        }
        if(sum == originalNum){
            System.out.println("The number is a Strong number.");
        }else{
            System.out.println("The number is not a Strong number.");
        }
        sc.close();
    }
}
