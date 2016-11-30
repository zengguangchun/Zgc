package com.bwei.test.abstracts;

import java.util.Scanner;

public class Sum_Xs extends Sum_X {// 继承抽象类
	/**
	 * 1. 有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 2.作者：曾光春2016/11/30
	 */
	@Override
	public void A() {
		// TODO Auto-generated method stub
		System.out.println("抽象方法。。。。。。。。。。。");
		System.out.println("有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？");
		// 计数器变量
		int count = 0;

		/*
		 * 利用三重循环组合数字的百、十、个位
		 */
		// 生成百位
		for (int i = 1; i <= 4; i++) {
			// 生成十位
			for (int j = 1; j <= 4; j++) {
				// 生成个位
				for (int k = 1; k <= 4; k++) {
					// 确保i、j、k三位互不相同
					if (i != j && j != k && i != k) {

						// 计数器累加
						++count;
						// 控制台输出当前组合出的三位数
						System.out.println("第" + count + "种组合方式：" + i + "" + j
								+ "" + k);
					}
				}
			}
		}

		// 控制台输出统计信息
		System.out.println(" 共计" + count + "种三位数组合方式。");

	}

	/**
	 * 1.求100以内的素数 2.曾光春 3.2016/11/30
	 */

	@Override
	public void B() {
		// TODO Auto-generated method stub
		System.out.println("求100以内的素数");
		 /*
	        * 定义变量
	        * k_输出的素数的数量
	        * i_定义为2，
	        * */
	        int i,n,k=0;
	        for (n = 3; n <= 100; n++) {
	            i=2;
	            while (i<n){
	                if (n%i==0){
	                    break;//若能整除说明n不是素数，跳出当前while循环，不执行后边的i++
	                }
	                i++;
	            }
	            //判断i是否=n
	            if (i == n){//如果i==n则说明n不能被2~n-1整除，是素数
	                k++; //统计输出的个数
	                System.out.print(i+"\t");
	                if (k%6 == 0){//没输出5个则换行
	                    System.out.println();
	                }
	            }
	        }

	}

	/**
	 *  1、5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	 * 
	 *  2、作者：曾光春 
	 *  
	 *  3、2016/11/30
	 */

	@Override
	public void C() {
		// TODO Auto-generated method stub
		System.out.println("5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。");
		 int j = 0;
	        for (long i = 10000; i < 100000; i++)
	            if (ishuiwen(i) == 1) {//如果返回值是1，就是回文数，打印出来，如果是0，就不是回文数,不打印
	                j++;
	                System.out.println("回文数:" + i);
	            }
	        System.out.println(j + "个相同的回文数");

	    }

	    public static int ishuiwen(long x) {
	        int a, b, c, d, e;//5个变量
	        a = (int) (x / 10000);//a=i除以10000
	        b = (int) ((x / 1000) % 10);//b=i除以1000后向10取余
	        c = (int) ((x / 100) % 10);//c=i除以100后向10取余
	        d = (int) ((x / 10) % 10);//d=i除以10后向10取余
	        e = (int) (x % 10);//e=i想10取余
	        if ((a == e) && (b == d))//如果a=e并且b=d，就是回文数，返回1
	            return 1;
	        else//否则返回0
	            return 0;

	}

}
