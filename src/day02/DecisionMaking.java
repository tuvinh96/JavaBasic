package day02;
import java.util.Scanner;
public class DecisionMaking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số N: ");
		int a = scanner.nextInt();
		doExcercise3_2(a);
		scanner.close();
	}
	
	private static void doExcercise2(int n) {
		
		if (n%2 == 1) {
			System.out.println("Weird");
		}
		else if ((n >=2 ) && (n <=5)) {
			System.out.println("Not weird");
		} 
		else if ((n >= 6) && (n <= 20) ) {
			System.out.println("Weird");
			
		}
		else {
			System.out.println("Not weird");
		}
	}
	
	private static void doExcercise3(int X) {
		if ((X>0)&&(X<1000)) {
			if (X<10) {
				System.out.println("Tổng các chứ số của số X là: "+X);
			}
			else if (X<100) {
				System.out.println("Tổng các chứ số của số X là: "+(X/10 + X%10));
			}
			else {
				System.out.println("Tổng các chứ số của số X là: "+(X/100+(X%100)/10+X%10));
			}
		}
		else {
			System.out.println("Số không thoả mãn điều kiện");
		}
	}
	
	private static void doExcercise3_2(int X) {
		if ((X>0)&&(X<1000)) {
			String s = ""+X;
			if (X<10) {
				int a = s.charAt(0)- '0';
				System.out.println("Tổng các chứ số của số X là: "+ a);
			}
			else if (X<100) {
				int a = s.charAt(0)-'0';
				int b = s.charAt(1)-'0';
				System.out.println("Tổng các chứ số của số X là: "+(a+b));
			}
			else {
				int a = s.charAt(0)-'0';
				int b = s.charAt(1)-'0';
				int c = s.charAt(2)-'0';
				System.out.println("Tổng các chứ số của số X là: "+(a+b+c));
			}
		}
		else {
			System.out.println("Số không thoả mãn điều kiện");
		}
	}

}