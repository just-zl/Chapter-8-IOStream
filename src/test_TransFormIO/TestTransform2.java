package test_TransFormIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//非常典型的例子
public class TestTransform2 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);  //System.in是一个InputStream类型,
																   //InputStreaReader需要和InputStream套接
		BufferedReader br = new BufferedReader(isr);  //用BufferedReader对象可以一行一行读取数据
		
		String s = null;
		
		try {
			s = br.readLine();  //readLine()方法会抛出IOException异常。
			while(s!=null) {
				if(s.equalsIgnoreCase("exit")) {
					System.out.println("程序退出");
					break;
				}
				System.out.println(s.toUpperCase());
				s = br.readLine();
			}
			br.close();  //记得关闭内存
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
