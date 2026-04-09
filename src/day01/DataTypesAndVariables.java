package day01;
import java.util.Scanner;

public class DataTypesAndVariables {

	public static void main(String[] args) {
//		Biến cho bài 1
		String ex1 = "Hello world";
		
//		Biến cho bài 2
		String ex2 = "++++++\r\n\r\n@@@@@@\r\n\r\n******\r\n\r\n######\r\n";
		
//		Biến cho bài 3
		byte ex3a = 10;
		float ex3b = 20.3f;
		double ex3c = 3.14785;
		
//		Biến cho bài 4
		boolean ex4b = true;
		
		Scanner scanner = new Scanner(System.in);
//		Biến cho bài 6
//		System.out.print("Nhập độ F: ");
//		short f = scanner.nextShort();
//		double c = (f-32)/1.8;
		
//		Biến cho bài 7
//		System.out.print("Nhập số inches: ");
//		short i = scanner.nextShort();
//		double m = 0.0254*i;
		
//		Biến cho bài B3
		System.out.print("Nhập số A: ");
		int exA3 = scanner.nextInt();
		System.out.print("Nhập số B: ");
		int exB3 = scanner.nextInt();

		scanner.close();
		
		
		
		
//		doEx1(ex1);
//		doEx3(ex3a,ex3b,ex3c);
//		doEx4(ex4b);
//		doEx6(f,c);
//		doEx7(i, m);
		doExB3(exA3, exB3);
	}
	
	private static void doEx1(String ex) {
		System.out.println(ex);
	}
	
	private static void doEx3(byte b, float f, double d) {
		
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);

	}
	
	private static void doEx4(boolean b) {
		System.out.println(!b);
	}
	
//	Ex5: Find the syntax error in the below programs
//
//	public static void main(String[] args) {
//	        System.out.println("ToolsQA")
//	      }
//==> missing ; at the end of command
//	      public static void main(String[] args) {
//	            System.out.println('ToolsQA');
//	      }
//==> string must be put in " " not ' '
//	     public static void main(String[] args) {
//	            integer value = 18;
//	            System.out.println("The value of the integer variable is : " + value);
//	     }
//==> data type is "int", not "interger"
//	     public static void main(String[] args) {
//	           valueInt int  = 18;
//	           valueDob double = 10.10;
//	           valueBool boolean = true;
//	     }
//==> variables name is keyword
		
	private static void doEx6(short f, double c) {
		System.out.println("Độ F là: " +f);
		System.out.println("Độ C là: " +c);
	}
	
	private static void doEx7(short i, double m) {
		System.out.println(i + " inches thì tương đương với " + m +" meter");
	}
	
//	ExB1
//	class Test 
//	{
//	    public static void main(String [] args) 
//	    {
//	        int x=20;
//	        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
//	        System.out.println(sup);
//	    }
//	}
//
//	 => Hiển thị string "tiny" (do x lớn hơn 15 và nhỏ hơn 20, biến sup đc gán giá trị = tiny) 

	private static void doExB3(int a, int b) {
		System.out.println("Tổng 2 số A và B là: " + (a+b));
		System.out.println("Hiệu của số A trừ cho B là: " + (a-b));
		System.out.println("Tích 2 số A và B là: " +(a*b));
		System.out.println("Thương của số A chia cho B là: "+ (double)a/b);
		System.out.println("Trung bình cộng của 2 số A và B là: "+ (a+b)/2.0);
		System.out.println("Chênh lệch giữa 2 số A và B là: " + Math.abs(a-b));
		System.out.println("Số lớn nhất trong 2 số A và B là: "+ ((a > b)? a:b));
		System.out.println("Số lớn nhất trong 2 số A và B là: "+ ((a > b)? b:a));
	}
	
}
