package com.test02;

class Test {
	public int a;
	public static int s;
	static {	//static �������� �ʱ�ȭ
		s=1000;
	}
	public Test() {
		//s=100;
	}
}

public class MTest02 {

	public static void main(String[] args) {
		//Test t1 = new Test();
		//Test t2 = new Test();
		System.out.println(Test.s);
	}

}
