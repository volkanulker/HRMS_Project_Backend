package hrms.northwind.emailConfirmer;

import hrms.northwind.core.utilities.results.Result;

public interface EmailConfirmerService {
	void sendConfirmation(String email,String message,String confirmationCode);
	Result isEmailConfirmed(String email);

}
