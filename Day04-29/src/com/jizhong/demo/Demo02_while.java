package com.jizhong.demo;

import java.util.Scanner;

public class Demo02_while {
	public static void main(String[] args) {
		//八戒说"是的"则继续跑圈，说"不"则停止跑圈
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();//八戒的回答
//		int flag = 1;//八戒圈数
//		while(str.equals("是的")){
//			System.out.println("八戒跑了" + flag +"圈，继续跑圈！！！");
//			flag++;
//			str = sc.next();
//		}
//		System.out.println("停止跑圈！！！");
//		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//八戒的回答   "是的"
		int flag = 1;//八戒圈数
		boolean bl = true;
		while(bl){	//true
			if (str.equals("是的")) {
				System.out.println("八戒跑了" + flag +"圈，继续跑圈！！！");
				flag++;
				str = sc.next();
			}else if(str.equals("不")){
				bl = false;
			}else {
				System.out.println("八戒不要作弊！！！");
				str = sc.next();
			}
		}
		System.out.println("停止跑圈！！！");
		sc.close();
		
		
		
	}
}
