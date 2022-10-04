package ch13;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;

// 추상클래스 및 메소드 예제

abstract class Shape {
	abstract void draw(); // 추상 메소드 : 몸체는 없고 선언만 있음.
}

class Rectangle extends Shape {
	@Override
	void draw() {

	}
}

class Circle extends Shape {
	@Override
	void draw() {

	}
}

public class AbstractEx extends Object { // extends Object 생략됨

	private AbstractEx() {
		super(); // 생성자에 생략됨 , 상위 클래스 생성자 Object
	}

	public static void main(String[] args) {
		AbstractEx ae = new AbstractEx();
//		java.awt;
		Button btn = new Button("버튼");
		btn.setBackground(Color.RED); // 일반적으로 상수는 대문자로 표기
		Label label = new Label("라벨");

		try {
			int arr[] = new int[3];
			arr[3] = 22;
		} catch (Exception e) {
			System.out.println("배열예외");
		}

	}

}