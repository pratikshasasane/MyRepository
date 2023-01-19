package org.test;

public class GreaterNumberChecking {

	public static void main(String[] args) {
		 int first=56,second=89,third=44;
	        
	        if(first>second && first>third)// 56>89 && 56>44   f && t
	        {
	            System.out.println(first+ " is the greater number.");
	        }
	        else if(second>third) //89>44 t
	        {
	            System.out.println(second+ " is the greater number.");
	        }
	        else
	        {
	            System.out.println(third+ " is the greater number.");
	        }

	}

}
