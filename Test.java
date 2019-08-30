import java.util.*;


public class Test {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int aid;
		String aname;
		/*System.out.println("enter id and name of accountant:");
		aid=s.nextInt();
		aname=s.nextLine();*/
		Account.acc.add(new Account("swarna",1));
		Account.acc.add(new Account("susmi",2));
		Account.acc.add(new Account("manu",3));
		
		
		/*for(int i=0; i<Account.acc.size();i++) {
			System.out.println(Account.acc);
		}*/
		for(Account a:Account.acc) {
			System.out.println(a);
		}
		
	}
}
