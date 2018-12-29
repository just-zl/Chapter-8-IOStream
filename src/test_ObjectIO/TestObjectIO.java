package test_ObjectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Object流可以直接将对象（包含其所有属性和方法）写入或读出。   序列化：把Object直接转化为字节流，写到硬盘上或网上
//类似于游戏的存档
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
			T tRead = (T)ois.readObject();  //readObject()方法返回的是一个Object类型，需要强制转换成相应类型
			System.out.println("tRead.i ："+tRead.i+",tRead.s :" + tRead.s+",tRead.d :"+tRead.d);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class T implements Serializable {  //Serializable：可被序列化的，它是标记型接口。要实现序列化，必须实现该接口
	int i = 12;
	String s = "zhangli";
	transient double d = 3.14159265;  //transient 意为“透明的”，可用于修饰成员变量，当其所属类被序列化时，不考虑该变量。
									  //若调用该变量，将显示其默认值。用途？？可保护用户敏感信息不在网络上传播
}
