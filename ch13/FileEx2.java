package ch13;

import java.io.File;

public class FileEx2 {

	// �����μ�
	// �迭 �ؿ��� ������ for��
	public static void plus(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}

	public static void main(String[] args) {

//		plus(1, 2);
//		plus(1, 2, 3);
//		plus(1, 2, 3, 4);
//		plus(1, 2, 3, 4, 5, 6, 7);
//
//		// int <-> Integer
//		int i = 22;
//		Integer it = i;
//
//		int j = new Integer(23);
//		System.out.println("���� i: " + i + ", ���� j: " + j);
//		System.out.printf("���� i: %d, ���� j: %d", i, j);

		String dir = "C:/Windows";
		File fdir = new File(dir);
		if (fdir.isDirectory()) {
			System.out.println("�˻����丮 " + dir);
			System.out.println("=================");
			String list[] = fdir.list();
			for (int k = 0; k < list.length; k++) {
				File f = new File(dir+File.separator+list[k]);
				System.out.println("["+list[k]+"]");
			}
		} else { // �����μ��� �μ��� ������ ���Ѵ�, �μ��� ������ �ڵ������� �迭�� ����
			System.out.printf("\n������ %s�� ���丮�� �ƴմϴ�.", dir);
		}
	}
}
