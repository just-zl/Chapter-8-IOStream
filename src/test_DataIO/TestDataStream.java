package test_DataIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  //���Զ����ڴ��д���һ���ֽ�����
		DataOutputStream dos = new DataOutputStream(baos);
		
		try {
			//ͨ��DataOutputStream �Ķ���д������Javaԭʼ��������
			dos.writeDouble(Math.random());  //writeDouble()�������׳�IOException  һ��double���͵�����ռ8���ֽ�
			dos.writeBoolean(true);  //writeBoolean()�������׳�IOException  һ��bool���͵�����ռ1���ֽ�
			
			//������  ������Ӧ�Ķ���
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());  //bais��һ���ֽ�����X
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(bais.available());  //�鿴bais���ж��ٸ��ֽ�
			System.out.println(dis.readDouble());  //��д���ȶ�
			System.out.println(dis.readBoolean());
			
			//�ǵùر��ڴ�
			dos.close();dis.close();  //Ϊʲôֻ�ر�dos��dis����������������������������
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
