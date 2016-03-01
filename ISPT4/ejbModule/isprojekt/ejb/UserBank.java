package isprojekt.ejb;
import java.util.ArrayList;

public class UserBank {

	ArrayList <User> userList = new ArrayList <User>();
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
