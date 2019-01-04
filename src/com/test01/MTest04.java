package com.test01;

//Address 생성자를 통해서 초기값을 전달해서 출력하자.
//단, 객체를 출력하는 static method를 만들어서 매개인자로 받은 후 출력해보자.

public class MTest04 {

	public static void Disp(Address ar) { // 출력하는 메소드를 적용시킬 수 있다.
		ar.Prn();
		ar.setName("공효진");
		System.out.println(ar);
	}

	public static void main(String[] args) {
		Address a = new Address("김국현", "대전", "010");
		Address b = new Address("오승룡", "광주", "4360");
		Address c = new Address("송진영", "부산", "4941");

		System.out.println("a & = " + a); // @15db9742  해쉬테이블

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
