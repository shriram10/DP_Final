
public class Assistant implements User {
	
	private String name;
	private int priority;
	public Assistant(String n, int p ){
		name = n;
		priority = p;
	}
	
	public void dis() {
		
		System.out.println("employee name is"+name);

	}
	public int getpriority(){
		return priority;
	}
	

}
	
	

