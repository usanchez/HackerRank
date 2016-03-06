import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int firstDiag = 0;
        int secDiag = 0;
        for(int i=0;i<size;i++) {
            for(int j = 0;j<size;j++) {
                int number = in.nextInt();
                if(i == j) {
                    firstDiag += number;
                }
                if(j + i == (size - 1)) {
                    secDiag += number;
                }
            }
        }
        int diff = Math.abs(firstDiag-secDiag);
        System.out.println(diff);
    }
}