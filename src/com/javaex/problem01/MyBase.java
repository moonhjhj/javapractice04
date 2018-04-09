package com.javaex.problem01;

public class MyBase extends Base {

	public void service(String s) {
		if (s.equals("오후")) {
			afternoon();
		} else if (s.equals("밤")) {
			super.night();
		} else {
			day();
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}

	public void night() {
		System.out.println("night");
	}

	// 코드작성

}
