package com.test01;
//��ü�� �����ؼ� ������ �ϴ� �޼ҵ带 ������
// non-static / static 



public class MTest05 {
	public static Address getAddress(Address r) {
		r.setName("�豹��");
		r.setAddr("������");
		return r;
	}
	public static void main(String[] args) {
		Address a = new Address("�豹��", "����", "010");
		Address res = getAddress(a);	//static 
		res.Prn();
		//int r = getA(); int r = 100;
		
		new MTest05();
		res = MTest05.getAddress(a);
		res.Prn();
	}
	public Address getAddress01(Address r) {
		return r;
	}
}
