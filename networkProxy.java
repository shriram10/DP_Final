public class networkProxy implements Resource
{

private Resource resource;

	public void access(int p) {
		
		if(resource == null)
		{
			resource = new Network();
		}
		if(p > 0)
			resource.access(p);
		else {
			System.out.println("not possible");
		}
	}

}

