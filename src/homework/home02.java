package homework;

import java.util.Scanner;

public class home02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Sysstem.in 사용자가 입력할 값
		System.out.println(sc);

		int i = sc.nextInt(); 	//sc.nextnInt() = 입력할 값 (int)를 기다리는 Scanner의 하위 class
		System.out.println(i * 1000);
		
		int j = sc.nextInt();
		System.out.println(j*200);
		
		sc.close();		//sc.close() = 결과가 나오면 stop 한다.
	}
}
