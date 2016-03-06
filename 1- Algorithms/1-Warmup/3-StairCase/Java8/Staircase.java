import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for(int i = 0; i<size;i++) {
            for(int j = 1; j<(size-i);j++) {
                System.out.print(" ");
            }
            for(int k = 0; k<=i;k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}