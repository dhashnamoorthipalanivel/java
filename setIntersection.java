package java;
import java.util.*;
public class setIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 4, 4, 5, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        TreeSet<Integer> set = new TreeSet<>();
    
        for (int num : set2) {
          if (set1.contains(num)) {
            set.add(num);
          }
        }
        for (int num : set) {
          System.out.print(num + " ");
        }
    
        sc.close();
      }
}
