package Tarefas;

public class Main {
	
	public static void main(String[] args) {
					
		UsuarioDao usuarioBDA = new UsuarioDao();				
		AgendasDao agendaBDA = new AgendasDao();
		PreferenciasDao prefenciaBDA = new PreferenciasDao();
		
		Usuario user = new Usuario();
		user.setNome("Paulo");
		user.setSobrenome("da Costa");
		Agenda agenda = new Agenda();
		agenda.setNomeAgenda("Jogar video game");
		agenda.setAgendaStatus(1);
		
		usuarioBDA.Insert(user);
		agendaBDA.insert(agenda, preferenciasBDA.getById(2).getId(), usuarioBDA.getById(1));
		
		for(Usuario usuario : usuarioBDA.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println(usuarioBDA.getById(1).getNome());
		System.out.println();
		System.out.println("|ID|" + "" + "|Descrição da Atividade   |" + "|NIvel de Preferencia|" + " "+ "|Descrição Preferencia|" + "|   Administrador  |");
		for(Informacao agendas : agendasBDA.getAll()) {
			System.out.println("|" + agendas.getId() + " ||" + agendas.getNome_Agenda() + "||         " + agendas.getNivel_Preferencia() + "         | |        " + agenda.getDescricao_Preferencia() + "       ||"  + agendas.getAdministrador() + "|");
		}
		
		user.setId(usuarioBDA.getById(1).getId());
		user.setNome("Jailsom");
		usuarioBDA.update(user);
		agenda.setId(agendaBDA.getById(1).getId());
		agenda.setAgendaStatus(0);
		AgendasDao.update(agenda, preferenciasBDA.getById(1).getId(), user);
		
		
		System.out.println();
		for(Usuario usuario : usuarioBDA.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println("|ID|" + "" + "|Descrição da Atividade     |" + "|NIvel de Preferecnia|" + " "+ "|Descrição Preferencia|" + "|   Administrador  |");
		for(Informacao agenda : agendaBDA.getAll()) {
			System.out.println("|" + agendas.getId() + " ||" + agendas.getNome_Agenda() + "||         " + agendas.getNivel_Preferencia() + "         | |        " + agendas.getDescricao_Preferencia() + "       ||"  + agenda.getAdministrador() + "|");
		}
	
		agendaBDA.delete(1);
		
		System.out.println();
		for(Usuario usuario : usuarioBDA.getAll()) {
			System.out.println(usuario.getNome() + " " + usuario.getSobrenome());
		}
		System.out.println();
		System.out.println("|ID|" + "" + "|Descrição da Atividade     |" + "|NIvel de Preferencia|" + " "+ "|Descrição Preferencia|" + "|   Administrador  |");
		for(Informacao agenda: agendaBDA.getAll()) {
			System.out.println("|" + agenda.getId() + " ||" + agenda.getNome_Agenda() + "||         " + agendas.getNivel_Preferencia() + "         | |        " + agendas.getDescricao_Prioridade() + "       ||"  + agendas.geAdministrador() + "|");
		}	
	}
} 