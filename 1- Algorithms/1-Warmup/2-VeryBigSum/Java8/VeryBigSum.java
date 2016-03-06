import java.io.*;
import java.util.*;

public class Solution {
    
    static long  simpleArraySum(long array[]) {
        long sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        long sum;
        long[] array = new long[size];
        for(int i=0;i<size;i++) {
            long a = in.nextLong();
            array[i] = a;
        }
        sum = simpleArraySum(array);
        System.out.println(sum);
    }
}