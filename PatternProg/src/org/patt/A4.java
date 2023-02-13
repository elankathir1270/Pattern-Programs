package org.patt;

public class A4 {
	public static void main(String[] args) {
		
		int n=5;
		//int m=n+1;
	for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=n; j++) {
		
		if(i==j) {
		System.out.print(i);	
		}
		if(i+j==n+1) {
			if(i==3&&j==3)
			continue;	
		System.out.print(j);	
		}
		else {
		System.out.print(" ");	
		}
	}	
		System.out.println();
	}
	System.out.println("==========================");

	System.out.println("==========================");

	int n1=5;
	//int m=n+1;
	for (int i = 1; i <=n1; i++) {
	for (int j = 1; j <=n1; j++) {
	
		if(i==j) {
		System.out.print("*");	
		}
	    if(i+j==n1+1) {
		if(i==3&&j==3)
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
