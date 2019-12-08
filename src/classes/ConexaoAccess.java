/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class ConexaoAccess {
    private String SQL, usuario, senha;
    private Connection Con;

    public Connection getCon() {
        return Con;
    }
    private Statement ST;
    private ResultSet RS;

    public ConexaoAccess(){
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean Conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            usuario = "user";
            senha = "********";
            String db = "jdbc:postgresql://servidor.totalhealth.com.br/totalsystem";
            Con = DriverManager.getConnection(db, usuario, senha);
            ST = Con.createStatement();
            return true;
        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + Erro);
            return false;
        }
    }

    public ResultSet Consultar(){
        try {
            RS = ST.executeQuery(SQL);
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro durante a consulta: " + Erro);
        }
        return RS;
    }

    public void Executar(){
        try {
            ST.executeUpdate(SQL);
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro durante a execução: " + Erro);
        }
    }

    public void Desconectar(){
        try {
            Con.close();
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: " + Erro);
        }
    }

    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    public String getSQL() {
        return SQL;
    }

}