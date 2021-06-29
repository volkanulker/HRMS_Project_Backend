package hrms.northwind.emailConfirmer;

import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessResult;

public class EmailConfirmerManager implements EmailConfirmerService{

	@Override
	public void sendConfirmation(String email, String message, String confirmationCode) {
		System.out.println("Confirmation message is sent to: " + email + "with confirmation code:" + confirmationCode );
		
	}

	@Override
	public Result isEmailConfirmed(String email) {
		
		return new SuccessResult(email +" is confirmed.");
	}

	
}

