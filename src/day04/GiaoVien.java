package day04;
public class GiaoVien {
	
	public String teacherID;
	public String name;
	public String dateOfBirth;
	public String gender;
	public String subject;
	
	
	public void inThongTin() {
		System.out.printf("%-12s %-20s %-12s %-3s %-10s%n", teacherID, name, dateOfBirth, gender, subject);
	}

}
