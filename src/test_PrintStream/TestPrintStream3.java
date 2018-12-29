package test_PrintStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

//ʵ����־����

public class TestPrintStream3 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			FileWriter fw = new FileWriter("D:\\test\\TestPrintStream3.txt",true);
			PrintWriter log = new PrintWriter(fw);  //log4j  java����������־������
			
			String s = null;
			while((s=br.readLine())!=null) {
				if(s.equalsIgnoreCase("exit")) break;
				//�ڿ���̨��ӡ
				System.out.println(s.toUpperCase());
				
				//����־�ļ�TestPrintStream3.txt ��ӡ��Ӧ������
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
