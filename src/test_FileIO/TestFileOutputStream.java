package test_FileIO;

import java.io.*;

//�ļ��ĸ���
public class TestFileOutputStream {

	public static void main(String[] args) {
		FileOutputStream out = null;
		FileInputStream in = null;
		int temp = 0;
		try {
			
			in = new FileInputStream("D:\\eclipse-workspace\\Chapter-8-IOStream\\src\\test_FileIO\\TestFileOutputStream.java");
			//FileInputStream��FileOutputStream�����׳�FileNotFoundException�쳣
			out = new FileOutputStream("D:/test/test.java");  //���û�и��ļ����򴴽�һ��
			//���һ���ж���䣬�ж�test.java�Ƿ��Ѵ��ڣ�����������������������������
			temp = in.read();  //��in.read()��ֵΪ-1ʱ����ʾ�ļ���ȡ���  read()�������׳�IOException�쳣
			while(temp != -1) {
				out.write(temp);
				temp = in.read();
			}
			//�ǵ��ͷ��ڴ�
			in.close();
			out.close();
			
		}catch (FileNotFoundException e) {
			
			System.out.println("δ�ҵ�ָ���ļ�");
			System.exit(-1);
			
		}catch (IOException e) {
			System.out.println("�ļ����ƴ���");
			System.exit(-1);
		}
		System.out.println("�ļ��Ѹ���");
	}

}
