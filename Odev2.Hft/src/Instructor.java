
public class Instructor {
	
	int instructorId;
	String instructorName;

	public Instructor() 
	{
	    System.out.println("E�itmeni Se�tiniz!");
	}
	public Instructor(int instructorId,String instructorName, String description)
	{
	  this();
	  this.instructorId=instructorId;
		this.instructorName=instructorName;
	}

}
