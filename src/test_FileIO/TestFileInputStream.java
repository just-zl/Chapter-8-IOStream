package test_FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//�ļ���������
public class TestFileInputStream {

	public static void main(String[] args) {
		FileInputStream in = null;
		try{
			in = new FileInputStream("D:\\eclipse-workspace\\Chapter-8-IOStream\\src\\test_FileIO\\TestFileInputStream.java");
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");  //���Ĵ�ӡ�������ǣ�����������Ϊһ������ռ�����ֽڣ���������һ���ֽ�һ���ֽ������
			System.exit(-1);
		}
		
		try {
			int count = 0;
			int b = in.read();  //һ���ֽ�һ���ֽڶ�ȡ�����ص���һ��int����
			while(b!=-1) {
				System.out.print((char)b);  //��GBK�У�һ���ַ�ռ1���ֽ�?������һ��charռ�����ֽڡ������ǿ��ת�����ַ���
				b = in.read();
				count ++;
			}
			in.close();
			System.out.println();
			System.out.println("����ȡ��"+count+"���ֽ�");
		}
		catch (IOException e) {
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}
	}

}
