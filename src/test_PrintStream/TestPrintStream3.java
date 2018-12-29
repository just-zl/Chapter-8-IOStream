package test_PrintStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

//实现日志功能

public class TestPrintStream3 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			FileWriter fw = new FileWriter("D:\\test\\TestPrintStream3.txt",true);
			PrintWriter log = new PrintWriter(fw);  //log4j  java里著名的日志开发包
			
			String s = null;
			while((s=br.readLine())!=null) {
				if(s.equalsIgnoreCase("exit")) break;
				//在控制台打印
				System.out.println(s.toUpperCase());
				
				//在日志文件TestPrintStream3.txt 打印相应的数据
				log.print("*****");
				log.println(s.toUpperCase());
				log.flush();	
			}
			log.println("===="+new Date()+"====");
			log.flush();
			log.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
