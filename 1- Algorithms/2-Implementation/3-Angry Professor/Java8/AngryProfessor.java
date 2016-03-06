import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int attending = 0;
            for(int j = 0; j < n; j++) {
                int time = in.nextInt();
                if(time <= 0)
                    attending++;  
            }
            if(k>attending)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}