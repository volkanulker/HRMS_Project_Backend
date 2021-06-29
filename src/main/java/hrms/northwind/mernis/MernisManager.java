package hrms.northwind.mernis;

import hrms.northwind.entities.concretes.Person;

public class MernisManager implements MernisService{
	@Override
	public boolean isPersonValid(Person person) {
		return true;
		
	}
}
