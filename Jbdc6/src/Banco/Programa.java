package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		

		Statement st = null;

		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();
			int rows1 = st.executeUpdate("UPDATE seller Set BaseSalary = 2090 WHERE departmentId = 1");
			//*int x = 1;
			//if (x < 2) {
				//throw new SQLException("Fake error");
			//}
			int rows2 = st.executeUpdate("UPDATE seller Set BaseSalary = 8060 WHERE departmentId = 2");
			
		
			conn.commit();
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
		} catch (SQLException e) {
          try {
        	  conn.rollback();
        	  throw new DbException("TRANSAÇAO VOLTOU: " + e.getMessage());
          } catch (SQLException e1) {
        	  throw new DbException("ERRO ENQUANTO TENTAVA EXECUTAR A TRANSAÇAO" + e.getMessage());
          }
           
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}