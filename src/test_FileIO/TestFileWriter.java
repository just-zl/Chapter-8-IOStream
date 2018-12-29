package test_FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		
		/*FileWriter writer = null;
		try {
			writer = new FileWriter("D:/test/TestUnicode.dat");
			for(int c=0;c<50000;c++) {
				writer.write(c);
			}
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件写入错误");
			System.exit(-1);
		}*/
		FileReader reader = null;
		FileWriter writer = null;
		int temp = 0;
		try {
			reader = new FileReader("D:\\eclipse-workspace\\Chapter-8-IOStream\\src\\test_FileIO\\TestFileWriter.java");
			writer = new FileWriter("D:/test/CopyTestFileWriter.java");
			temp = reader.read();
			while(temp != -1){
				writer.write(temp);
				temp = reader.read();
			}
			reader.close();
			writer.close();
		}catch (FileNotFoundException e) {
			System.out.println("未找到指定文件");
			System.exit(-1);
		}catch (IOException e) {
			System.out.println("文件复制错误");
			System.exit(-1);
		}
		System.out.println("复制成功");
	}

}
