package com.java.networking.examples;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Clientwrite {
	public static void main(String[] args) {
		try {
		Socket s=new Socket("192.168.2.62", 2222);
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1="", str2="";
		
		while(!str1.equals("stop"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			str2=din.readUTF();
			System.out.println("server says" +str2);
			s.close();
		}}
		catch(Exception e)
		{
			System.out.println(e);
		}}}
