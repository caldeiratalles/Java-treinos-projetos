package application;

import BancoDeDados.DB;
import BancoDeDados.DbException;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class transação {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement st = null;
        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            conn.setAutoCommit(false);

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 1090 WHERE DepartmentId = 1");
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 2");
            System.out.println("Row 1: " + rows1);
            conn.commit();
        }catch (SQLException E){
            try{
                conn.rollback();
                throw new DbException("Transação não conluída pelo erro: " +E.getMessage());
            }catch (SQLException e1){
                throw new DbException("Erro ao voltar para a versão antiga do banco de dados: "+ e1.getMessage());
            }

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
