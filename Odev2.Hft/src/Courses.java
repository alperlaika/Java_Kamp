
public class Courses {
	 int courseId;
	    String couseName;
	    String instructor;
	    int perCompletion;
	    
	     public Courses() 
	     {
	    	 System.out.println("Kursu ald�n�z");
		 }
	     
	     public Courses(int courseId, String couseName,String instructor,int perCompletion) 
	     {
	    	 this();
	    	 
	    	 this.courseId=courseId;
	    	 this.couseName=couseName;
	    	 this.instructor=instructor;
	    	 this.perCompletion=perCompletion;
	    	 
	     }

}
