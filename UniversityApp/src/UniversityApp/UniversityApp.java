package UniversityApp;

import java.util.*;

class University
{
	static ArrayList<Student> studentList=new ArrayList<Student>();
	static ArrayList<Faculty> facultyList=new ArrayList<Faculty>();
	static ArrayList<Course> courseList=new ArrayList<Course>();
	
	University()
	{
		
	}


	void add()
	{
		int addChoice;
		System.out.println("1 : Add a student");
		System.out.println("2 : Add a faculty");
		System.out.println("3 : Add a course");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice for add");
		addChoice=sc.nextInt();
		switch(addChoice)
		{
		case 1: //add a student
				Student Student1 = new Student();
				Student1.addDetails();
				studentList.add(Student1);
				break;
		case 2: //add a faculty
				Faculty Faculty1=new Faculty();
				Faculty1.addDetails();
				facultyList.add(Faculty1);
				break;
		case 3:	//add a course
				Course Course1=new Course();
				Course1.addCourse();
				courseList.add(Course1);
				break;
		
		}
	}
	

	void delete()
	{
		int deleteChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Delete a student");
		System.out.println("2 : Delete a faculty");
		System.out.println("3 : Delete a course");
		System.out.println("Make your choice");
		deleteChoice = sc.nextInt();
		switch(deleteChoice) 
		{
			
		case 1: //Delete a student
				System.out.println("Enter the Id of the student to be deleted");
				int studId =sc.nextInt();
				for(Student s: studentList)
				{
					if(s.studentId==studId) {
						studentList.remove(s);
					}
				}
				break;
		
		case 2:	//Delete a faculty
				System.out.println("Enter the Id of the faculty to be deleted");
				int facId =sc.nextInt();
				for(Faculty f: facultyList)
				{
					if(f.facultyId==facId) {
						facultyList.remove(f);
					}
				}
			
				//to print
				for(Faculty faculty :facultyList)
					faculty.displayDetails();
			
				break;
				
		case 3: //Delete a course
				System.out.println("Enter the Id of the course to be deleted");
				String crId =sc.next();
				for(Course c: courseList)
				{
					if(Objects.equals(crId, c.courseId)) {
						courseList.remove(c);
					}
				}
				
				for(Course course :courseList)
					course.displayCourse();
				break;
				
		default : System.out.println("Invalid choice");
				
		}
		
	}
	
	void update()
	{
		int updateChoice;
		System.out.println("1 : Update a student");
		System.out.println("2 : Update a faculty");
		System.out.println("3 : Update a course");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice for update");
		updateChoice=sc.nextInt();
		switch(updateChoice)
		{
		
			case 1: //update student details
					System.out.println("Enter id of student to be updated :");
					int studId=sc.nextInt();
					for(Student s: studentList)
					{
						if(s.studentId==studId) 
						{
							studentList.remove(s);
							s.addDetails();
							studentList.add(s);
						}
					}
					break;
			case 2:	//update faculty details
					System.out.println("Enter the Id of the faculty to be updated");
					int facId =sc.nextInt();
					for(Faculty f: facultyList)
					{
						if(f.facultyId==facId) 
						{
						facultyList.remove(f);
						f.addDetails();
						facultyList.add(f);
						}
					}
					break;
				
			case 3: //update course details
					System.out.println("Enter the Id of the course to be updated");
					String crId =sc.next();
					for(Course c: courseList)
					{
						if(Objects.equals(crId, c.courseId))
						{
							courseList.remove(c);
							c.addCourse();
							courseList.add(c);
						}
					}
					break;
			default : System.out.println("Invalid choice");
		}
	}
	
	void print()
	{
		int printChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : print all students");
		System.out.println("2 : print all faculties");
		System.out.println("3 : print all courses");
		System.out.println("4 : print information of a student");
		System.out.println("5 : print information of a course");
		System.out.println("6 : print information of a faculty");
		System.out.println("7 : print student list and faculty information of a course");
		System.out.println("8 : print course taken by a student");
		System.out.println("Make your choice");
		printChoice= sc.nextInt();
		switch(printChoice)
		{
			case 1: //print all students name
					System.out.println("printing all students");
					for(Student student :studentList)
						System.out.println(student.name);
					break;
					
			case 2: //print all faculty name
					System.out.println("printing all faculties");
					for(Faculty faculty :facultyList)
						System.out.println(faculty.name);
					break;
					
			case 3: //print all course name
					System.out.println("printing all courses");
					for(Course course :courseList)
						System.out.println(course.courseTitle);
					break;	
					
			case 4: //print information of a student by student id
					System.out.println("Enter id of student information to be printed: ");
					int studId=sc.nextInt();
					for(Student student:studentList)
						if(student.studentId==studId)
							student.displayDetails();
					break;
					
			case 5: //print information of a course by course id
					System.out.println("Enter id of course information to be printed: ");
					String courId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courId, course.courseId))
							course.displayCourse();
					break;
					
			case 6:  //print information of a faculty by faculty id
					System.out.println("Enter id of faculty information to be printed: ");
					int faculId=sc.nextInt();
					for(Faculty faculty:facultyList)
						if(faculty.facultyId==faculId)
							faculty.displayDetails();
					break;
					
