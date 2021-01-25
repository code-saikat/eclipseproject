package com.leetcode.dymanicprogramming;

public class LongestPaliandromicSubsequence {
	
	public int lps(String s,int low,int high){
        //Base condition when length is 1 i.e. A
        if(low== high)
            return 1;
        //base case when length is two and are same i.e. AA
        else if(s.charAt(low) == s.charAt(high) && (high-low)==1)
            return 2;
        //First check if first and last character are same i.e. ABBA
        else if(s.charAt(low) == s.charAt(high) && low<high)
            return 2+lps(s,low+1,high-1);
        //Second check if fist and last character are not same i.e. ABBAB
        else
            return Math.max(lps(s,low+1,high),lps(s,low,high-1));
        //return length;
       
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbabccccccccc";
		System.out.println(new LongestPaliandromicSubsequence().lps(s, 0, s.length()-1));

	}

}
