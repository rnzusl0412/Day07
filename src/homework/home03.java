package homework;

import java.util.Scanner;

public class home03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {	// while(true면 진행, false면 stop)
			System.out.println(sc.nextInt()*100);
		}
		sc.close();
	}
}
