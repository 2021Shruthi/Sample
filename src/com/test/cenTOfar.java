package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cenTOfar {

	public static void main(String[] args) throws NumberFormatException, IOException {
	double C,F;
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader ob=new BufferedReader(in);
	System.out.println(" Enter the Centigrade:");
	C=Double.parseDouble(ob.readLine());
	F=(9*C/5)+32;
	System.out.println("Fahernhiet:"+F);
	
	
	}

}
