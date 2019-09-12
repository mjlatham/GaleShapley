
/**
 * Woman class that constructs a man with a name and mutators to set preferences and engagement status
 * Extends Person class
 * 
 * @author Matias Latham
 *
 */
public class Woman extends Person {

	private Man manEngagedTo; // The man the woman is engaged to
	private Man[] preference; // The preference ranking of men
	private static int count = 0; // The amount of women
	
	/**
	 * Creates a new woman with the specified name
	 * @param name
	 */
	public Woman(String name) {
		super(name);
		count++;
	}
	
	/**
	 * Gets the amount of women created
	 * @return count
	 */
	public static int getCount() {
		return count;
	}
	
	/**
	 * Gets the man the woman is currently engaged to
	 * @return the man
	 */
	public Man getManEngagedTo() {
		return manEngagedTo; // Return the man that the woman is currently engaged to
	}
	
	/**
	 * Gets the man of this woman's given rank
	 * @param rank this woman's given ranking
	 * @return the man of this woman's rank
	 */
	public Man getPreference(int rank) {
		return preference[rank - 1]; // rank = 1 => preference[0]
	}
	
	/**
	 * Sets the man this woman is currently engaged to
	 * @param woman
	 */
	public void setManEngagedTo(Man man) {
		manEngagedTo = man;
	}
	
	/**
	 * Sets the man's preferences for the given women
	 * @param preference
	 */
	public void setPreference(Man[] preference) {
		int amountOfMen = preference.length; // Get amount of women to rank
		this.preference = new Man[amountOfMen]; // Initialise preference array
		for (int i = 0; i < amountOfMen; i++) {
			this.preference[i] = preference[i]; // Set this man's preferences for the women
		}
	}
	
}
