package com.jizhong.demo;
/**
 *  ++：自增操作
 * 		++值：先++，后执行代码，先对自身进行+1操作。
 * 		值++：后++，先执行代码，后对自身进行+1操作。
 * 	--：自减操作
 *		--值：先--，后执行代码，先对自身进行-1操作。
 *		值--：后--，先执行代码，后对自身进行-1操作。
 *
 */
public class DemoNumAdd {
	public static void main(String[] args) {
		int num = 0;
		//先进行+1操作，然后执行打印代码。
//		System.out.println(++num);	//1
		
		//先执行打印代码，后对变量进行+1操作
		System.out.println(num++);
		
		
	}
}
