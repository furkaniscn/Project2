package gameProject;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Furkan");
		customer1.setLastName("��CAN");
		customer1.setIdentityNumber("12345678900");
		customer1.setBirthYear(1453);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Ebubekir S�dd�k");
		customer2.setLastName("Ho�geldin");
		customer2.setIdentityNumber("123456789");
		customer2.setBirthYear(2005);
		
		CustomerManager customerManager = new CustomerManager(new UserControlManager());
		customerManager.add(customer1);
		customerManager.add(customer2);
		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(3);
		campaign1.setCampaignName("Fps oyunlar�nda extra indirim !!!!!");
		campaign1.setCampaignDetails("Bir fps oyunu alana di�eri &10 indirimli");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.gameSale(customer1, campaign1);

	}

}
