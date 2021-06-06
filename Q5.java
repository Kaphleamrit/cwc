
//   5.  Given an array of integers.Your task is to find and display the inversion count in an
//  array also display the pairs that satisfies the inversions.If no inversions found print 0.
public class Q5 {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 3, 7, 6 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}