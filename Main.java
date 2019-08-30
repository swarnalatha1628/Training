import java.util.*;


public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		boolean b = true;
		while(b){
		System.out.println("choose your choice from below menu:");
		System.out.println("0. EXIT  1.InsertDetails   2.ViewDetails " );
		int choice;
		int cid;
		String cname;
			
		choice=s.nextInt();
		
		switch(choice){
		case 0: b= false;
				break;
		case 1:System.out.println("enter customer id and customer name");
				cid=s.nextInt();
				cname=s.nextLine();
				Customer.people.add(new Customer(cname, cid));
				System.out.println("inserted successfully");
				break;
		case 2:System.out.println("enter customer id:   ");
				int id = s.nextInt();
				for(int i=0; i<Customer.people.size();i++)
				{
					if(Customer.people.get(i).getId()==id)
					{
						System.out.println("Name of this "+id+" is "+Customer.people.get(i).getName());
						break;
					}else {
						
						System.out.println("invalid id");
					}
				}
				break;
		
		}
		
		}
		
	}

}
