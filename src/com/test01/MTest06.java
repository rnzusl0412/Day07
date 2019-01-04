package com.test01;
//Integer 클래스의 non_static 메소드를 호출해 보자
//외부 (네트워크연결, 파일입출력, 데이터베이스, 웹서비스) => CSV에 저장했다.
//SCV(excel)에 모든 데이터가 정수값을 String으로 저장되었다.
//String을 정수로 연산해서 Nosql에 저장해서 좌표로 인식

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
