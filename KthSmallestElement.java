/**********love babbar dsa sheet*****

		Kth smallest element
Stand out from the crowd. Prepare with Complete Interview Preparation  

Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.

Example 2:
Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.

Your Task:
You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input and returns the Kth smallest element.
 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(log(n))

Constraints:
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N						*/
 

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class KthSmallestElement 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here

		//approacc 1
        //	Arrays.sort(arr);
        //	return arr[k-1];
        
		//approach 2
        PriorityQueue<Integer> small = new PriorityQueue<>();
		//here we using priority Queue because it removes the less priority element
        int n = r-l+1;
        for(int i=0; i<n; i++)
            small.add(arr[i]);

        while(k-->1)
            small.remove();

        return small.peek();
    } 
}

