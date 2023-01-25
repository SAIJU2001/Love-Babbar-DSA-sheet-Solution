/************love babbar dsa sheet******

                287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
 
Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.     */
 

import java.util.*;

//leetcode solution
class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer>set=new HashSet<>();
        for( int i=0 ; i<nums.length ; i++ )
        {
            if( set.contains(nums[i]) )
                return nums[i];

            set.add(nums[i]);
        }
        return 0;
    }
}


//main class for drive the solution
class FindTheDuplicateNumber
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            int nums[]=new int[n];
            for( int i=0 ; i<n ; i++ )
                nums[i]=Sc.nextInt();

            Solution sl=new Solution();
            System.out.print( sl.findDuplicate( nums) );
        } 
    }
}