package com.bwei.test.interfaces;

import java.util.Scanner;

public class Tuzishi implements Tuzi {//ʵ��
 
	/**
	 * 1. �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
	 * 2.���ߣ����ⴺ2016/11/30
	 */
	@Override
	public void a() {//������
		System.out.println("�ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�");
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫ���������:");
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
			System.out.println("��" + i + "�µ�������ĿΪ:" + arr[i]);
		}
	}
	/**
	 * 1.��ӡ����������Σ�Ҫ���ӡ��10�����ϣ�
	 * 2.���ߣ����ⴺ2016/11/30
	 */
	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����������Σ�Ҫ���ӡ��10�����ϣ�");
		  int triangle[][]=new int[10][];// ������ά����
	        // ������ά����ĵ�һ��
	        for (int i = 0; i < triangle.length; i++) {
	            triangle[i]=new int[i+1];// ��ʼ���ڶ�������Ĵ�С
	            // �����ڶ�������
	            for(int j=0;j<=i;j++){
	                // �����������Ԫ�ظ�ֵΪ1
	                if(i==0||j==0||j==i){
	                    triangle[i][j]=1;
	                }else{// ������ֵͨ����ʽ����
	                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
	                }
	                System.out.print(triangle[i][j]+"\t");         // �������Ԫ��
	            }
	            System.out.println();               //����

	}}

}
