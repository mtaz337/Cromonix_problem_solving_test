
import java.util.*;
import java.lang.*;
import java.io.*;
public class ProblemTwoPartone {
  public static void main (String[] args) throws java.lang.Exception
	{   
		String [] test = {"00100","11110","10110","10111","10101","01111","00111","11100","10000","11001","00010","01010"};
		int length = test.length;
		int len = test[0].length();
		int zero = 0;
		int one = 0;
		String gamma = "";
		String elipson = "";
		for(int i = 0; i<len; i++){
			for(int j = 0; j<length;j++){
				if(test[j].charAt(i)=='1')
				one++;
				else
				zero++;
			}
			if(one>zero){
				gamma = gamma+ "1";
				elipson = elipson+ "0";
			}
			else{
				gamma = gamma+"0";
				elipson = elipson+"1";
			}
			one=0;
			zero = 0;
		}
		
		int gammaDecimal = Integer.parseInt(gamma,2);
		int elipsonDecimal = Integer.parseInt(elipson,2);
		int result = gammaDecimal*elipsonDecimal;
		System.out.println(result);
	}
}