			case 7: //pprint student list and faculty information of a course
					System.out.println("Enter id of course which students and faculty are printed");
					String coursId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(coursId, course.courseId))
						{
							System.out.println("Student list: ");
							for(String str:course.studentsEnrolled)
								System.out.println(str);
						
							//faculty details
							
							
						}
					break;
					
			case 8: //print course taken by a student
					System.out.println("Enter id of student whoes courses are printed");
					int studID=sc.nextInt();
					for(Student student:studentList)
						if(student.studentId==studID)
							student.displayStudentCourse();
					break;
			default : System.out.println("Invalid choice");
		}
		
	}
	
	void search()
	{
		int searchChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Search a student");
		System.out.println("2 : search a coure");
		System.out.println("3 : search a faculty");
		System.out.println("4 : search whether a student takes a course");
		System.out.println("5 : search whether a faculty teaches a course");
		System.out.println("6 : search course taken by a student");
		System.out.println("7 : search course taught by a faculty");
		System.out.println("Make your choice");
		searchChoice= sc.nextInt();
		switch(searchChoice)
		{
			case 1: //search a student
					System.out.println("Enter id of student  to be searched: ");
					int studId=sc.nextInt();
					for(Student student:studentList)
						if(student.studentId==studId)
						{
							System.out.println("student found");
							student.displayDetails();
						}
						else
							System.out.println("student not found");
					break;
		
			case 2: //search a course
					System.out.println("Enter id of course  to be searched: ");
					String courId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courId, course.courseId))
						{
							System.out.println("course found");
							course.displayCourse();
						}
						else
							System.out.println("course not found");
					break;
					
			case 3: //search a faculty
					System.out.println("Enter id of faculty  to be searched: ");
					int faculId=sc.nextInt();
					for(Faculty faculty:facultyList)
						if(faculty.facultyId==faculId)
						{
							System.out.println("faculty found");
							faculty.displayDetails();
						}
						else
							System.out.println("course not found");
					break;
				
			case 4:
					break;
					
			case 5:
					break;
				
			case 6:
					break;	
					
			case 7:
				break;	
					
			default : System.out.println("Invalid choice");		
					
					
				
		}
		
		
	}
}

class Person
{
	String name;
	String email; 
	Person()
	{
		
	}
	public void addDetails()
	{
		System.out.println("Enter name :");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter email :");
		email=sc.next();
	}
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Email id : "+email);
	}
}


class Student extends Person
{
	int studentId;
	double studentCGPA;
	ArrayList<String> studentCourse=new ArrayList<>();
	Student()
	{
		
	}
	@Override public void addDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id :");
		studentId=sc.nextInt();
		super.addDetails();
		System.out.println("Enter CGPA:");
		studentCGPA=sc.nextDouble();
		System.out.println("Enter number of courses registered");
		int n=sc.nextInt();
		System.out.println("Enter courses");
		for(int i=1;i<=n;i++)
			studentCourse.add(sc.next());
	}
	void displayStudentCourse()
	{
		System.out.println("Courses :");
		for(String str:studentCourse)
			System.out.println(str);
	}
	@Override public void displayDetails()
	{
		System.out.println("Student ID : "+studentId);
		super.displayDetails();
		System.out.println("Student Cgpa : "+studentCGPA);
		
	}
	
	
}

class Faculty extends Person
{
	int facultyId;
	String facultyPosition;
	Faculty()
	{
		
	}
	@Override public void addDetails()
	{
		System.out.println("Enter faculty id :");
		Scanner sc=new Scanner(System.in);
		this.facultyId=sc.nextInt();
		super.addDetails();
		System.out.println("Enter faculty position :");
		this.facultyPosition=sc.next();
	}
	@Override public void displayDetails()
	{
		System.out.println("Faculty ID : "+facultyId);
		super.displayDetails();
		System.out.println("Faculty position: "+facultyPosition);
	}

}

class Course 
{
	
	String courseId, courseTitle;
	double credit;
	public ArrayList<String> studentsEnrolled=new ArrayList<>();
	Faculty faculty1;
	Course()
	{
		
	}
	public void addCourse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course id: ");
		this.courseId=sc.next();
		System.out.println("Enter course title :");
		this.courseTitle=sc.next();
		System.out.println("Enter course credits: ");
		this.credit=sc.nextDouble();
		System.out.println("Enter students number of students enrolled");
		int n=sc.nextInt();
		System.out.println("Enter students :");
		for(int i=1;i<=n;i++)
			studentsEnrolled.add(sc.next());
	}
	public void displayCourse()
	{
		System.out.println("Course ID: "+courseId);
		System.out.println("Course title : "+courseTitle);
		System.out.println("Credit : "+credit);
		
	}
	
}


public class UniversityApp
{
	public static void main(String[] arg)
	{
		int choice;
		boolean more;
		do
		{
			System.out.println("1 : Add");
			System.out.println("2 : Delete");
			System.out.println("3 : Update");
			System.out.println("4 : Print");
			System.out.println("5 : Search");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			University university=new University();
			switch(choice)
			{
				case 1: university.add();
						break;
				case 2: university.delete();
						break;
				case 3: university.update();
						break;
				case 4: university.print();
						break;
				case 5: university.search();
				        break;
				default : System.out.println("Invalid choice");
			}
			System.out.println("need more");
			more=sc.nextBoolean();
		}while(more);
		
		
	}

}
