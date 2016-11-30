package com.bwei.test.interfaces;

import java.util.Scanner;

public class Tuzishi implements Tuzi {//实现
 
	/**
	 * 1. 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
	 * 2.作者：曾光春2016/11/30
	 */
	@Override
	public void a() {//第三题
		System.out.println("古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要计算的月数:");
		int m = input.nextInt();
		int i = 1;
		int[] arr = new int[m + 1];
		for (i = 1; i < m + 1; i++) {
			if (i == 1 | i == 2)
				arr[1] = arr[2] = 1;
			else
				arr[i] = arr[i - 2] + arr[i - 1];
		}
		for (i = 1; i < m + 1; i++) {
			System.out.println("第" + i + "月的兔子数目为:" + arr[i]);
		}
	}
	/**
	 * 1.打印出杨辉三角形（要求打印出10行以上）
	 * 2.作者：曾光春2016/11/30
	 */
	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("打印出杨辉三角形（要求打印出10行以上）");
		  int triangle[][]=new int[10][];// 创建二维数组
	        // 遍历二维数组的第一层
	        for (int i = 0; i < triangle.length; i++) {
	            triangle[i]=new int[i+1];// 初始化第二层数组的大小
	            // 遍历第二层数组
	            for(int j=0;j<=i;j++){
	                // 将两侧的数组元素赋值为1
	                if(i==0||j==0||j==i){
	                    triangle[i][j]=1;
	                }else{// 其他数值通过公式计算
	                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
	                }
	                System.out.print(triangle[i][j]+"\t");         // 输出数组元素
	            }
	            System.out.println();               //换行

	}}

}
