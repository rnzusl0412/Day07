package com.test01;
//this() : 내부 생성자 호출

//this.	 : 현재 오브젝트를 지칭하는 연산자

class My {
	public String name;

	public My() { // default 생성자
		this("noname"); // 14라인의 overload 생성자호출
		// this.name = "김국현";
		System.out.println("a");

	}

	public My(String name) { // overload 생성자
		this.name = name; // 지역변수이기 때문에 현재 object를 지칭하는 this. 가 와야한다.
		System.out.println("b");
	} // 멤버변수 name = 지역변수 name
}

public class MTest02 {
	public static void Disp(int a) { // int a = 1000
		System.out.println(a);
	}

	public static void main(String[] args) {
		My m1 = new My(); // 기본 생성자 호출
		System.out.println(m1.name + " 의 주소는 = " + m1);

		// 매개인자 overload된 생성자 호출
		My m2 = new My("송진영");
		System.out.println(m2.name + " 의 주소는 = " + m2);
	}
}
