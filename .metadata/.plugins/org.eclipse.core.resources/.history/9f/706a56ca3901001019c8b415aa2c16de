package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbintegrityException;

public class Programa {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"DELETE FROM department "
							+ "WHERE "
			+ "(Id = ?)");

		st.setInt(1, 4);
			int linhasmodificadas = st.executeUpdate();
			System.out.println("DONE! linhas modificadas : " + linhasmodificadas);
		} catch (SQLException e) {
			throw new DbintegrityException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}