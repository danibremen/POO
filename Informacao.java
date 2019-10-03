package Tarefas;

public class Informacao {
	private int id;
	private String Nome_Evento;
	private int Nivel_Preferencia;
	private String Descricao_Preferencia;
	private String Administrador;
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setNome_Evento(String nome_evento) {
		Nome_Evento = nome_evento;
	}
	
	public void setNivel_Preferencia(int nivel_preferencia) {
		Nivel_Preferencia = nivel_preferencia;
	}
	
	public void setDescricao_Preferencia(String descricao_preferencia) {
		Descricao_Preferencia = descricao_preferencia;
	}
	
	public void setAdministrador(String administrador) {
		Administrador = administrador;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome_Evento() {
		return Nome_Evento;
	}
	
	public int getNivel_Preferencia() {
		return Nivel_Preferencia;
	}
	
	public String getDescricao_Preferencia() {
		return Descricao_Preferencia;
	}
	
	public String getAdministrador() {
		return Administrador;
	}

}
	

}
