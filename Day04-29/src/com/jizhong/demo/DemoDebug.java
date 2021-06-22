package com.jizhong.demo;

public class DemoDebug {
	public static void main(String[] args){
		//八戒因贪睡导致四人错过班车，被罚背客车时刻表5遍！
		int flag = 1;
		while(flag <= 5){	//断点
			System.out.println("八戒背了" + flag + "遍！！！");
			flag++;
		}
	}
}
