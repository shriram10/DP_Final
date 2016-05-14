
public class Accessappproxy implements Resource {

	private Resource resource;
	
	public void access(int p) {
		if(resource == null)
		{
			resource = new Accessapp();
		}
		if(p > 2)
			resource.access(p);
		else {
			System.out.println("not possible");
		}
	}
}
