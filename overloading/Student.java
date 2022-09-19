package overloading;

public class Student {
	 public void getStudentInfo(int id) {
		 int s1=id;
		 System.out.println("Roll NO:"+s1);
	 }
	 public void getStudentInfo(String name){
		 String s2= name;
		 System.out.println("Name:"+s2);
	 }
	 public void getStudentInfo(String email,String  phonenumber) {
		 String  s3=email;
		 System.out.println("email :"+s3);
		 String s4= phonenumber;
		 System.out.println("phoneNo:"+s4);
	 }


	 
		
       

}
