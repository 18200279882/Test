package com.unionpay.test;

public class Test1 {
	public static void main(String[] args) {
		boolean isRight = 2> 1;
		try {
			assert isRight:"程序错误";//在:后写自定义的异常
			System.out.println("程序正常");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();//该行编译错误：提示没有异常需要抛出
		}

	}
}
