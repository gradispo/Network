package ch13;

import java.io.File;

public class FileEx2 {

	// 가변인수
	// 배열 밑에는 무조건 for문
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
//		System.out.println("정수 i: " + i + ", 정수 j: " + j);
//		System.out.printf("정수 i: %d, 정수 j: %d", i, j);

		String dir = "C:/Windows";
		File fdir = new File(dir);
		if (fdir.isDirectory()) {
			System.out.println("검색디렉토리 " + dir);
			System.out.println("=================");
			String list[] = fdir.list();
			for (int k = 0; k < list.length; k++) {
				File f = new File(dir+File.separator+list[k]);
				System.out.println("["+list[k]+"]");
			}
		} else { // 가변인수는 인수의 갯수가 무한대, 인수의 갯수가 자동적으로 배열로 생성
			System.out.printf("\n지정한 %s는 디렉토리가 아닙니다.", dir);
		}
	}
}
