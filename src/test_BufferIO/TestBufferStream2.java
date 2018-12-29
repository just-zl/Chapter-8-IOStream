package test_BufferIO;

import java.io.*;

//BufferedWriter和BufferedReader用的十分普遍，需要记住
public class TestBufferStream2 {

	public static void main(String[] args) {
		
		try{
			//FileWriter(String fileName) 这个构造方法会抛出IOException
			BufferedWriter bWriter = new BufferedWriter(new FileWriter("D:\\test\\TestBufferedStream2.txt"));
			BufferedReader bReader = new BufferedReader(new FileReader("D:\\test\\TestBufferedStream2.txt"));
			
			//往文件中写入数据
			String s = null;
			for(int i=0;i<100;i++) {
				s = String.valueOf(Math.random());  //Math.random返回的是一个static double类型
				bWriter.write(s);
				bWriter.newLine();  //写入一个行分隔符
			}
			bWriter.flush();  //对于输出的缓冲流，写出的数据会先在内存中缓存，使用flush()方法将会使内存中的数据立刻写出
			
			//从文件中读取内容放到s里，存到内存里
			while((s=bReader.readLine())!=null) {
				System.out.println(s);  //将存在s里的文件内容 显示到控制台
			}
			
			//关闭内存
			bWriter.close();
			bReader.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
