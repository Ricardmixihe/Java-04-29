package com.jizhong.demo;

import java.util.Scanner;

/**
 * 
 * do while循环语句：
 * 		先执行一遍代码，然后进行条件判断
 *	语句结构：
 *		do{
 *			循环体;
 *		}while(条件判断);
 */
public class Demo_do_while {
	public static void main(String[] args) {
		//悟空先输入密码，然后再做判断密码是否正确
		Scanner sc = new Scanner(System.in);
		String password = "";
		do{
			System.out.println("请输入密码：");
			password = sc.next();
		}while(!password.equals("tangtang123"));	//true
		System.out.println("支付成功！！！");
		sc.close();
	}
}
