
public class Factory {
	
	
	public User manager(String username, int p){
	
		return new Manager(username,p);
	}
	public User Assistant(String username, int p){
		
		return new Assistant(username,p);
	}
}
