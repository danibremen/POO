package youtube;

public class Inscrito implements InscritoInt {
	private String notification;
	private String name;
	
	public Inscrito(String name) {
		this.name = name;
	}

	@Override
	public void newVideoAdded(String Name, Videos video) {
		this.notification = "Olá "+ this.name +  " o canal " + Name + " acabou de enviar um video novo" + video.getTitle() +" Bora conferir?";
		System.out.println(notification);
	}
	
}
