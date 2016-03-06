import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size  = in.nextInt();
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        for(int i = 0; i < size; i++) {
            int number = in.nextInt();
            int result = (number > 0) ? positives++ : (number < 0 ?  negatives++ : zeroes++);
        }
        System.out.println((float)positives/size);
        System.out.println((float)negatives/size);
        System.out.println((float)zeroes/size);
    }
}