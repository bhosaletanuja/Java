import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Student{
	String name;
	int grade;
	
	Student(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
}

public class StudentGradeTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Student>students=new ArrayList<>();
		System.out.println("Enter number of Students:");
		int count=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<count;i++) {
			System.out.println("Enter Student Name:");
			String name=sc.nextLine();
			System.out.println("Enter"+name+"s grade:");
			int grade=sc.nextInt();
			sc.nextLine();
			
		students.add(new Student(name,grade));
		}
		int total=0;
		int highest=Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;
		String topStudent="",lowStudent="";
		
		for(Student s:students) {
			total+=s.grade;
			
			if(s.grade>highest) {
				highest=s.grade;
				topStudent=s.name;
				
			}
			if(s.grade<lowest) {
				lowest=s.grade;
				lowStudent=s.name;
				
			}
		}
		double average=(double)total/students.size();
		System.out.println("\n=====Summary Report=====");
		System.out.printf("Average Grade:%2f\n",average);
		System.out.println("Highest Grade:"+highest+"(by"+topStudent+")");
		System.out.println("Lowest Grade:"+lowest+"(by"+lowStudent+")");
		System.out.println("\nAll Student:");
		for(Student s:students) {
			System.out.println(s.name+";"+s.grade);
		}
		
		sc.close();

	}

}
