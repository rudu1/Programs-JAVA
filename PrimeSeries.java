package com.pract;

import java.util.*;
import java.lang.Math;

public class PrimeSeries {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number to check weather it is prime or not");
		int a=sc.nextInt();
		 int temp=a,r=0;
		while(true) {
			a++;
			r+=isPrime(a);
			if(temp==r)
				break;
			
		}
	}
	
	static int isPrime(int num) {
		
		int counter=0;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
			   counter++;
		}
		if(counter==0) {
			System.out.print(""+num+"\t");
			return 1;
		}
		return 0;
		
	}
	
	
}

/*
input is 3
output is 5,7,11
*/
