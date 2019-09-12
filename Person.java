
public class Person {
	private final String name; // This man's name
	private boolean engaged; // Whether or not the man is engaged
	
	/**
	 * Creates a new person with the specified name
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the person's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets whether the person is engaged or not
	 * @return true if engaged, false otherwise
	 */
	public boolean isEngaged() {
		return engaged;
	}
	
	/**
	 * Sets whether the person is currently engaged
	 * @param engaged
	 */
	public void setEngaged(boolean engaged) {
		this.engaged = engaged;
	}
	
}
