package test_FileIO;

import java.io.*;

//文件的复制
public class TestFileOutputStream {

	public static void main(String[] args) {
		FileOutputStream out = null;
		FileInputStream in = null;
		int temp = 0;
		try {
			
			in = new FileInputStream("D:\\eclipse-workspace\\Chapter-8-IOStream\\src\\test_FileIO\\TestFileOutputStream.java");
			//FileInputStream和FileOutputStream都会抛出FileNotFoundException异常
			out = new FileOutputStream("D:/test/test.java");  //如果没有该文件，则创建一个
			//想加一个判断语句，判断test.java是否已存在？？？？？？？？？？？？？？？
			temp = in.read();  //当in.read()的值为-1时，表示文件读取完毕  read()方法会抛出IOException异常
			while(temp != -1) {
				out.write(temp);
				temp = in.read();
			}
			//记得释放内存
			in.close();
			out.close();
			
		}catch (FileNotFoundException e) {
			
			System.out.println("未找到指定文件");
			System.exit(-1);
			
		}catch (IOException e) {
			System.out.println("文件复制错误");
			System.exit(-1);
		}
		System.out.println("文件已复制");
	}

}
