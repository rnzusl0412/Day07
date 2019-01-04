package com.test01;
//Address 객체를 생성 후 멤버변수로 값 전달과 출력을 해보자.

public class MTest03 {

	public static void main(String[] args) {
		Address a = new Address();
		Address b = new Address();
		Address c = new Address();

		a.name = "김국현";
		a.addr = "수원";
		a.phone = "01043604941";

		a.Prn();

		b.name = "송진영";
		b.addr = "서울";
		b.phone = "01012341234";

		b.Prn();

		c.name = "오승룡";
		c.addr = "안양";
		c.phone = "01056785678";

		c.Prn();
// 1. 홍길동의 이름을 최길동으로 변경후 전체 출력
// 2. 박길동의 주소를 거제도로 변경 후 전체 출력
// 3. 정길동의 전화번호를 "1234567"로 변경 후 출력
		
		a.name = "국현김";
		a.Prn();
		b.addr = "거제도";
		b.Prn();
		c.phone = "01090909090";
		c.Prn();
		
	}

}
