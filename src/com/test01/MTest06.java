package com.test01;
//Integer Ŭ������ non_static �޼ҵ带 ȣ���� ����
//�ܺ� (��Ʈ��ũ����, ���������, �����ͺ��̽�, ������) => CSV�� �����ߴ�.
//SCV(excel)�� ��� �����Ͱ� �������� String���� ����Ǿ���.
//String�� ������ �����ؼ� Nosql�� �����ؼ� ��ǥ�� �ν�

public class MTest06 {
	public static void main(String[] args) {
		String su="98.7";
			//1. String => Double => Integer 
			Double d = new Double(su);
			int res = d.intValue();
			//Integer i = new Integer(su);
			//double d = i.doubleValue();
			
			res = new Double(su).intValue();
			
		System.out.println(res);
		
	}

}
