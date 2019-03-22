package com.sample.program;

public class Factorial {

	public static void main(String[] args) {
		int num=4;
		long fact=1;
		/*for(int i=1;i<=num;i++){
			fact=fact*i;
		}*/
		int i=1;
		while(i<=num){
			fact=fact*i;
			i++;
		}
		System.out.println("factorial number is:"+fact);
	}

}
