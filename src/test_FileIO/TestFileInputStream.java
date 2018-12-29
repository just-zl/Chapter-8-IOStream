package test_FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//文件的输入流
public class TestFileInputStream {

	public static void main(String[] args) {
		FileInputStream in = null;
		try{
			in = new FileInputStream("D:\\eclipse-workspace\\Chapter-8-IOStream\\src\\test_FileIO\\TestFileInputStream.java");
		}
		catch (FileNotFoundException e) {
			System.out.println("文件未找到");  //中文打印出来会是？？？？，因为一个汉字占两个字节，而程序是一个字节一个字节输出的
			System.exit(-1);
		}
		
		try {
			int count = 0;
			int b = in.read();  //一个字节一个字节读取，返回的是一个int类型
			while(b!=-1) {
				System.out.print((char)b);  //在GBK中，一个字符占1个字节?计算机里，一个char占两个字节。如果不强制转换成字符，
				b = in.read();
				count ++;
			}
			in.close();
			System.out.println();
			System.out.println("共读取了"+count+"个字节");
		}
		catch (IOException e) {
			System.out.println("文件读取错误");
			System.exit(-1);
		}
	}

}
