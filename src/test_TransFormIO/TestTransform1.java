package test_TransFormIO;

import java.io.*;

public class TestTransform1 {

	public static void main(String[] args) {
		
		try {
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\test\\Ch8-TestTransform1.txt"));
				osw.write("����zhangli");  //write���׳�IOException
				System.out.println(osw.getEncoding());
				osw.close();
				
				osw = new OutputStreamWriter(new FileOutputStream("D:\\test\\Ch8-TestTransform1.txt", true),"ISO8859_1");
				//FileOutputStream(name, append)���췽����nameΪ�ļ�����append��һ��boolean��Ϊtrue��ʾ���ļ���������֮��������ݣ����򸲸�
				osw.write("����zhangyan");
				System.out.println(osw.getEncoding());
				osw.close();
			
			}catch (IOException e) {
				// TODO: handle exception
			}

	}

}
