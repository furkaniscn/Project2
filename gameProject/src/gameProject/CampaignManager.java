package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla eklenmi�tir");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla silinmi�tir");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla g�ncellenmi�tir");

	}

}
