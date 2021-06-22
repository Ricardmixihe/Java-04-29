package com.jizhong.demo;

/**
 * 循环语句
 * 	while:
 * 		语法：
 * 			while(判断条件){
 * 				循环体;
 * 			}
 * 			条件满足：则执行循环，反之跳出循环语句。
 * 
 * 	++：自增操作
 * 		++值：先++，后执行代码，先对自身进行+1操作。
 * 		值++：后++，先执行代码，后对自身进行+1操作。
 * 	--：自减操作
 *		--值：先--，后执行代码，先对自身进行-1操作。
 *		值--：后--，先执行代码，后对自身进行-1操作。
 */
public class Demo01_while {
	public static void main(String[] args){
		/*
		 * while(判断条件){
		 * 		循环体;
		 * 	}
		 */
		//1. 定义八戒跑步圈数标记
		int bajie = 1;
		//2. 判断八戒当前跑的圈数是否小于等于30圈，如果小于等于：继续跑圈  如果大于：停止跑圈
		while(bajie <= 30){	//true
			//2.1 八戒跑圈
			System.out.println("八戒跑了" + bajie + "圈！！！");
			//2.2 每跑一圈，标记数+1
			//bajie = bajie + 1;
			
			bajie++;	//先执行代码，后进行++操作
//			bajie = bajie + 1;
		}
		//3. 八戒跑圈完成，惩罚结束
		System.out.println("惩罚结束！！！");
	}
}
