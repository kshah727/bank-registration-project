import com.sqa.ks.helpers.*;

public class BankRegistration {

	static final double ACCOUNT_REG_FEE = 45;

	public static void main(String[] args) {
		String appName = "customer";
		String userName = AppBasics.greetUserandGetName(appName);
		registerCustomer();
		AppBasics.farewellUser(userName, appName);
	}

	/**
	 *
	 */
	private static void registerCustomer() {
		int numberOfAccounts = AppBasics.requestIntFromUser("How many accounts would you like to open?", 1, 4);
		// System.out.println("I would like to open " + numberOfAccounts + "
		// account/s");
		int numberOfYears = AppBasics.requestIntFromUser("how many years would you like to be with our bank?");
		Double totalRegistrationFee = numberOfAccounts * ACCOUNT_REG_FEE * numberOfYears;
		System.out.println("Your total today will be " + totalRegistrationFee);
	}
}
