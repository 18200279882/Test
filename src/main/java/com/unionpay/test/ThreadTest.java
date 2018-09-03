package com.unionpay.test;

public class ThreadTest {
	public static void main(String[] args) {
		
		Binary_Rpc_Thread binary_Rpc_Thread1=new Binary_Rpc_Thread("bj");
		Binary_Rpc_Thread binary_Rpc_Thread2=new Binary_Rpc_Thread("sh");


		binary_Rpc_Thread1.start();
		binary_Rpc_Thread2.start();
				
	}
}
