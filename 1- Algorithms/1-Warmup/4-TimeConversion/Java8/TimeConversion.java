import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] arr = time.split(":");
        int h = Integer.valueOf(arr[0]);
        int m = Integer.valueOf(arr[1]);
        
        if(arr[2].toLowerCase().contains("AM".toLowerCase()))
            h = h==12 ? 0 : h; 
        else
            h = h!=12 ? h+12 : h;
        int s = Integer.valueOf(arr[2].replace("PM","").replace("AM",""));
        System.out.println(String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s));
    }
}
