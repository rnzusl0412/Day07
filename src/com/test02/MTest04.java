package com.test02;

class Test02 {
	private int a;
	private int b;

	// 멤버변수 a에게 값 전달 및 변경
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	// 값을 리턴하는 구조
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	} // 멤버변수 b에게 값 전달 및 변경
}

public class MTest04 {

	public static void main(String[] args) {
		// Test02클래스를 통해 1000을 입력한 후 출력해보자.
		Test02 t1 = new Test02(); // a 멤버변수가 메모리 할당된다.
		t1.setA(1000); // 값전달 및 변경
		System.out.println(t1.getA()); // 전달한 값 출력

		t1 = new Test02();
		t1.setB(2000);
		System.out.println(t1.getB());
	}

}
