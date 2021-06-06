
//   4.  Write a program to input a number and check if it is an Automorphic number or not.

public class Q4 {
    public static void main(String[] args) {
        int N = 76;

        int sqN = N * N;

        boolean isAutomorphic = true;

        while (N != 0) {
            if (N % 10 != sqN % 10)
                isAutomorphic = false;
            N /= 10;
            sqN /= 10;
        }

        System.out.println(isAutomorphic);

    }
}
