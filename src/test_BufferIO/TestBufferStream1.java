package test_BufferIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferStream1 {

	public static void main(String[] args) {
		int temp = 0;
		try {
			FileInputStream fis = new FileInputStream("D:\\test\\test.java");
			BufferedInputStream bis = new BufferedInputStream(fis);
			System.out.println((char)bis.read());
			System.out.println((char)bis.read());
			//bis.skip(100);  //定位到第一百个位置  
			bis.mark(100);	//要求在100个字符之内，这个mark应该保持有效，系统会保证buffer至少可以存储100个字符
			
			for(int i=0;i<10 && (temp=bis.read())!=-1;i++) {
				System.out.print((char)temp + " ");
			}
			System.out.println();
			System.out.println("***********************");
			bis.reset();  //重新回到mark标记的位置
			for(int i=0;i<10 && (temp=bis.read())!=-1;i++) {
				System.out.print((char)temp + " ");
			}
			bis.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
