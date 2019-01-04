package com.test01;

/*
 *  이름 		주소		 전화번호
 * 김국현		대전		01043604941
 * 송진영		안양		010
 * 오승룡		서울		010
 */

public class Address {
	@Override
	public String toString() {
		return "Address [name=" + name + ", addr=" + addr + ", phone=" + phone + ", getName()=" + getName()
				+ ", getAddr()=" + getAddr() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String name; // 이름			//멤버변수
	public String addr; // 주소
	public String phone; // phone

	public Address(String name, String addr, String phone) {		//생성자
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
