
public class UserManager {

	public void addToUser(User user) 
	{
		System.out.println("Sisteme eklendi\t" + user.userName + user.userSurname  );
	}
	
	public void userUpdate(User user) 
	{
		System.out.println("Sistemde G�ncellendi!\t" + user.userName);
	}
}
