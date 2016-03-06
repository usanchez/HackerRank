import java.io.*;
import java.util.*;

public class Solution {
    
    static int simpleArraySum(int array[]) {
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum;
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            int a = in.nextInt();
            array[i] = a;
        }
        sum = simpleArraySum(array);
        System.out.println(sum);
    }
}