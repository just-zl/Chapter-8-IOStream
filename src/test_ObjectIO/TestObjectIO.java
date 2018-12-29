package test_ObjectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Object������ֱ�ӽ����󣨰������������Ժͷ�����д��������   ���л�����Objectֱ��ת��Ϊ�ֽ�����д��Ӳ���ϻ�����
//��������Ϸ�Ĵ浵
public class TestObjectIO {

	public static void main(String[] args) {
		
		T t = new T();
		t.d = 3.14;
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\test\\TestObjectIO.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("D:\\test\\TestObjectIO.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			T tRead = (T)ois.readObject();  //readObject()�������ص���һ��Object���ͣ���Ҫǿ��ת������Ӧ����
			System.out.println("tRead.i ��"+tRead.i+",tRead.s :" + tRead.s+",tRead.d :"+tRead.d);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class T implements Serializable {  //Serializable���ɱ����л��ģ����Ǳ���ͽӿڡ�Ҫʵ�����л�������ʵ�ָýӿ�
	int i = 12;
	String s = "zhangli";
	transient double d = 3.14159265;  //transient ��Ϊ��͸���ġ������������γ�Ա���������������౻���л�ʱ�������Ǹñ�����
									  //�����øñ���������ʾ��Ĭ��ֵ����;�����ɱ����û�������Ϣ���������ϴ���
}
