//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int fmax = -1 , smax = -1 ;
        for ( int curr : arr){
            // case 1 : find 1st largest 
            if (curr > fmax ){
                smax = fmax ;
                fmax = curr ;
            }
            // case 2 : find 2nd largest
            else if (curr > smax && curr < fmax){
                smax = curr ;
            }
        }
        return smax ;
    }
}