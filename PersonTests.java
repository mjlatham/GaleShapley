
/**
 * This class includes a number of test methods for the Person class and its subclasses (Man and Woman)
 * 
 * @author Matias Latham
 *
 */
public class PersonTests {
	
	private static int manFails = 0;
	private static int womanFails = 0;
	
	public static boolean testMan() {
		Man Brad = new Man("Brad"); // Create new man called Brad
		Woman Jessica = new Woman("Jessica"); // Create new woman called Jessica
		Woman Katie = new Woman("Katie"); // Create new woman called Katie
		Woman[] bradPreferences = new Woman[] {Jessica, Katie};
		Brad.setPreference(bradPreferences);
		Brad.setWomanEngagedTo(Jessica);
		
		if (Brad.getWomanEngagedTo() != Jessica) {
			System.out.println("FAILURE: Brad.getWomanEngaged says Brad is engaged to "
								+ Brad.getWomanEngagedTo().getName() + " when it should be Jessica");
			manFails++;
		}
		
		if (Brad.getPreference(2) != Katie) {
			System.out.println("FAILURE: Brad.getPreference(2) says Brad's second preference is "
					+ Brad.getPreference(2).getName() + " when it should be Katie");
			manFails++;
		}
		
		if (manFails != 0)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		testMan();
	}
	
}
