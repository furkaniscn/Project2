package gameProject;

public class CustomerManager implements CustomerService {

	private UserControlService userControlService;

	public CustomerManager(UserControlService userControlService) {
		this.userControlService = userControlService;
	}

	@Override
	public void add(Customer customer) {
		if (userControlService.controlUser(customer) == true) {
			System.out.println("Ekleme iþlemi baþarýlý");
		} else {
			System.out.println("Ekleme iþlemi baþarýsýz");
		}

	}

	@Override
	public void delete(Customer customer) {
		if (userControlService.controlUser(customer) == true) {
			System.out.println("Silme iþlemi baþarýlý");
		} else {
			System.out.println("Silme iþlemi baþarýsýz");
		}

	}

	@Override
	public void update(Customer customer) {
		if (userControlService.controlUser(customer) == true) {
			System.out.println("Güncelleme iþlemi baþarýlý");
		} else {
			System.out.println("Güncelleme iþlemi baþarýsýz");
		}

	}

}
