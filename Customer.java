import java.util.*;	
public class Customer {
		private String name;
	    private int id;
	    
	   static List<Customer> people = new ArrayList<Customer>();

	    public Customer(String name, int id) {
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

		

	 

	}



