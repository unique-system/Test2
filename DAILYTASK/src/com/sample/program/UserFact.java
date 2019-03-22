package com.sample.program;

import java.util.Scanner;

public class UserFact {
public static void main(String[] args) {
		int num;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
num=sc.nextInt();
sc.close();
long fact=1;
int i=1;
while(i<=num){
	fact=fact*i;
	i++;
}
System.out.println("fact no is"+fact);
	}

}
