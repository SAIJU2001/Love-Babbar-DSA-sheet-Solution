/************love babbar dsa sheet******

            344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 
Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.                */


import java.util.*;

//leetcode solution

class Solution 
{

    //approach 1 using recursion
    /* 
    public void reverseString(char[] s) 
    {
        reverse( s , 0, s.length-1 );
    }
    void reverse( char[] s , int start, int end )
    {
        if( start>=end )
            return;

        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        reverse( s , start+1, end-1 );
    }   
    */

    //approach 2 using iteration
    public void reverseString(char[] s) 
    {    
        int n=s.length;
        int front = 0;
        int back = n-1;
        
        for( int i=0 ; i<n/2 ; i++ )
        {
            char temp = s[front];
            s[front]=s[back];
            s[back]=temp;
            front++;
            back--;
        }    
    }
}

//main class for drive the solution

class ReverseString
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        while( t-->0 )
        {
            int n=Sc.nextInt();
            char s[]=new char[n];

            for( int i=0 ; i<n ; i++ )
                s[i]=Sc.next().charAt(0);

            Solution sl=new Solution();
            sl.reverseString( s); 

            for( int i=0 ; i<n ; i++ )
                System.out.print( s[i]+" ");
        } 
    }
}