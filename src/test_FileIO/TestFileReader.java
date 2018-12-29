package test_FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		
		FileReader reader = null;
		int temp;
		try {
			//int len = 0;
			reader = new FileReader("D:\\eclipse-workspace\\Chapter-8-IOStream\\src\\test_FileIO\\TestFileReader.java");
			while((temp = reader.read()) != -1) {
				//char ch = (char)reader.read();
				
				System.out.print((char)temp);  
				//System.out.print((char)reader.read());//这样写，打印出来的内容与预想不一致
				
				/*if(++len >=100) {
					System.out.println();
					len = 0;
				}*/
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("未找到指定文件");
		}catch (IOException e) {
			System.out.println("文件读取错误");
		}

	}

}
