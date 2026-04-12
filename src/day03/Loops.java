package day03;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
//		doExcercise1();
//		sumAndAverage();
//		doExcercise8();
//		doExcercise9();
//		doExcercise10();
//		GradesAverage();
//		printArray();
		arrayToString();
	}

	private static void doExcercise1() {
		byte arrA[];
		arrA = new byte[5];
		arrA[0] = 1;
		arrA[1] = 3;
		arrA[2] = 5;
		arrA[3] = 8;
		arrA[4] = 9;
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
	}
	
	private static void sumAndAverage() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("The sum is: " +sum);
		System.out.println("The average is: "+(double)sum/100);
	}
	
	private static void doExcercise8() {
//		String arrn[][];
//		arrn = new String[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("# ");
			}
			System.out.print("\r\n");
		}
	}

	private static void doExcercise9() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print(" #");
				}
			}
			System.out.println("\r\n");
		}
	}
	
	private static void doExcercise10() {
		String chuoi = "Hello World"; 
		int i = 0;
		while (i < chuoi.length()) {
			if (chuoi.charAt(i) == 'r') {
				System.out.println("position of 'r' in the string is: " + (i + 1));
				break;
			}
			i++;

		}
		if (i == chuoi.length()) {
			System.out.println("there is no 'r' in the string");
		}
	}
	
	private static void GradesAverage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of students: ");
		int numStudents = scanner.nextInt();
		int i = 0;
		int totalgrades = 0;
		byte grades[] = new byte[numStudents];
		while (i < numStudents) {
			System.out.println("Input grade for student " + (i+1) +": ");
			grades[i] = scanner.nextByte() ;
			if (grades[i] >= 0 && grades[i] <= 100) {
				totalgrades = totalgrades + grades[i];
				i++;
			}
			else {
				System.out.println("Invalid grade, try again...");
			}
		}
		scanner.close();
		System.out.println("Average grade of all students is: " +(double)totalgrades/(double)numStudents);
	}
	
	private static void printArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input size of array: ");
		int a = scanner.nextInt();
		int arrA[] = new int[a];
//		to handle double, change data type to double (double arrA[] = new double[a])
		int i = 0;
		if (a == 0) {
			System.out.println("Empty array");
		} else {
			while (i < a) {
				System.out.println("Input number a" + (i + 1) + ": ");
				arrA[i] = scanner.nextInt();
//				to handle double, change to next.double()
				i++;
			}
			for (int j = 0; j < arrA.length; j++) {
				if (j == arrA.length - 1) {
					System.out.print(arrA[j]);
				} else {
					System.out.print(arrA[j] + ", ");
				}
			}
			scanner.close();
		}
	}
	
	private static void arrayToString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input size of array: ");
		int a = scanner.nextInt();
		int arrA[] = new int[a];
		int i = 0;
		String s = "";
		if (a == 0) {
			System.out.println("Nothing to display (Empty array)");
		} else {
			while (i < a) {
				System.out.println("Input number a" + (i + 1) + ": ");
				arrA[i] = scanner.nextInt();
				if (i == arrA.length - 1) {
					s = s +  String.valueOf(arrA[i]);
				} else {
					s = s +  String.valueOf(arrA[i]) + ", ";
				}
				i++;
			}
			System.out.println(s);
			scanner.close();
		}
	}
}

