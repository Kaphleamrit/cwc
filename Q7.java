
//   7. You have a variable i and when i=1 output is 3,for i=2 output is 8 and for i=3
//  output is 13.you have to find for which value of i output is 78? Condition: Without using any loop

public class Q7 {

    public static void main(String[] args) {
        // 3 + (i-1)*5 = 78 is the equation for above condition

        int i = (78 - 3) / 5 + 1;

        System.out.println(i);

    }

}
