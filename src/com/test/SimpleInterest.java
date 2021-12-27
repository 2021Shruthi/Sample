package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double p,r,t,i;
		InputStreamReader in=new InputStreamReader(System.in);
BufferedReader ob=new BufferedReader(in);
System.out.println("enter the value of p:");
p=Double.parseDouble(ob.readLine());
System.out.println("enter the value of t:");
t=Double.parseDouble(ob.readLine());
System.out.println("enter the value of r:");
r=Double.parseDouble(ob.readLine());
i=(p*t*r)/100;
System.out.println("the Simple Interest is :"+i);

	}

}
