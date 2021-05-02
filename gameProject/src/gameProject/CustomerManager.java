package gameProject;

public class CustomerManager implements CustomerService {

	private UserControlService userControlService;

	public CustomerManager(UserControlService userControlService) {
		this.userControlService = userControlService;
	}

	@Override
	public void add(Customer customer) {
		if (userControlService.controlUser(customer) == true) {
			System.out.println("Ekleme i�lemi ba�ar�l�");
		} else {
			System.out.println("Ekleme i�lemi ba�ar�s�z");
		}

	}

	@Override
	public void delete(Customer customer) {
		if (userControlService.controlUser(customer) == true) {
			System.out.println("Silme i�lemi ba�ar�l�");
		} else {
			System.out.println("Silme i�lemi ba�ar�s�z");
		}

	}

	@Override
	public void update(Customer customer) {
		if (userControlService.controlUser(customer) == true) {
			System.out.println("G�ncelleme i�lemi ba�ar�l�");
		} else {
			System.out.println("G�ncelleme i�lemi ba�ar�s�z");
		}

	}

}
