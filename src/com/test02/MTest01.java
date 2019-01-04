package com.test02;


public class MTest01 {
	public static final int k =10000;
	public static void main(String[] args) {
		int a= 10;		//static 내부에는 그냥 final
		System.out.println("a="+a);
		a = 1000;
		System.out.println("a="+a);
		System.out.println("k="+k);
		System.out.println("k="+MTest01.k);
	
	}

}
