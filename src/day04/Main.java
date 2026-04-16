package day04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		inThongTin2();
	}
	
	private static void inThongTin1() {
		GiaoVienToan giaoVienToan1 = new GiaoVienToan();
		giaoVienToan1.teacherID = "01";
		giaoVienToan1.name = "Tuan";
		giaoVienToan1.dateOfBirth = "14/03/2012";
		giaoVienToan1.gender = "Nam";
		giaoVienToan1.subject = "Toán";
		GiaoVienToan giaoVienToan2 = new GiaoVienToan();
		giaoVienToan2.teacherID = "02";
		giaoVienToan2.name = "Chinh";
		giaoVienToan2.dateOfBirth = "01/03/2007";
		giaoVienToan2.gender = "Nu";
		giaoVienToan2.subject = "Toán";
		GiaoVienToan giaoVienToan3 = new GiaoVienToan();
		giaoVienToan3.teacherID = "03";
		giaoVienToan3.name = "Ngoc";
		giaoVienToan3.dateOfBirth = "24/12/2009";
		giaoVienToan3.gender = "Nam";
		giaoVienToan3.subject = "Toán";
		ArrayList<GiaoVienToan> teachers = new ArrayList<>();
		teachers.add(giaoVienToan1);
		teachers.add(giaoVienToan2);
		teachers.add(giaoVienToan3);
		GiaoVienTiengAnh giaoVienTiengAnh1 = new GiaoVienTiengAnh();
		giaoVienTiengAnh1.teacherID = "04";
		giaoVienTiengAnh1.name = "Thinh";
		giaoVienTiengAnh1.dateOfBirth = "27/02/2010";
		giaoVienTiengAnh1.gender = "Nam";
		giaoVienTiengAnh1.subject = "Tiếng Anh";
		GiaoVienTiengAnh giaoVienTiengAnh2 = new GiaoVienTiengAnh();
		giaoVienTiengAnh2.teacherID = "05";
		giaoVienTiengAnh2.name = "Trung";
		giaoVienTiengAnh2.dateOfBirth = "30/11/2005";
		giaoVienTiengAnh2.gender = "Nu";
		giaoVienTiengAnh2.subject = "Tiếng Anh";
		GiaoVienTiengAnh giaoVienTiengAnh3 = new GiaoVienTiengAnh();
		giaoVienTiengAnh3.teacherID = "06";
		giaoVienTiengAnh3.name = "Anh";
		giaoVienTiengAnh3.dateOfBirth = "01/01/2006";
		giaoVienTiengAnh3.gender = "Nu";
		giaoVienTiengAnh3.subject = "Tiếng Anh";
		GiaoVienTiengAnh giaoVienTiengAnh4 = new GiaoVienTiengAnh();
		giaoVienTiengAnh4.teacherID = "07";
		giaoVienTiengAnh4.name = "Minh";
		giaoVienTiengAnh4.dateOfBirth = "22/11/2013";
		giaoVienTiengAnh4.gender = "Nam";
		giaoVienTiengAnh4.subject = "Tiếng Anh";
		GiaoVienTiengAnh giaoVienTiengAnh5 = new GiaoVienTiengAnh();
		giaoVienTiengAnh5.teacherID = "08";
		giaoVienTiengAnh5.name = "Xuan";
		giaoVienTiengAnh5.dateOfBirth = "15/8/2012";
		giaoVienTiengAnh5.gender = "Nu";
		giaoVienTiengAnh5.subject = "Tiếng Anh";
		ArrayList<GiaoVienTiengAnh> giaoVienTiengAnhs = new ArrayList<GiaoVienTiengAnh>();
		giaoVienTiengAnhs.add(giaoVienTiengAnh1);
		giaoVienTiengAnhs.add(giaoVienTiengAnh2);
		giaoVienTiengAnhs.add(giaoVienTiengAnh3);
		giaoVienTiengAnhs.add(giaoVienTiengAnh4);
		giaoVienTiengAnhs.add(giaoVienTiengAnh5);
		System.out.printf("%-12s %-20s %-12s %-3s %-10s%n", "Mã GV", "Tên", "Ngày sinh", "Giới Tính", "Môn dạy");
		for (GiaoVienToan giaoVienToan : teachers) {
			giaoVienToan.inThongTin();
		}
		for (GiaoVienTiengAnh giaoVienTiengAnh : giaoVienTiengAnhs) {
			giaoVienTiengAnh.inThongTin();
		}
	}
	
	/**
	 * sử dụng extend - tính kế thừa
	 */
	private static void inThongTin2() {
		GiaoVien giaoVienToan1 = new GiaoVienToan();
		giaoVienToan1.teacherID = "01";
		giaoVienToan1.name = "Tuan";
		giaoVienToan1.dateOfBirth = "14/03/2012";
		giaoVienToan1.gender = "Nam";
		giaoVienToan1.subject = "Toán";
		GiaoVien giaoVienToan2 = new GiaoVienToan();
		giaoVienToan2.teacherID = "02";
		giaoVienToan2.name = "Chinh";
		giaoVienToan2.dateOfBirth = "01/03/2007";
		giaoVienToan2.gender = "Nu";
		giaoVienToan2.subject = "Toán";
		GiaoVien giaoVienToan3 = new GiaoVienToan();
		giaoVienToan3.teacherID = "03";
		giaoVienToan3.name = "Ngoc";
		giaoVienToan3.dateOfBirth = "24/12/2009";
		giaoVienToan3.gender = "Nam";
		giaoVienToan3.subject = "Toán";
		ArrayList<GiaoVien> giaoViens = new ArrayList<>();
		giaoViens.add(giaoVienToan1);
		giaoViens.add(giaoVienToan2);
		giaoViens.add(giaoVienToan3);
		GiaoVien giaoVienTiengAnh1 = new GiaoVienTiengAnh();
		giaoVienTiengAnh1.teacherID = "04";
		giaoVienTiengAnh1.name = "Thinh";
		giaoVienTiengAnh1.dateOfBirth = "27/02/2010";
		giaoVienTiengAnh1.gender = "Nam";
		giaoVienTiengAnh1.subject = "Tiếng Anh";
		GiaoVien giaoVienTiengAnh2 = new GiaoVienTiengAnh();
		giaoVienTiengAnh2.teacherID = "05";
		giaoVienTiengAnh2.name = "Trung";
		giaoVienTiengAnh2.dateOfBirth = "30/11/2005";
		giaoVienTiengAnh2.gender = "Nu";
		giaoVienTiengAnh2.subject = "Tiếng Anh";
		GiaoVien giaoVienTiengAnh3 = new GiaoVienTiengAnh();
		giaoVienTiengAnh3.teacherID = "06";
		giaoVienTiengAnh3.name = "Anh";
		giaoVienTiengAnh3.dateOfBirth = "01/01/2006";
		giaoVienTiengAnh3.gender = "Nu";
		giaoVienTiengAnh3.subject = "Tiếng Anh";
		GiaoVien giaoVienTiengAnh4 = new GiaoVienTiengAnh();
		giaoVienTiengAnh4.teacherID = "07";
		giaoVienTiengAnh4.name = "Minh";
		giaoVienTiengAnh4.dateOfBirth = "22/11/2013";
		giaoVienTiengAnh4.gender = "Nam";
		giaoVienTiengAnh4.subject = "Tiếng Anh";
		GiaoVien giaoVienTiengAnh5 = new GiaoVienTiengAnh();
		giaoVienTiengAnh5.teacherID = "08";
		giaoVienTiengAnh5.name = "Xuan";
		giaoVienTiengAnh5.dateOfBirth = "15/8/2012";
		giaoVienTiengAnh5.gender = "Nu";
		giaoVienTiengAnh5.subject = "Tiếng Anh";
		giaoViens.add(giaoVienTiengAnh1);
		giaoViens.add(giaoVienTiengAnh2);
		giaoViens.add(giaoVienTiengAnh3);
		giaoViens.add(giaoVienTiengAnh4);
		giaoViens.add(giaoVienTiengAnh5);
		System.out.printf("%-12s %-20s %-12s %-3s %-10s%n", "Mã GV", "Tên", "Ngày sinh", "Giới Tính", "Môn dạy");
		for (GiaoVien giaoVien : giaoViens) {
			giaoVien.inThongTin();
		}
	}

}
