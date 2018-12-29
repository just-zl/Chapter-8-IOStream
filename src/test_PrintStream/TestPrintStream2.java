package test_PrintStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream2 {

	public static void main(String[] args) {
		
		String fileName = args[0];
		if(fileName != null) {
			list(fileName, System.out);
		}
	}
	
	public static void list(String s,PrintStream ps) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(s) );
			String s1 = null;
			while((s1=br.readLine())!=null) {
				ps.println(s1);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ps.println("无法读取此文件");
			e.printStackTrace();
		}
	}

}
