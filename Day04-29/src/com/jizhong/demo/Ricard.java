package com.jizhong.demo;

public class Ricard {
	public static void main(String[] args) {
		//计算1-1000之间整数的和
		int i = 0;// 1-100之间的整数
		int sum = 0;//整数和
		while(i <= 1000){
			if (i%2 == 0){//i就是每个1~100之间的整数，i%2==0说明当前循环体内i是偶数
				sum = i + sum;
			}
			i = i +1;
		}
		System.out.println(sum);
	}
}
