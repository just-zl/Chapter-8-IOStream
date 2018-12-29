package test_TransFormIO;

import java.io.*;

public class TestTransform1 {

	public static void main(String[] args) {
		
		try {
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\test\\Ch8-TestTransform1.txt"));
				osw.write("张立zhangli");  //write会抛出IOException
				System.out.println(osw.getEncoding());
				osw.close();
				
				osw = new OutputStreamWriter(new FileOutputStream("D:\\test\\Ch8-TestTransform1.txt", true),"ISO8859_1");
				//FileOutputStream(name, append)构造方法中name为文件名，append是一个boolean，为true表示在文件已有内容之后添加内容，否则覆盖
				osw.write("张艳zhangyan");
				System.out.println(osw.getEncoding());
				osw.close();
			
			}catch (IOException e) {
				// TODO: handle exception
			}

	}

}
