package javapracticals;

import java.util.Scanner;

public class UpsideDownsideStarPattern {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int i,j,rows;
	System.out.println("Please enter number of rows:");
	rows=sc.nextInt();
	
	//up side pattern
	for(i=1;i<=rows;i++)      //loop print row
	{
		for(j=1;j<=i;j++)     //loop print column
		{
			System.out.println("*");    //print * in pattern
		}
		System.out.println();      //print new line after one row
		}
	
	//down side pattern
	for(i=1;i<=rows;i++)     //loop print row
	{
		for(j=rows-1;j>=i;j--)    //loop print column
		{
			System.out.println("*");   //print * in pattern
		}
		System.out.println();      //print new line after one row
		}
	}

	}


