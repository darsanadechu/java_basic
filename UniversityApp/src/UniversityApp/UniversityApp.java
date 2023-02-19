package UniversityApp;
import java.util.*;


//university class
class University
{
	//student arraylist
	public static ArrayList<Student> studentList=new ArrayList<Student>();
	//faculty arraylist
	public static ArrayList<Faculty> facultyList=new ArrayList<Faculty>();
	//course arraylist
	public static ArrayList<Course> courseList=new ArrayList<Course>();
	
	
	
	University()
	{
	}
	
	//function for add
	void add()
	{
		Course course=new Course();
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
				Faculty1.addFacultyCourse();
				course.faculty=Faculty1;
				facultyList.add(Faculty1);
				break;
		case 3:	//add a course
				Course Course1=new Course();
				Course1.addCourse();
				courseList.add(Course1);
				break;
		
		}
	}
	
	//function for delete
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
				Iterator i=studentList.iterator();
				System.out.println("Enter the Id of the student to be deleted");
				int studId =sc.nextInt();
				while(i.hasNext())
				{
					if(((Student) i.next()).getStudentId()==studId) {
						i.remove();;
					}
				}
				break;
		
		case 2:	//Delete a faculty
				Iterator i1=facultyList.iterator();
				System.out.println("Enter the Id of the faculty to be deleted");
				int facId =sc.nextInt();
				while(i1.hasNext())
				{
					if(((Faculty) i1.next()).getFacultyId()==facId) {
						i1.remove();
					}
				}
				break;
				
		case 3: //Delete a course
				Iterator i2=courseList.iterator();
				System.out.println("Enter the Id of the course to be deleted");
				String crId =sc.next();
				while(i2.hasNext())
				{
					if(Objects.equals(crId, ((Course) i2.next()).getCourseId())) {
						i2.remove();
					}
				}
				break;
				
		default : System.out.println("Invalid choice");
				
		}
	}
	
	//update function
	void update()
	{
		Course course=new Course();
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
						if(s.getStudentId()==studId) 
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
						if(f.getFacultyId()==facId) 
						{
						facultyList.remove(f);
						f.addDetails();
						f.addFacultyCourse();
						course.faculty=f;
						facultyList.add(f);
						}
					}
					break;
				
			case 3: //update course details
					System.out.println("Enter the Id of the course to be updated");
					String crId =sc.next();
					for(Course c: courseList)
					{
						if(Objects.equals(crId, c.getCourseId()))
						{
							courseList.remove(c);
							c.addCourse();
							courseList.add(c);
							break;
						}
					}
					break;
			default : System.out.println("Invalid choice");
		}
	}
	
	//print function
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
						System.out.println(student.getName());
					break;
					
			case 2: //print all faculty name
					System.out.println("printing all faculties");
					for(Faculty faculty :facultyList)
						System.out.println(faculty.getName());
					break;
					
			case 3: //print all course name
					System.out.println("printing all courses");
					for(Course course :courseList)
						System.out.println(course.getCourseTitle());
					break;	
					
			case 4: //print information of a student by student id
					System.out.println("Enter id of student information to be printed: ");
					int studId=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studId)
							displayDetails(student);
					break;
					
			case 5: //print information of a course by course id
					System.out.println("Enter id of course information to be printed: ");
					String courId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courId, course.getCourseId()))
							displayDetails(course);
					break;
					
			case 6:  //print information of a faculty by faculty id
					System.out.println("Enter id of faculty information to be printed: ");
					int faculId=sc.nextInt();
					for(Faculty faculty:facultyList)
						if(faculty.getFacultyId()==faculId)
							displayDetails(faculty);
					break;
					
			case 7: //print student list and faculty information of a course
					System.out.println("Enter id of course which students and faculty are printed");
					String coursId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(coursId, course.getCourseId()))
						{
							System.out.println("Student list: ");
							for(String str:course.studentsEnrolled)
								System.out.println(str);
							displayDetails(course.faculty);
						}
					break;
					
			case 8: //print course taken by a student
					System.out.println("Enter id of student whose courses are printed");
					int studID=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studID)
							student.displayStudentCourse();
					break;
			default : System.out.println("Invalid choice");
		}
		
	}
	
	//method overloading for printing 
	void displayDetails(Student student)
	{
		System.out.println("Student details :");
		System.out.println("ID :"+student.getStudentId());
		System.out.println("Name :"+student.getName());
		System.out.println("Email :"+student.getEmail());
		System.out.println("CGPA :"+student.getStudentCgpa());
	}
	
	void displayDetails(Faculty faculty)
	{
		System.out.println("Faculty details :");
		System.out.println("ID :"+faculty.getFacultyId());
		System.out.println("Name :"+faculty.getName());
		System.out.println("Email :"+faculty.getEmail());
		System.out.println("Faculty position :"+faculty.getFacultyPosition());
	}
	
	void displayDetails(Course course)
	{
		System.out.println("Course details :");
		System.out.println("ID :"+course.getCourseId());
		System.out.println("Title :"+course.getCourseTitle());
		System.out.println("Credit :"+course.getCourseCredit());
		
	}
	
	//search function
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
					int flag1=0;
					System.out.println("Enter id of student  to be searched: ");
					int studId=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studId)
						{
							System.out.println("student found");
							displayDetails(student);
							flag1++;
						}
					if(flag1==0)
						System.out.println("student not found");
					break;
		
			case 2: //search a course
					int flag2=0;
					System.out.println("Enter id of course  to be searched: ");
					String courId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courId, course.getCourseId()))
						{
							System.out.println("course found");
							displayDetails(course);
							flag2++;
						}
					if(flag2==0)
						System.out.println("course not found");
					break;
					
			case 3: //search a faculty
					int flag3=0;
					System.out.println("Enter id of faculty  to be searched: ");
					int faculId=sc.nextInt();
					for(Faculty faculty:facultyList)
						if(faculty.getFacultyId()==faculId)
						{
							System.out.println("faculty found");
							displayDetails(faculty);
							flag3++;
						}
					if(flag3==0)
						System.out.println("course not found");
					break;
				
			case 4://search whether a student takes a course
					int flag4=0;
					System.out.println("Enter id of course to be searched for student");
					String coursId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(coursId, course.getCourseId()))
						{
							if(!course.studentsEnrolled.isEmpty())
							{
								System.out.println("student found");
								System.out.println("Student list: ");
								for(String str:course.studentsEnrolled)
									System.out.println(str);
								flag4++;
							}
						}
					if(flag4==0)
						System.out.println("student not found");
						
					break;
					
			case 5://search whether a faculty teaches a course
					int flag5=0;
					System.out.println("Enter id of course to be searched for student");
					String courseId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(courseId, course.getCourseId()))
						{
							if(!course.faculty.equals(null))
							{
								System.out.println("faculty found");
								displayDetails(course.faculty);
								flag5++;
							}
						}
					if(flag5==0)
						System.out.println("faculty not found");
					break;
				
			case 6://search course taken by a student
					int flag6=0;
					System.out.println("Enter id of student whose courses are searched");
					int studID=sc.nextInt();
					for(Student student:studentList)
						if(student.getStudentId()==studID)
						{
							System.out.println("courses taken by student");
							student.displayStudentCourse();
							flag6++;
						}
					if(flag6==0)
						System.out.println("course not found");
					break;
			case 7://search course taught by a faculty
					int flag7=0;
					System.out.println("Enter id of course  to be searched: ");
					String couId=sc.next();
					for(Course course:courseList)
						if(Objects.equals(couId, course.getCourseId()))
						{
							System.out.println("faculty found");
							displayDetails(course.faculty);
							flag7++;
						}
					if(flag7==0)
						System.out.println("faculty not found");
					break;
					
			default : System.out.println("Invalid choice");		
					
					
				
		}
		
		
	}
	
		
	
}



