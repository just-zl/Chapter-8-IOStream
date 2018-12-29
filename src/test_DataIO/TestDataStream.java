package test_DataIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  //会自动在内存中创建一个字节数组
		DataOutputStream dos = new DataOutputStream(baos);
		
		try {
			//通过DataOutputStream 的对象写入两个Java原始数据类型
			dos.writeDouble(Math.random());  //writeDouble()方法会抛出IOException  一个double类型的数据占8个字节
			dos.writeBoolean(true);  //writeBoolean()方法会抛出IOException  一个bool类型的数据占1个字节
			
			//读数据  构建相应的对象
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());  //bais是一个字节数组X
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(bais.available());  //查看bais里有多少个字节
			System.out.println(dis.readDouble());  //先写的先读
			System.out.println(dis.readBoolean());
			
			//记得关闭内存
			dos.close();dis.close();  //为什么只关闭dos和dis？？？？？？？？？？？？？？
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
