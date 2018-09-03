package com.unionpay.test.encode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encode {
	
	public static void main(String[] args) {
		System.out.println("请输入需要编码的内容,输入感叹号+回车结束：");
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("!");
		while (scanner.hasNext()) {
			String string = scanner.next();
			getresult(matcherStr(string));
		}

	}

	public static void getresult(ArrayList<String> list) {
		int numA = list.size() / 2;
		System.out.print("A:" + numA + ":");
		for (String s : list) {
			System.out.print("S:" + (s.length() - 2) + ":" + s.substring(1, s.length() - 1));
		}
	}

	/**
	 * 这个方法时提取字符串
	 * 
	 * @param strContent
	 */
	public static ArrayList<String> matcherStr(String strContent) {

		// 字符串为空不继续执行字符匹配
		if (strContent == null) {
			System.out.println("字符串为空");
			return null;
		}
		// 正则表达式 匹配文件中的引文引号内容
		Pattern p = Pattern.compile("\"(.*?)\"");
		// Pattern p = Pattern.compile("\"(.*?)(?<![^\\\\]\\\\)\"");
		Matcher m = p.matcher(strContent);
		ArrayList<String> list = new ArrayList<String>();
		while (m.find()) {
			list.add(m.group());
		}

		if (list.size() <= 0) {
			System.out.println("提示：该文件中不含英文引号的内容!!!");
		} else {
			for (String s : list) {
				//System.out.println("字符串-----    " + s);
			}
		}
		return list;

	}

}
