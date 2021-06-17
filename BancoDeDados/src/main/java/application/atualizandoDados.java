package application;

import BancoDeDados.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class atualizandoDados {
    public static void main(String[] ars) throws SQLException {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller "
                    +"SET BaseSalary = BaseSalary + ? "
                    +"WHERE "
                    +"(DepartmentId = ?)");
            st.setDouble(1, 1000);
            st.setInt(2,2);

            int rows = st.executeUpdate();

            System.out.println("Rows afetadas: "+rows);
        }
        catch (SQLException E){
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
