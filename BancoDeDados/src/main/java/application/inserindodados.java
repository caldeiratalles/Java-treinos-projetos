package application;

import BancoDeDados.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class inserindodados {
    public static  void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                        "INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                        + "VALUES "
                        + "(?, ?, ?, ?, ?)",
                        Statement.RETURN_GENERATED_KEYS);
            st.setString(1,"Talles Marcelo");
            st.setString(2, "caldeiratalles@hotmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("26/06/2000").getTime()));
            st.setDouble(4, 5000);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();
            //injetando direto no department
            // st = conn.prepareStatement(
            // "insert into department (Name) values ('D1'), ('D2')"),
            //Statement.RETURN_GENERATED_KEYS);
            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Id afetado: "+ id);
                }
            }else{
                System.out.println("Nenhuma row afetada");
            }
        }
        catch(SQLException | ParseException e ){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
