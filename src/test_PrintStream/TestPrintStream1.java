package test_PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream1 {

	public static void main(String[] args) {
		
		PrintStream ps = null;
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\TestPrintStream1.dat");  //�����Զ�����
			ps = new PrintStream(fos);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//��һ
		if(ps!=null) {
			System.setOut(ps);
		}
		int ln = 0;
		for(char c=0;c<=60000;c++) {  //������0-65535��Ҳ��ֱ�Ӹ����ַ�������Ʃ������65��ֵ���ַ������ͱ������ĸ��A����
			System.out.print(c+" ");
			ln++;
			if(ln>=99) {
				System.out.println();
				ln = 0;
			}
		}
		//��һ����
		
		//����
		/*for(char c=0;c<=60000;c++) {  //������0-65535��Ҳ��ֱ�Ӹ����ַ�������Ʃ������65��ֵ���ַ������ͱ������ĸ��A����
			ps.print(c+" ");
			ln++;
			if(ln>=99) {
				ps.println();
				ln = 0;
			}
		}*/
		
	}

}
