package ch13;

import java.io.IOException;
import java.io.InputStream;

//InputStream(1byte 처리) - InputStreamReader - Reader(문자처리) / FileReader
public class InputSteamEx {

	public static void main(String[] args) {

//	  1. i/o = Input / Output
//	  2. Stream ( 스트림 )

//		System.in; // 키보드
//		() 괄호가 없으면 필드, 변수
//		() 괄호가 있으면 메소드
//		이텔릭체로 누워 있으면 static

		InputStream in = System.in; // 키보드를 객체화
//		자바에서는 예외 처리도 객체화 해놓았음

//	  3.예외처리
//	    Exception <- 예기치 않은 일
//		-> 상황을 생각
//		-> 메소드 제공

		try {
			// throws 메소드는 반드시 예외처리 해야함.
			while (true) {
				// 읽다가 예외 발생시 (예외 객체 메모리 생성후) catch로 이동
				int i = in.read(); // 키보드 입력 전까지 대기 상태 -> 키보드 입력 실행
				if(i==-1)break; // ctrl+z
				System.out.print((char)i);
			}
		} catch (IOException e) { // catch 예외를 잡다.
			e.printStackTrace(); // 예외가 일어난 경로 및 메시지
		}

//	  4.추상클래스, 메소드
//		class (sub class) extend (super class)
//		object : 부모가 없다
//		구체적인 실체가 아닌 경우 추상적인 클래스
//		도형(추상 클래스, 실체가 없는), 사각형,원형,삼각형

//		추상클래스는 > 추상메소드를 포함하고 있다

	}

}
