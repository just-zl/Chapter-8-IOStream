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
			//bis.skip(100);  //��λ����һ�ٸ�λ��  
			bis.mark(100);	//Ҫ����100���ַ�֮�ڣ����markӦ�ñ�����Ч��ϵͳ�ᱣ֤buffer���ٿ��Դ洢100���ַ�
			
			for(int i=0;i<10 && (temp=bis.read())!=-1;i++) {
				System.out.print((char)temp + " ");
			}
			System.out.println();
			System.out.println("***********************");
			bis.reset();  //���»ص�mark��ǵ�λ��
			for(int i=0;i<10 && (temp=bis.read())!=-1;i++) {
				System.out.print((char)temp + " ");
			}
			bis.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
