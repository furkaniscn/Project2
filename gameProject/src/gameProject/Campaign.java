package gameProject;

public class Campaign {

	private int id;
	private String campaignName;
	private String campaignDetails;

	public Campaign(int id, String campaignName, String campaignDetails) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDetails = campaignDetails;
	}

	public Campaign() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDetails() {
		return campaignDetails;
	}

	public void setCampaignDetails(String campaignDetails) {
		this.campaignDetails = campaignDetails;
	}

}
