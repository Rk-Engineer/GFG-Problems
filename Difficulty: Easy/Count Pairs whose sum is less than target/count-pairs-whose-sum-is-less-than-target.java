//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Sort the array
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        
        // Use two pointers to find pairs
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            
            if (currentSum < target) {
                // All pairs (arr[left], arr[i]) for i in [left+1, right] are valid
                count += (right - left);
                left++;  // Move the left pointer to the right
            } else {
                right--;  // Move the right pointer to the left
            }
        }
        
        return count;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends