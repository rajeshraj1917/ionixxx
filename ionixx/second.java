package ionixx;
import java.util.*;
import java.lang.Math;
public class powerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double result=Math.pow(n, n);
		double result1=n*n;
		double result3=result+result1;
		int output=(int)result3;
		System.out.println(output);
		

	}

}