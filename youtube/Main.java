package youtube;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rede plataforma = new Rede("Comeu Bola no Estudo");
		Inscrito Pessoal = new Inscrito("Pessoal,");
		Inscrito Academica = new Inscrito("Academica,");
		Inscrito Dani = new Inscrito("Dani,");
		plataforma.subscribeToRede(Pessoal);
		plataforma.subscribeToRede(Academica);
		plataforma.subscribeToRede(Dani);
		
		plataforma.addVideo(" 'Chorando no exame de POO!'");
		
		
		
	}

}
