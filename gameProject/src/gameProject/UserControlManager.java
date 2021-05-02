package gameProject;

public class UserControlManager implements UserControlService {

	@Override
	public boolean controlUser(Customer customer) {
		if (customer.getLastName().length() >= 2 && customer.getBirthYear() < 2003
				&& customer.getName().length() >= 2 && customer.getIdentityNumber().length() == 11) {

			System.out.println("Doðrulama iþlemi baþarýlý");
			return true;

		} else {
			System.out.println("Doðrulama iþlemi baþarýsýz");
			return false;
		}

	}

}
