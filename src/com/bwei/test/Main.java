package com.bwei.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	static int [] arr={1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// writeObjectToFile("写入一句话顶顶顶");//写入
		// readObjectFromFile();//读取
		
		//System.out.println(dg(5));//递归
		
		System.out.println("所找的数 :"+seach(arr,7));//二分法
	}

	// 写入文件保存类容
	public static void writeObjectToFile(Object obj) {
		File file = new File("test.dat");
		FileOutputStream out;
		try {
			out = new FileOutputStream(file);
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(obj);// 写入
			objOut.flush();
			objOut.close();
			System.out.println("写入成功！");
		} catch (IOException e) {
			System.out.println("写入失败！");
			e.printStackTrace();
		}
	}

	// 读取文件类容
	public static Object readObjectFromFile() {
		Object temp = null;
		File file = new File("test.dat");
		FileInputStream in;
		try {
			in = new FileInputStream(file);
			ObjectInputStream objIn = new ObjectInputStream(in);
			temp = objIn.readObject();// 读取
			objIn.close();
			System.out.println("读取成功!");
			System.out.println(temp);
		} catch (IOException e) {
			System.out.println("读取失败！");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return temp;
	}

	/**
	 * 递归
	 */
	static int dg(int i) { /* 定义变量 */
		int sum;
		if (i == 1) { /* 假设条件 */
			return 1;
		} else {
			sum = i + dg(i - 1); /* 1~100的和的表达式 */
			return sum;/* 返回结果 */
		} 
	}
	/**
	 * 二分法
	 */
private static int seach(int[] arr, int i) {
		
		int start=0;
		int end=arr.length-1;
		//用二分法查找的数据必须是排好序的 因此只要比较一个元素和最后一个元素就可以确定所查找的数据是否在数组中
	if (i<arr[start]||i>arr[end]||start>end) {
		return -1;
	}
	while(start<=end){
		//算出中点数值
		int mid=(start+end)/2;
		//如果查找的数据小于中点的位置的数据,则把查找的结束位置定义在中点
		if (i<arr[mid]) {
			end=mid-1;
		}else if (i>arr[mid]) {//如果查找的数据大于中点的位置的数据,则把查找的起始位置定义在中点
			start=mid+1;
		}else{//返回查找的数据
			return mid;
		}
	}
		return -1;
	}
}
