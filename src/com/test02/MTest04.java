package com.test02;

class Test02 {
	private int a;
	private int b;

	// ������� a���� �� ���� �� ����
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	// ���� �����ϴ� ����
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	} // ������� b���� �� ���� �� ����
}

public class MTest04 {

	public static void main(String[] args) {
		// Test02Ŭ������ ���� 1000�� �Է��� �� ����غ���.
		Test02 t1 = new Test02(); // a ��������� �޸� �Ҵ�ȴ�.
		t1.setA(1000); // ������ �� ����
		System.out.println(t1.getA()); // ������ �� ���

		t1 = new Test02();
		t1.setB(2000);
		System.out.println(t1.getB());
	}

}
