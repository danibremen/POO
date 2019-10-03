package Tarefas;

public class Agenda {
	private int id;
	private String nomeAgenda;
	private int agendaStatus;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public int getAgendaStatus() {
		return agendaStatus;
	}
	public void setAgendaStatus(int agendaStatus) {
		this.agendaStatus = agendaStatus;
	}
}