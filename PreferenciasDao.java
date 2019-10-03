package Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreferenciasDao extends AcessoDao {
	public List<Preferencias> getAll(){
		String sql = "select id, Nivel_Preferencia, Descricao_Preferencia from Preferencia";
		List<Preferencias> list = new ArrayList<Preferencias>();
		try {
			try(Connection conn = getConnection(); 
					PreparedStatement p = conn.prepareStatement(sql)){
				ResultSet result = p.executeQuery();
				while(result.next()) {
					Preferencias preferencia = new Preferencias();
					preferencia.setId(result.getInt(1));
					preferencia.setNivelPreferencia(result.getInt(2));
					preferencia.setDescricaoPreferencia(result.getString(3));
					list.add(preferencia);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public Preferencias getById(int id) {
		String sql = "select id, Nivel_preferencia, Descricao_Preferencia from Preferencia where id = ?";
		Preferencias preferencia = null;
		try {
			try(Connection conn = getConnection();
					PreparedStatement p = conn.prepareStatement(sql)){
				p.setInt(1, id);
				ResultSet result = p.executeQuery();
				if(result.next()) {
					preferencia = new Preferencia();
					preferencia.setId(result.getInt(1));
					preferencia.setNivelPreferencia(result.getInt(2));
					preferencia.setDescricaoPreferencia(result.getString(3));
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return preferencia;
	}
}
