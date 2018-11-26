package database_setting_application.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection getConnection(String propPath) throws SQLException {
		return MyDataSource.getInstance(propPath).getDataSource().getConnection();
	}
}
