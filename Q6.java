
//   6.  Write a program to find the maximum of three numbers without using third variable.

public class Q6 {
    public static void main(String[] args) {

        int a = 5, b = 6, c = 7;

        System.out.println(Math.max(Math.max(a, b), Math.max(b, c)));

    }
}
