package test_TransFormIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ǳ����͵�����
public class TestTransform2 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);  //System.in��һ��InputStream����,
																   //InputStreaReader��Ҫ��InputStream�׽�
		BufferedReader br = new BufferedReader(isr);  //��BufferedReader�������һ��һ�ж�ȡ����
		
		String s = null;
		
		try {
			s = br.readLine();  //readLine()�������׳�IOException�쳣��
			while(s!=null) {
				if(s.equalsIgnoreCase("exit")) {
					System.out.println("�����˳�");
					break;
				}
				System.out.println(s.toUpperCase());
				s = br.readLine();
			}
			br.close();  //�ǵùر��ڴ�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
