package youtube;

public interface RedeInt {
	void subscribeToRede(Inscrito sub);
	void unfollowRede(Inscrito sub);
	void notifySubscriber(Videos video);
}
