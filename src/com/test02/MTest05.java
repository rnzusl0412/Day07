package com.test02;

import java.io.IOException;
import java.util.Random;

import com.test01.Address;

public class MTest05 {
	public String toString() {	//������ ���� �޼ҵ带 �������� ���Ӱ� �����Ѵ�.
		return "������";
	}
	public static void main(String[] args) throws IOException {
		MTest05 m = new MTest05();
		System.out.println(m.toString());
		System.out.println(m);
		
		Address ar = new Address();
		System.out.println(ar);
		System.out.println(ar.toString());
		
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.toString());
		
		Random r = new Random();
		System.out.println(r);
		System.out.println(r.toString());
		
		Runtime rt = Runtime.getRuntime();
			rt.exec("mspaint");
	}
}
