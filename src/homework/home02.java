package homework;

import java.util.Scanner;

public class home02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Sysstem.in ����ڰ� �Է��� ��
		System.out.println(sc);

		int i = sc.nextInt(); 	//sc.nextnInt() = �Է��� �� (int)�� ��ٸ��� Scanner�� ���� class
		System.out.println(i * 1000);
		
		int j = sc.nextInt();
		System.out.println(j*200);
		
		sc.close();		//sc.close() = ����� ������ stop �Ѵ�.
	}
}
