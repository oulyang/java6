package m2d12;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(122123,"bjdx");
		Student s2=new Student(122123,"bjdx");
		
		
		Student s3=new Student(12213,new String("bjdx1"));
		Student s4=new Student(12213,new String("bjdx1"));
		
		
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
		
		System.out.println(s3.equals(s4));
		
		
	}

}


class Student{
	int no;
	String school;
	
	public Student() {
		
	}
	public Student(int no,String school) {
		this.no=no;
		this.school=school;
	}
	
	public String toString() {
		return "xuehao"+no+"Ñ§Ð£Ãû³Æ"+school;
	}
	
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Student)) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		Student s=(Student)obj;
		return s.no==this.no&&this.school.equals(s.school);
		
	}
}	
