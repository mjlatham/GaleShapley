
/**
 * Man class that constructs a man with a name and mutators to set preferences and engagement status
 * Extends Person class
 * 
 * @author Matias Latham
 *
 */
public class Man extends Person {

//	private final String name; // This man's name
//	private boolean engaged; // Whether or not the man is engaged
	private Woman womanEngagedTo; // The woman the man is engaged to
	private Woman[] preference; // The preference ranking of women
//	private Woman currentWoman; // The woman this man is currently engaged to
//	private Woman nextPreference; // The next best preference of the man
	private static int count;
	
	/**
	 * Creates a new man with the specified name
	 * @param name
	 */
	public Man(String name) {
		super(name);
		count++;
	};
	
	public static int getCount() {
		return count;
	}
	
//	/**
//	 * Gets the man's name
//	 * @return name
//	 */
//	public String getName() {
//		return name;
//	}
	
//	/**
//	 * Gets whether the person is engaged or not
//	 * @return true if engaged, false otherwise
//	 */
//	public boolean isEngaged() {
//		return engaged;
//	}
	
	/**
	 * Gets the woman the man is currently engaged to
	 * @return the woman
	 */
	public Woman getWomanEngagedTo() {
		return womanEngagedTo; // Return the woman that the man is currently engaged to
	}
	
	/**
	 * Gets the woman of this man's given rank
	 * @param rank this man's given ranking
	 * @return the woman of this man's rank
	 */
	public Woman getPreference(int rank) {
		return preference[rank - 1]; // rank = 1 => preference[0]
	}
	
	/**
	 * Sets the woman this man is currently engaged to
	 * @param woman
	 */
	public void setWomanEngagedTo(Woman woman) {
		womanEngagedTo = woman;
		this.setEngaged(true);
	}
	
//	/**
//	 * Sets whether the man is currently engaged
//	 * @param engaged
//	 */
//	public void setEngaged(boolean engaged) {
//		this.engaged = engaged;
//	}
	
	/**
	 * Sets the man's preferences for the given women
	 * @param preference
	 */
	public void setPreference(Woman[] preference) {
		int amountOfWomen = preference.length; // Get amount of women to rank
		this.preference = new Woman[amountOfWomen]; // Initialise preference array
		for (int i = 0; i < amountOfWomen; i++) {
			this.preference[i] = preference[i]; // Set this man's preferences for the women
		}
	}
	
}
