import java.util.*;
public class Access
{

	public static void main(String[] args) 
	{
	
		Scanner UserInput = new Scanner(System.in);
		
		int typeOf3;
		User Manager ;
		User []users = new User[2];
		Resource resource;
		Factory factory = new Factory();
		
		Manager = factory.manager("Shriram", 1);
		int i=1;
		while(i<2){
			System.out.println("enter name");
			String name = UserInput.next();
			System.out.println("level");
			int p1 = UserInput.nextInt();
			users[i] = factory.Assistant(name, p1);
			i++;
		}
		System.out.println("1.Manager 2.Assistant");
		System.out.println("enter");
		int typeOf = UserInput.nextInt();
		System.out.println("enter priority");
		int pr = UserInput.nextInt();
		int p=1;
		 if(typeOf == 2){
			do{
				
				System.out.println("1.Access resource");
				System.out.println("2.request Access");
				System.out.println("3.logout");
				System.out.println("enter");
				int typeOf2 = UserInput.nextInt();
				if(typeOf2 == 1){
					System.out.println("1.network 2.database 3.accessapp 4.accessfiles");
					 typeOf3 = UserInput.nextInt();
				
				 if(typeOf3 == 1){
						resource = new networkProxy();
						resource.access(pr);
				}
					else if (typeOf3  == 2){
						resource = new Databaseproxy();
						resource.access(pr);
					}
					else if (typeOf3  == 3){
						resource = new Accessappproxy();
						resource.access(pr);
					}
					else if (typeOf3  == 4){
						resource = new Accessfilesproxy();
						resource.access(pr);
					}
					/*if(typeOf2==2)
					{
					Manager m=new Manager(typeOf,pr);
					
					}*/
					if(typeOf2==3)
					{p=0;
					}
					}
				}while(p==1);
				
			}
		}
	}
	

