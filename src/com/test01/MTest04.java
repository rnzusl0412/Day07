package com.test01;

//Address �����ڸ� ���ؼ� �ʱⰪ�� �����ؼ� �������.
//��, ��ü�� ����ϴ� static method�� ���� �Ű����ڷ� ���� �� ����غ���.

public class MTest04 {

	public static void Disp(Address ar) { // ����ϴ� �޼ҵ带 �����ų �� �ִ�.
		ar.Prn();
		ar.setName("��ȿ��");
		System.out.println(ar);
	}

	public static void main(String[] args) {
		Address a = new Address("�豹��", "����", "010");
		Address b = new Address("���·�", "����", "4360");
		Address c = new Address("������", "�λ�", "4941");

		System.out.println("a & = " + a); // @15db9742  �ؽ����̺�

		a.Prn(); // a -> Address
		b.Prn(); // b -> Address
		c.Prn(); // c -> Address

		System.out.println();
		Disp(a); // public stataic void Disp(Address);
		Disp(b);
		Disp(c);


		b.Prn();
	}

}
