
public class Category {

	int categoryId;
	String categoryName;
	int numberContent;
	public Category()
	{
	    System.out.println("Programlama Kategorisini Se�tiniz");
	}
	public Category(int categoryId,String categoryName,int numberContent)
	{
	  this();
	  this.categoryId=categoryId;
	  this.categoryName=categoryName;
	  this.numberContent=numberContent;
	}
}
