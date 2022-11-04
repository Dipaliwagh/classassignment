package javapracticals;

import java.util.Scanner;

public class CountNoOfDigit {
	
	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		
		//input number from user
		System.out.println("Enter number to count:");
		n=sc.nextInt();
		
		//run loop till n is greater than 0
		while(n!=0)         //for(;n!=0)
		{
			//incrementing digit count
			count++;
			//remove last digit of 'n'
			n=n/10;
		}
		//display the total digits
		System.out.println("Total number of digits:"+ count);
		}
		
	}


