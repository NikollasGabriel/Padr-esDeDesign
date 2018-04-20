package Persistence;

import Model.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatoDAO {

    private static ContatoDAO instance = new ContatoDAO();

    private ContatoDAO() {
    }

    public static ContatoDAO getInstance() {
        return instance;
    }

    public void delete(Contato contato) throws SQLException {

        Connection conn = null;
        Statement st = null;
        String sql = "delete from contato where nome = ?";
        try {

            /*conn = DatabaseLocator.getInstance().getConection();
            st = conn.createStatement();
            st.execute("delete from contato where ");
            
            PreparedStatement pstm = */
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, contato.getNome());
            ResultSet rs = pstm.executeQuery();;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void save(Contato contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConection();
            st = conn.createStatement();
            st.execute("insert into contato (nome, email)"
                    + " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public List<Contato> read() throws ClassNotFoundException {

        Connection conn = null;
        Statement st = null;

        String sql = "select = from contato";
        List<Contato> contatos = new ArrayList<>();

        try {
            conn = DatabaseLocator.getInstance().getConection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                Contato contato = new Contato();
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contatos.add(contato);
            }


            /*try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                Contato contato = new Contato();
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contatos.add(contato);
            }

            rs.close();
            pstm.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/
            
        } catch (SQLException ex) {
           
        }
        
        return contatos;
    }

    public void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {

        }
    }
}
