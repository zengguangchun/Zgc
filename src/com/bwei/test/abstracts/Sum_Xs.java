package com.bwei.test.abstracts;

import java.util.Scanner;

public class Sum_Xs extends Sum_X {// �̳г�����
	/**
	 * 1. ��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 2.���ߣ����ⴺ2016/11/30
	 */
	@Override
	public void A() {
		// TODO Auto-generated method stub
		System.out.println("���󷽷�����������������������");
		System.out.println("��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�");
		// ����������
		int count = 0;

		/*
		 * ��������ѭ��������ֵİ١�ʮ����λ
		 */
		// ���ɰ�λ
		for (int i = 1; i <= 4; i++) {
			// ����ʮλ
			for (int j = 1; j <= 4; j++) {
				// ���ɸ�λ
				for (int k = 1; k <= 4; k++) {
					// ȷ��i��j��k��λ������ͬ
					if (i != j && j != k && i != k) {

						// �������ۼ�
						++count;
						// ����̨�����ǰ��ϳ�����λ��
						System.out.println("��" + count + "����Ϸ�ʽ��" + i + "" + j
								+ "" + k);
					}
				}
			}
		}

		// ����̨���ͳ����Ϣ
		System.out.println(" ����" + count + "����λ����Ϸ�ʽ��");

	}

	/**
	 * 1.��100���ڵ����� 2.���ⴺ 3.2016/11/30
	 */

	@Override
	public void B() {
		// TODO Auto-generated method stub
		System.out.println("��100���ڵ�����");
		 /*
	        * �������
	        * k_���������������
	        * i_����Ϊ2��
	        * */
	        int i,n,k=0;
	        for (n = 3; n <= 100; n++) {
	            i=2;
	            while (i<n){
	                if (n%i==0){
	                    break;//��������˵��n����������������ǰwhileѭ������ִ�к�ߵ�i++
	                }
	                i++;
	            }
	            //�ж�i�Ƿ�=n
	            if (i == n){//���i==n��˵��n���ܱ�2~n-1������������
	                k++; //ͳ������ĸ���
	                System.out.print(i+"\t");
	                if (k%6 == 0){//û���5������
	                    System.out.println();
	                }
	            }
	        }

	}

	/**
	 *  1��5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	 * 
	 *  2�����ߣ����ⴺ 
	 *  
	 *  3��2016/11/30
	 */

	@Override
	public void C() {
		// TODO Auto-generated method stub
		System.out.println("5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��");
		 int j = 0;
	        for (long i = 10000; i < 100000; i++)
	            if (ishuiwen(i) == 1) {//�������ֵ��1�����ǻ���������ӡ�����������0���Ͳ��ǻ�����,����ӡ
	                j++;
	                System.out.println("������:" + i);
	            }
	        System.out.println(j + "����ͬ�Ļ�����");

	    }

	    public static int ishuiwen(long x) {
	        int a, b, c, d, e;//5������
	        a = (int) (x / 10000);//a=i����10000
	        b = (int) ((x / 1000) % 10);//b=i����1000����10ȡ��
	        c = (int) ((x / 100) % 10);//c=i����100����10ȡ��
	        d = (int) ((x / 10) % 10);//d=i����10����10ȡ��
	        e = (int) (x % 10);//e=i��10ȡ��
	        if ((a == e) && (b == d))//���a=e����b=d�����ǻ�����������1
	            return 1;
	        else//���򷵻�0
	            return 0;

	}

}
