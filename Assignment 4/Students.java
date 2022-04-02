package week3.day1;

public class Students {

	public void getStudentinfo(int Id) {
		// TODO Auto-generated method stub
		System.out.println("Student Id is : "+ Id);
	}
	public void getStudentinfo(int Id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Student Id is : "+ Id);
		System.out.println("Student name is : "+ name);

	}
	public void getStudentinfo(String email, long phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Student email is : "+email);
		System.out.println("Phone Number is : "+phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud = new Students();
		stud.getStudentinfo(100);
		stud.getStudentinfo(101, "Abinaya");
		stud.getStudentinfo("abinaya@gmail.com", 9876543210L);
	}

}
