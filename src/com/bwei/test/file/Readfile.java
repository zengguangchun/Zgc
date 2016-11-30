package com.bwei.test.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * 1. 遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
    要求：尽可能简单、逻辑清晰
           所选存储格式结构也能看出层级关系，并可读写后直接使用
 * 2.作者：曾光春2016/11/30
 */
public class Readfile {
	public static void readAll(File file){
	System.out.println("遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中要求：尽可能简单、逻辑清晰所选存储格式结构也能看出层级关系，并可读写后直接使用");
		//判断是否是文件
		if(file.isDirectory()){
			//如果是文件夹。，就打印出来
			System.out.println("文件夹"+file);
			//把File放在数组，在用listfile
			File[] files = file.listFiles();
			//遍历数组
			for (File f:files) {
				readAll(f);
			}
		}else{
			System.out.println("文件"+file);
		}
	}
	
	
	
}
