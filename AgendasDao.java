package Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AgendasDao  extends AcessoDao {
	public void insert (Agenda agenda, int preferenciaId, Usuario user) {
		String sql = "insert into Agenda (Nome_Evento, FK_Preferencia, FK_Administrador, Agenda_status) values "
				+ "(?, (select id from preferencia where Nivel_Preferencia = ?), (select id from usuario where Nome = ?"
				+ " and Sobrenome = ?), ?)";
		try {
			try (Connection conn = getConnection(); 
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setString(1, agenda.getNomeAgenda());
				p.setInt(2, preferenciaId);
				p.setString(3, user.getNome());
				p.setString(4, user.getSobrenome());
				p.setInt(5, agenda.getAgendaStatus());
				p.execute();

			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update (Agenda agenda, int preferenciaId, Usuario user) {
		String sql = "update Agenda set Nome_Agenda = ?, FK_Preferencia = ?, FK_Administrador = (select id from usuario where"
				+ " Nome = ? and Sobrenome = ?), Agenda_status = ? where id = ?";
		try {
			try (Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setString(1, agenda.getNomeAgenda());
				p.setInt(2, preferenciaId);
				p.setString(3, user.getNome());
				p.setString(4, user.getSobrenome());
				p.setInt(5, agenda.getAgendaStatus());
				p.setInt(6, agenda.getId());

				p.execute();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete (int id) {
		String sql = "delete from A where id = ?";
		try {
			try(Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setInt(1, id);

				p.execute();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Informacao getById(int id) {
		String sql = "select inf.id, info.Nome_Agenda, pre.Nivel_preferencia, pre.Descricao_Preferencia, "
				+ "concat(usu.Nome, concat(' ', usu.Sobrenome)) as Administrador "
				+ "from agenda as inf "
				+ "inner join preferencia as pre "
				+ "on inf.FK_preferencia = pre.id "
				+ "inner join usuario as usu "
				+ "on inf.FK_Administrador = usu.id "
				+ "where inf.id = ?";
		Informacao agenda = null;
		try {
			try(Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setInt(1, id);

				ResultSet result = p.executeQuery();
				if(result.next()) {
					agenda = new Informacao();
					agenda.setId(result.getInt(1));
					agenda.setNome_Agenda(result.getString(2));
					agenda.setNivel_Preferencia(result.getInt(3));
					agenda.setDescricao_Preferencia(result.getString(4));
					agenda.setAdministrador(result.getString(5));
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return agenda;
	}
	public List<Informacao> getAll(){
		String sql = "select inf.id, inf.Nome_Agenda, pre.Nivel_Preferencia, pre.Descricao_Preferencia, "
				+ "concat(usu.Nome, concat(' ', usu.Sobrenome)) as Administrador "
				+ "from agendas as inf "
				+ "inner join preferencia as pra "
				+ "on inf.FK_preferencia = pre.id "
				+ "inner join usuario as usu "
				+ "on inf.FK_Administrador = usu.id";
		Informacao agenda = null;
		List<Informacao> list = new ArrayList<Informacao>();
		try {
			try (Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				ResultSet result = p.executeQuery();
				while(result.next()) {
					agenda = new Informacao();
					agenda.setId(result.getInt(1));
					agenda.setNome_Agenda(result.getString(2));
					agenda.setNivel_Preferencia(result.getInt(3));
					agenda.setDescricao_Preferencia(result.getString(4));
					agenda.setAdministrador(result.getString(5));
					list.add(agenda);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
