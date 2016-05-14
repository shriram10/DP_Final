public class Manager implements User {
	
	private String name;
	private int priority;
	public Manager(String n, int p ){
		name = n;
		priority = p;
		//notifydeal();
	}
	
	public void disp() {
		
		System.out.println("employee name is"+name);	
	}
	public void notifydeal()
	{
	
	System.out.println("Received request");
	}

}
