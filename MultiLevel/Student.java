package MultiLevel;

public class Student  extends Department{
	public void  studentName() {
		System.out.println("Name:S.Bowyadharshini");
	}
	public void  studentDept(){
		System.out.println("Student Dept:computer science");
	}
	public void  studentId() {
		System.out.println("Student Id:19UCS1725");
	}
	

	public static void main(String[] args) {
		Student  s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
	    s.studentName();
		s.studentDept();
		s.studentId();

	}

}
