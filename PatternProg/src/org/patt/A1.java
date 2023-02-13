package org.patt;

public class A1 {
	public static void main(String[] args) {
	
	int val=5;
	for(int i=1; i<=5; i++) {
	
	for (int j = 1; j <=val; j++) {
		
		System.out.print(j+" ");
	}
	val--;
		System.out.println();	
	}
	
	System.out.println("=================");
	
	for (int i = 1; i <=5; i++) {
		
	for (int j = 5; j>=i; j--) {
		System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println("=================");
	
	int val1=1;
	for (int i = 5; i >=1; i--) {
		
		for (int j = 5; j>=val1; j--) {
			System.out.print(i+" ");
			}
			val1++;
			System.out.println();
		}
	System.out.println("=================");
	for (int i = 5; i >=1; i--) {
	
	for (int j = 1; j <=i; j++) {
		System.out.print(i*j+" ");
	}	
	System.out.println();	
	}
	System.out.println("=================");
	int num=1;
	for (int i = 1; i <=5; i++) {
	
	for (int j = 1; j <=5; j++) {
		
		System.out.print(num+" ");
		num++;
	}	
		System.out.println();
	}
	System.out.println("=================");
	//int sum=1;
	for (int i = 1; i <=5; i++) {
	
	for (int j = 1; j <=5; j++) {
		
		System.out.print(i*j+" ");
		
	}	
	///sum++;
		System.out.println();
	}
	System.out.println("=================");
		
	}

}
