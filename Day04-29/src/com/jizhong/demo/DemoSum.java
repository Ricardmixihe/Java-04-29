package com.jizhong.demo;

public class DemoSum {
	public static void main(String[] args) {
		//计算1~100之间的整数和
		int i = 1;//1~100之间的整数
		int sum = 0;//整数和 ： 5050
		while(i <= 100){
//			sum = sum + i;
			sum += i;
			System.out.println("当前整数为：" + i);
			i++;
		}
		System.out.println("1~100之间的整数和为：" + sum);
		
		
	}
}
