//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        int left = 0 , right = 0 , maxi = 0 ;
        
        while(right<s.length()){
            // case 1 : element present in the hashset 
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++ ;
            }
            // case 2 : element not present in the hashset
            set.add(s.charAt(right));
            maxi = Math.max(maxi,right - left + 1);
            right++ ;
            
        }
        return maxi ;
    }
}