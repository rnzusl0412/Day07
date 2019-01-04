package com.test02;

public class fx {
	public int a;
	public double b;
	public String c;

	public fx() {
	}

	public fx(int a, String c) {
		this.a = a;
		this.c = c;
	}

	public void Prn() {
		System.out.printf("%5s %5s %5s \n", a, b, c);
	}

}
