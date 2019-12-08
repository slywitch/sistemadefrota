/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;
/*
import classes.Combo;
import controle.Modelo;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 
public class ObjCombo extends javax.swing.JComboBox {
    
    private ConexaoAccess Conexao;

    public JComboBox ComboBox(String SQL, JComboBox cbo) {

        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            ResultSet RS = Conexao.Consultar();

            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();

            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }

            cbo.setModel(Modelo);

        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }

        return Modelo();
        
    }

}
*/