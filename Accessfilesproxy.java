public class Accessfilesproxy implements Resource
{

private Resource resource;

	public void access(int p) {
		
		if(resource == null)
		{
			resource = new Accessfiles();
		}
		if(p > 1)
			resource.access(p);
		else {
			System.out.println("not possible");
		}
	}

}

