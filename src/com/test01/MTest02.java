package com.test01;
//this() : ���� ������ ȣ��

//this.	 : ���� ������Ʈ�� ��Ī�ϴ� ������

class My {
	public String name;

	public My() { // default ������
		this("noname"); // 14������ overload ������ȣ��
		// this.name = "�豹��";
		System.out.println("a");

	}

	public My(String name) { // overload ������
		this.name = name; // ���������̱� ������ ���� object�� ��Ī�ϴ� this. �� �;��Ѵ�.
		System.out.println("b");
	} // ������� name = �������� name
}

public class MTest02 {
	public static void Disp(int a) { // int a = 1000
		System.out.println(a);
	}

	public static void main(String[] args) {
		My m1 = new My(); // �⺻ ������ ȣ��
		System.out.println(m1.name + " �� �ּҴ� = " + m1);

		// �Ű����� overload�� ������ ȣ��
		My m2 = new My("������");
		System.out.println(m2.name + " �� �ּҴ� = " + m2);
	}
}
