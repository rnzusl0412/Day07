package com.test01;

/*
 *  �̸� 		�ּ�		 ��ȭ��ȣ
 * �豹��		����		01043604941
 * ������		�Ⱦ�		010
 * ���·�		����		010
 */

public class Address {
	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", phone=" + phone + ", getName()=" + getName()
				+ ", getAddr()=" + getAddr() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String name; // �̸�			//�������
	public String addr; // �ּ�
	public String phone; // phone

	public Address(String name, String addr, String phone) {		//������
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	public Address() {		//getter setter 
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void Prn() {
		System.out.printf("%7s %7s %15s \n", name, addr, phone);
	}
}