//parent class person
class Person
{
	University university=new University();
	private String name;
	private String email; 
	
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
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
}

//sub class student
class Student extends Person
{
	private int studentId;
	private double studentCGPA;
	ArrayList<String> studentCourse=new ArrayList<>();
	
	Student()
	{
	}
	
	@Override public void addDetails()
	{
		Course course=new Course();
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id :");
		studentId=sc.nextInt();
		super.addDetails();
		System.out.println("Enter CGPA:");
		studentCGPA=sc.nextDouble();
		
		System.out.println("want to register course");
		if(sc.nextBoolean())
		{
			System.out.println("Enter number of courses to be registered");
			int n=sc.nextInt();
			System.out.println("Enter courses names : ");
			for(int i=1;i<=n;i++)
			{
				String courseName=sc.next();
				for(Course course1:university.courseList)
					if(Objects.equals(courseName, course1.getCourseTitle()))
					{
						studentCourse.add(courseName);
						course.studentsEnrolled.add(course1.getCourseTitle());
						flag++;
					}
				if(flag==0)		
					System.out.println("course not found ");
						
			}
		}
	}
	
	void displayStudentCourse()
	{
		System.out.println("Courses :");
		for(String str:studentCourse)
			System.out.println(str);
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public double getStudentCgpa()
	{
		return studentCGPA;
	}
	
}

//subclass faculty
class Faculty extends Person
{
	private int facultyId;
	private String facultyPosition;
	Course Course1;
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
	void addFacultyCourse()
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course taken :");
		String courseName=sc.next();
		for(Course course:university.courseList)
			if(Objects.equals(courseName, course.getCourseTitle()))
			{
				Course1=course;
				flag++;
			}
		if(flag==0)
			System.out.println("course not found ");
	}
	public int getFacultyId()
	{
		return facultyId;
	}

