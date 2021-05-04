
public class Main {

	public static void main(String[] args) {
		
///////// for user//////////
		
		User user1= new User();
		user1.id=1;
		user1.userName="Laika";
		user1.userSurname="Alper";
		user1.userEmail="laikalpr@gmail.com";
		user1.userPassword= "12345";
		
	User[] users = {user1};
	for(User  user : users) 
	{
		System.out.println(user.userName);
	}
	UserManager userManager = new UserManager();
	userManager.addToUser(user1);
	userManager.userUpdate(user1);
	
	System.out.println("\t");
	
	////////for Course/////
	Courses course1= new Courses();
	course1.courseId=1;
	course1.couseName ="Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
	course1.instructor="Engin Demiroð";
	course1.perCompletion=0;
	
	Courses course2=new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
			"Engin Demiroð",0);
	
	Courses course3=new Courses(3,"Programlamaya Giriþ Ýçin Temel Kurs",
			"Engin Demiroð",0);
	
	Courses[] courses = {course1,course2,course3};
	for(Courses  course : courses) 
	{
		System.out.println(course.couseName);
	}

	CourseManager courseManager = new CourseManager();
	courseManager.addToCourse(course1);
	courseManager.courseUpdate(course1);
	
	courseManager.addToCourse(course2);;
	courseManager.courseUpdate(course2);
	
	courseManager.addToCourse(course3);;
	courseManager.courseUpdate(course3);
	
System.out.println("\t");
	
	////////for Category/////
  Category category1=new Category();
  category1.categoryId=1;
  category1.categoryName="Programlama";
  category1.numberContent=3;
  
System.out.println("\t");

////////for instructor/////
	Instructor instructor1= new Instructor();
	instructor1.instructorId=1;
	instructor1.instructorName="Engin Demiroð";
	
	IntructorManager instructorManager = new IntructorManager();
	instructorManager.description(instructor1);

	}

}
