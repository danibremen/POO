package youtube;

import java.util.ArrayList;
import java.util.List;

public class Rede implements RedeInt {
	private List<Inscrito> subscribers;
	private List<Videos> videos;
	private String name;
	
	public Rede(String name) {
		this.name = name;
		subscribers = new ArrayList();
		videos = new ArrayList();
	}
	
	public void addVideo(String videoName) {
		Videos video = new Videos(videoName);
		videos.add(video);
		notifySubscriber(video);
	}
	
	@Override
	public void subscribeToRede(Inscrito sub) {
		subscribers.add(sub);
	}

	@Override
	public void unfollowRede(Inscrito sub) {
		subscribers.remove(sub);
	}

	@Override
	public void notifySubscriber(Videos video) {
		for(Inscrito subs: subscribers ) {
			subs.newVideoAdded(this.name, video);
		}
		
	}
}
