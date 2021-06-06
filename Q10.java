import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//   10.  Write a program that accepts an integer (n) and computes the value of n+nn+nnn.
public class Q10  {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
    
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(br.readLine());
        int res = 0;
    for(int i=1; i<=3; i++) {
        res += Math.pow(n,i);
}
System.out.println(res);
}
}