package com.bwei.test.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * 1. ������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���
    Ҫ�󣺾����ܼ򵥡��߼�����
           ��ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��
 * 2.���ߣ����ⴺ2016/11/30
 */
public class Readfile {
	public static void readAll(File file){
	System.out.println("������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���Ҫ�󣺾����ܼ򵥡��߼�������ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��");
		//�ж��Ƿ����ļ�
		if(file.isDirectory()){
			//������ļ��С����ʹ�ӡ����
			System.out.println("�ļ���"+file);
			//��File�������飬����listfile
			File[] files = file.listFiles();
			//��������
			for (File f:files) {
				readAll(f);
			}
		}else{
			System.out.println("�ļ�"+file);
		}
	}
	
	
	
}
