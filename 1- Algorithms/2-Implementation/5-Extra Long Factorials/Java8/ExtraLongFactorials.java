import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    static BigInteger factorial(BigInteger input) {
        if(input.compareTo(BigInteger.valueOf(1))>0)
            return factorial((input.subtract(BigInteger.valueOf(1)))).multiply(input);
        return BigInteger.valueOf(1);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        BigInteger result = BigInteger.valueOf(0);
        int input = in.nextInt();
        result = factorial(BigInteger.valueOf(input));
        System.out.println(result);
            
    }
}