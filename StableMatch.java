
/**
 * 
 * 
 * @author Matias Latham
 *
 */
public class StableMatch {
	
	private static Man[] men; // The array of men
	private static Woman[] women; // The array of women
	private static Woman[][] mensPreferences; // The men's preference data array we will create
	private static Man[][] womensPreferences; // The women's preference data array we will create
	private static int engagedCount;
	private static int N;
	
	/**
	 * 
	 */
	public static void createData() {
		engagedCount = 0; // Initialise the amount of engagements to 0
		N = Man.getCount();
		
		// Create the men and women we will match
		Man m1 = new Man("m1");
		Man m2 = new Man("m2");
		Man m3 = new Man("m3");
		Woman w1 = new Woman("w1");
		Woman w2 = new Woman("w2");
		Woman w3 = new Woman("w3");
		
		// Put men and women into their respective arrays
		men = new Man[] {m1, m2, m3};
		women = new Woman[] {w1, w2, w3};
		
		// Create the men's preference array
		mensPreferences = new Woman[][] {
			{w1, w3, w2}, // m1's preferences
			{w1, w2, w3}, // m2's preferences
			{w3, w2, w1}  // m3's preferences
		};
		
		// Create the women's preference array
		womensPreferences = new Man[][] {
			{m3, m2, m1}, // w1's preferences
			{m1, m2, m3}, // w2's preferences
			{m3, m2, m1}  // w3's preferences
		};
		
		// Set each person's preferences
		for (int i = 0; i < 3; i++) {
			men[i].setPreference(mensPreferences[i]); // Set preferences by looping through men and mensPreferences
			women[i].setPreference(womensPreferences[i]); // Set preferences by looping through women and womensPreferences
		}
		
	}
	
	/**
	 * 
	 */
	public static void applyMatchAlgorithm() {
		while (engagedCount < Man.getCount()) {
			for (int i = 0; i < Man.getCount(); i++) {
				Woman preference = men[i].getPreference(i + 1);
				men[i].setWomanEngagedTo(preference);
				
				for (int j = 1; j < Man.getCount(); j++) {
					if (preference.getPreference(j) != men[i]) {
						preference = men[i].getPreference(j + 1);
						men[i].setWomanEngagedTo(preference);
					}
				}
			}
		}
		
		for (int i = 0; i < Man.getCount(); i++) {
			System.out.println(men[i].getWomanEngagedTo().getName());
		}
	}
	
	public static void printMatches() {
		for (int i = 0; i < Man.getCount(); i++) {
			System.out.println(men[i].getWomanEngagedTo().getName());
		}
	}
	
	/**
	 * 
	 */
	public static void main(String[] args) {
//		// Create the men and women we will match
//		Man m1 = new Man("m1");
//		Man m2 = new Man("m2");
//		Man m3 = new Man("m3");
//		Woman w1 = new Woman("w1");
//		Woman w2 = new Woman("w2");
//		Woman w3 = new Woman("w3");
//		
//		// Put men and women into their respective arrays
//		men = new Man[] {m1, m2, m3};
//		women = new Woman[] {w1, w2, w3};
//		
//		// Create the men's preference array
//		mensPreferences = new Woman[][] {
//			{w1, w3, w2}, // m1's preferences
//			{w1, w2, w3}, // m2's preferences
//			{w3, w2, w1}  // m3's preferences
//		};
//		
//		// Create the women's preference array
//		womensPreferences = new Man[][] {
//			{m3, m2, m1}, // w1's preferences
//			{m1, m2, m3}, // w2's preferences
//			{m3, m2, m1}  // w3's preferences
//		};
//		
//		// Set each person's preferences
//		for (int i = 0; i < 3; i++) {
//			men[i].setPreference(mensPreferences[i]); // Set preferences by looping through men and mensPreferences
//			women[i].setPreference(womensPreferences[i]); // Set preferences by looping through women and womensPreferences
//		}
		
		createData();
		applyMatchAlgorithm();
		for (int i = 0; i < Man.getCount(); i++) {
			System.out.println(men[i].getWomanEngagedTo().getName());
		}
		
		System.out.println(men[0].getWomanEngagedTo().getName());
		
		System.out.println("Hello");
		
	}
	
}
