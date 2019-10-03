package Tarefas;
import java.sql.Connection;

public class AcessoDao {
	public Connection getConnection() {
		return NewConections.getInstance().getConnection();
		
	}
}