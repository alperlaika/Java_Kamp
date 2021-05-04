
public class Category {

	int categoryId;
	String categoryName;
	int numberContent;
	public Category()
	{
	    System.out.println("Programlama Kategorisini Seçtiniz");
	}
	public Category(int categoryId,String categoryName,int numberContent)
	{
	  this();
	  this.categoryId=categoryId;
	  this.categoryName=categoryName;
	  this.numberContent=numberContent;
	}
}
