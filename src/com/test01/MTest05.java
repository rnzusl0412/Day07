package com.test01;
//객체를 생성해서 리턴을 하는 메소드를 만들어보자
// non-static / static 



public class MTest05 {
	public static Address getAddress(Address r) {
		r.setName("김국현");
		r.setAddr("거제도");
		return r;
	}
	public static void main(String[] args) {
		Address a = new Address("김국현", "대전", "010");
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
