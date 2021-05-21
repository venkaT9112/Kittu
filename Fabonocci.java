package com;

public class Fabinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=0;
			int b=1;
			int d=8;
			int c=1;
			System.out.println("fabinocci series until 8 " + " , ");
		while(c<=d) {
			System.out.println(a);
			int e ;
			e=a+b;
			a=b;
			b=e;
			
			c++;
		}
	}

}
