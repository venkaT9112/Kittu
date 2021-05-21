package com;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=9;
		int b=2;
		
		if(marks>60) {
			b=1;
		}
		else if(marks>=45  && marks<60) {

				b=2;
			}
		
		else if(marks>=33  && marks<45) {
					
					b=3;
				}
		
		else {
				b=4;
		    	}
			
			
		switch(b) {
		case 1 : System.out.println("First Division");
		break;
		case 2 : System.out.println("Second Division");
		break;
		case 3 : System.out.println("Third Division");
		break;
		case 4 : System.out.println("Fail");
		break;
		default : System.out.println("invalid choice");
		}

	}

}

