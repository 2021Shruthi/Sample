package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class farTOcen {

	public static void main(String[] args) throws NumberFormatException, IOException {
	double C,F;
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader ob=new BufferedReader(in);
	System.out.println(" Enter the Centigrade:");
	F=Double.parseDouble(ob.readLine());
	C=(5*(F-32))/9;
	System.out.println("Centigrade:"+C);
	
	}

}

