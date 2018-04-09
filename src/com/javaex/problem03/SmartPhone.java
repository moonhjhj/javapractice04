package com.javaex.problem03;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {
		if ("앱".equals(str)) {
			runApps();
		} else {
			super.execute(str);
		}
		// 코드작성

	}

	public void runApps() {
		System.out.println("앱실행");
	}

	public void playMusic() {
		System.out.println("다운로드해서 음악 재생");
	}
	// 메소드작성

	// 메소드작성

}
