package com.unionpay.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Redis_Expire_Time {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();// 获取当前时间
		System.out.println("当前时间：" + sdf.format(date));
		Calendar nowTime = Calendar.getInstance();
		nowTime.add(Calendar.SECOND, 12416653);// 过多少秒之后的时间
		System.out.println("过期时间：" + sdf.format(nowTime.getTime()));

	}
}
