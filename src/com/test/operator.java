package com.test;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=ob.nextInt();
		
		System.out.println("Enter value of b:");
		b=ob.nextInt();
		
		System.out.println("Enter value of c:");
		c=ob.nextInt();

		if(a>b && a>c)
		{
			System.out.println(a + " is a greater number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is a greater number");
		}
		else
		{
			System.out.println(c + " is a greater number");
		}
		
		ob.close();
	
		System.out.println(a+b);// 112
		System.out.println(a-b);// -66
		System.out.println(a*b);// 
		System.out.println(b/a);//3
		System.out.println(b%a);//
		
	
		System.out.println(b>a && b>c);
		System.out.println(b<a || b<c);
		System.out.println(b!=a);  //true
		System.out.println(b==a); //false
		boolean h=(b==a);
		
		
		
		System.out.println(a);
		
		
		System.out.println(++c);//pre increment
		System.out.println(c);
		
		
	int x=12, y=23;
		System.out.println(12 >> 23);
		
		
		System.out.println(ob instanceof Scanner);
		
		
		
		
	}




	}



	
