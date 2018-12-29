package test_PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream1 {

	public static void main(String[] args) {
		
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\TestPrintStream1.dat");  //可以自动创建
			ps = new PrintStream(fos);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//法一
		if(ps!=null) {
			System.setOut(ps);
		}
		int ln = 0;
		for(char c=0;c<=60000;c++) {  //整数（0-65535）也能直接赋给字符变量。譬如整数65赋值给字符变量就变成了字母“A”，
			System.out.print(c+" ");
			ln++;
			if(ln>=99) {
				System.out.println();
				ln = 0;
			}
		}
		//法一结束
		
		//法二
		/*for(char c=0;c<=60000;c++) {  //整数（0-65535）也能直接赋给字符变量。譬如整数65赋值给字符变量就变成了字母“A”，
			ps.print(c+" ");
			ln++;
			if(ln>=99) {
				ps.println();
				ln = 0;
			}
		}*/
		
	}

}
