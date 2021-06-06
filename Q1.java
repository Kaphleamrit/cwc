import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Q1
 */


public class Q1 {

    public static void main(String[] args) {
        System.out.println(minSwap(Arrays.asList(4,3,2,1)));
    }

    static int minSwap(List<Integer> A) {
        int n = A.size();
        List<Integer> sorted = new ArrayList<>(A);
        Collections.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++) 
            map.put(A.get(i),i);
        
        for(int i=0; i<n; i++) {
            if(A.get(i) != sorted.get(i)) {
                count++;
                int currInt = A.get(i);
                Collections.swap(A, i, map.get(sorted.get(i)));
                map.put(currInt, map.get(sorted.get(i)));
                map.put(sorted.get(i) , i);
            }
        }
        return count;
    }

    
}