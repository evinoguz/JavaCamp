package gun4_Odev3.Concrete;

import gun4_Odev3.Abstract.CampaignService;
import gun4_Odev3.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("'"+campaign.getName()+"' kampanyas� kaydedildi.");
	}

	@Override
	public void update(int id,Campaign campaign) {
		System.out.println("'"+campaign.getName()+"' kampanyas� g�ncellendi.");		
	}

	@Override
	public void delete(int id,Campaign campaign) {
		System.out.println("'"+campaign.getName()+"' kampanyas� silindi.");		
	}

}
