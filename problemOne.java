import java.util.*;
import java.lang.*;
import java.io.*;


class ProblemOne
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] nums = {2,7,11,15};
		int target = 9;
    //test-case-2: nums = [2,3,4] target = 6 output = [0,2]
    //test-case-3: nums = [3,3] target = 6 output = [0,1]
		String output = "";
		int length = nums.length;
		 for(int i = 0; i<length; i++){
     	for(int j = i+1; j<length; j++){
     		if(nums[i]+nums[j]==target){
     			 output = "["+i+","+j+"]";
     			 break;
    	}
     	}
     }
     System.out.println(output);
	}
}