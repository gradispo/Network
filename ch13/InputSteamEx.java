package ch13;

import java.io.IOException;
import java.io.InputStream;

//InputStream(1byte ó��) - InputStreamReader - Reader(����ó��) / FileReader
public class InputSteamEx {

	public static void main(String[] args) {

//	  1. i/o = Input / Output
//	  2. Stream ( ��Ʈ�� )

//		System.in; // Ű����
//		() ��ȣ�� ������ �ʵ�, ����
//		() ��ȣ�� ������ �޼ҵ�
//		���ڸ�ü�� ���� ������ static

		InputStream in = System.in; // Ű���带 ��üȭ
//		�ڹٿ����� ���� ó���� ��üȭ �س�����

//	  3.����ó��
//	    Exception <- ����ġ ���� ��
//		-> ��Ȳ�� ����
//		-> �޼ҵ� ����

		try {
			// throws �޼ҵ�� �ݵ�� ����ó�� �ؾ���.
			while (true) {
				// �дٰ� ���� �߻��� (���� ��ü �޸� ������) catch�� �̵�
				int i = in.read(); // Ű���� �Է� ������ ��� ���� -> Ű���� �Է� ����
				if(i==-1)break; // ctrl+z
				System.out.print((char)i);
			}
		} catch (IOException e) { // catch ���ܸ� ���.
			e.printStackTrace(); // ���ܰ� �Ͼ ��� �� �޽���
		}

//	  4.�߻�Ŭ����, �޼ҵ�
//		class (sub class) extend (super class)
//		object : �θ� ����
//		��ü���� ��ü�� �ƴ� ��� �߻����� Ŭ����
//		����(�߻� Ŭ����, ��ü�� ����), �簢��,����,�ﰢ��

//		�߻�Ŭ������ > �߻�޼ҵ带 �����ϰ� �ִ�

	}

}