	public String getFacultyPosition()
	{
		return facultyPosition;
	}
}

//class course
class Course 
{
	University university1=new University();
	private String courseId, courseTitle;
	private double credit;
	private int numberOfStudents;
	public ArrayList<String> studentsEnrolled=new ArrayList<>();
	Faculty faculty;
	
	Course()
	{
		
	}
	
	public Course(String id, String title, double d) {
		this.courseId=id;
		this.courseTitle=title;
		this.credit=d;
	}

	public void addCourse()
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course id: ");
		this.courseId=sc.next();
		System.out.println("Enter course title :");
		this.courseTitle=sc.next();
		System.out.println("Enter course credits: ");
		this.credit=sc.nextDouble();
		
		//add student
		System.out.println("want to add student");
		if(sc.nextBoolean())
		{
			System.out.println("Enter students number of students enrolled");
			numberOfStudents=sc.nextInt();
			System.out.println("Enter students :");
			for(int i=1;i<=numberOfStudents;i++)
				studentsEnrolled.add(sc.next());
		}
		
		//drop student
		/*System.out.println("want to drop a student");
		if(sc.nextBoolean())
		{
			System.out.println("Enter name of student to be dropped");
			String str1=sc.next();
			for(String str:studentsEnrolled)
				studentsEnrolled.remove(str1);
		}*/
		
		//to add faculty
		System.out.println("want to add faculty");
		if(sc.nextBoolean())
		{
			System.out.println("Enter faculty :");
			faculty=new Faculty();
			faculty.addDetails();
			for(Faculty faculty1:university1.facultyList)
				if(Objects.equals(faculty1.getName(),faculty.getName()))
					flag=1;
			if(flag==0)
				university1.facultyList.add(faculty);
		}
		
		//drop faculty
		/*System.out.println("want to drop faculty");
		if(sc.nextBoolean())
		{
			faculty=null;
			
		}*/
				
	}
	public String getCourseId()
	{
		return courseId;
	}
	
	public String getCourseTitle()
	{
		return courseTitle;
	}
	
	public double getCourseCredit()
	{
		return credit;
	}
	
	public int getStudentNumber()
	{
		return numberOfStudents;
	}
}



public class UniversityApp
{
	
	public static void main(String[] arg)
	{
		University university=new University();
		Course course1=new Course("c1","ise",0.0);
		university.courseList.add(course1);
		Course course2=new Course("c2","maa",4.0);
		university.courseList.add(course2);
		Course course3=new Course("c3","ml",4.0);
		university.courseList.add(course3);
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
