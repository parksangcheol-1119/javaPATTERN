
public class Shape implements Cloneable {
		/*			
	protected Object clone() throws CloneNotSupportedException {
		
		
		 
		return super.clone();
	}
	*/
	
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
