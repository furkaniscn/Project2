package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya başarıyla eklenmiştir");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya başarıyla silinmiştir");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya başarıyla güncellenmiştir");

	}

}
