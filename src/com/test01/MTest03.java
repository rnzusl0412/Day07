package com.test01;
//Address ��ü�� ���� �� ��������� �� ���ް� ����� �غ���.

public class MTest03 {

	public static void main(String[] args) {
		Address a = new Address();
		Address b = new Address();
		Address c = new Address();

		a.name = "�豹��";
		a.addr = "����";
		a.phone = "01043604941";

		a.Prn();

		b.name = "������";
		b.addr = "����";
		b.phone = "01012341234";

		b.Prn();

		c.name = "���·�";
		c.addr = "�Ⱦ�";
		c.phone = "01056785678";

		c.Prn();
// 1. ȫ�浿�� �̸��� �ֱ浿���� ������ ��ü ���
// 2. �ڱ浿�� �ּҸ� �������� ���� �� ��ü ���
// 3. ���浿�� ��ȭ��ȣ�� "1234567"�� ���� �� ���
		
		a.name = "������";
		a.Prn();
		b.addr = "������";
		b.Prn();
		c.phone = "01090909090";
		c.Prn();
		
	}

}
