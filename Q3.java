
// 3.  Write a program to print the following series: 0, 1, 1, 2, 4, 7, 13, . . . . upto n.

public class Q3 {
    public static void main(String[] args) {
        int N = 20;

        int a = 0, b = 1, c = 1;

        System.out.print(a + ", " + b + ", " + c);

        for (int i = 1; i <= N - 3; i++) {
            int temp = a + b + c;
            System.out.print(", " + temp);
            a = b;
            b = c;
            c = temp;
        }

    }
}