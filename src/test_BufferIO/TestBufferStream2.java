package test_BufferIO;

import java.io.*;

//BufferedWriter��BufferedReader�õ�ʮ���ձ飬��Ҫ��ס
public class TestBufferStream2 {

	public static void main(String[] args) {
		
		try{
			//FileWriter(String fileName) ������췽�����׳�IOException
			BufferedWriter bWriter = new BufferedWriter(new FileWriter("D:\\test\\TestBufferedStream2.txt"));
			BufferedReader bReader = new BufferedReader(new FileReader("D:\\test\\TestBufferedStream2.txt"));
			
			//���ļ���д������
			String s = null;
			for(int i=0;i<100;i++) {
				s = String.valueOf(Math.random());  //Math.random���ص���һ��static double����
				bWriter.write(s);
				bWriter.newLine();  //д��һ���зָ���
			}
			bWriter.flush();  //��������Ļ�������д�������ݻ������ڴ��л��棬ʹ��flush()��������ʹ�ڴ��е���������д��
			
			//���ļ��ж�ȡ���ݷŵ�s��浽�ڴ���
			while((s=bReader.readLine())!=null) {
				System.out.println(s);  //������s����ļ����� ��ʾ������̨
			}
			
			//�ر��ڴ�
			bWriter.close();
			bReader.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
