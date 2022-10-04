package ch13;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		String str = "Dream as if you'll live forever,\n"
				+ "Live as if you'll die today - 제임스딘";
		
		try {
			FileWriter fw = new FileWriter("ch13/bbb.txt");
			fw.write(str);
			fw.flush();
			fw.close();
			System.out.println("End~~");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 파일이 생성 되더라도 JAVA와 윈도우OS 동기화가 안되서 왼쪽 파인더창에서 안나옴
		// 파일생성후 시간이 좀 지나야 F5 동기화됨
		
		
		
	}

}
