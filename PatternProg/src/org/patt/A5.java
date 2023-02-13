package org.patt;

public class A5 {
	public static void main(String[] args) {
		
		int n=5;
		for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=n; j++) {
		
		if(i+j==i+1) {
		System.out.print("*");	
		} 
		
		if(i+j==j+1) {
		if(i+j==2)
		continue;	
		System.out.print("*");	
		}
		
		if(i+j==n+i) {
		System.out.print("*");	
		}
		
		if(i+j==n+j) {
		if(i+j==6)
		continue;	
		System.out.print("*");	
		}
		
		else {
		System.out.print(" ");
		}
		
		}	
		System.out.println();	
		}
		
	}

}
