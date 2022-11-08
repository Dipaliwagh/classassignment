package javapracticals;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) 
	{
		int bs,hra=0,da=0,gs;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		bs=sc.nextInt();
		
		if(bs<=10000)
		{
			hra=bs*20/100;
			da=bs*80/100;
		}
		else if(bs<=20000)
		{
			hra=bs*25/100;
			da=bs*90/100;	
		}
		else if(bs>20000)
		{
			hra=bs*30/100;
			da=bs*95/100;	
		}
		gs=bs=hra=da;
		System.out.println("the gross salary"+gs);
	}

}
