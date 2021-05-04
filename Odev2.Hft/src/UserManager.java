
public class UserManager {

	public void addToUser(User user) 
	{
		System.out.println("Sisteme eklendi\t" + user.userName + user.userSurname  );
	}
	
	public void userUpdate(User user) 
	{
		System.out.println("Sistemde Güncellendi!\t" + user.userName);
	}
}
