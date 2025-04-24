package java;
import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [] {1,2,1,2,3,1,5};
    
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
    
        for(int num : arr){
          if(set1.add(num)){
            continue;
          }else{
            set2.add(num);
          }
        }
        System.out.println(set2);
        sc.close();
      }
}
