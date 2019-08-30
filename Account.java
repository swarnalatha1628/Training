import java.util.TreeSet;

public class Account implements Comparable<Account>{
	private String name;
    private int id;
    
    public int compareTo(Account o1) {
    	   // comparison logic goes here
    	//return o1.getName().compareTo(o2.getName());
    	return o1.getId();

    	  }
    static TreeSet<Account> acc = new TreeSet<Account>();
    public Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void print(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println(this.id);
		System.out.println(this.name);
		
	}

}
