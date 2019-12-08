/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PesquisaProdutos.java
 *
 * Created on 11/12/2009, 16:44:38
 */

package controle;

import classes.ConexaoAccess;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeferson
 */
public class PesquisaProdutos extends javax.swing.JInternalFrame {

    private Produto Pro;
    private ConexaoAccess Conexao;

    /** Creates new form PesquisaProdutos */
    public PesquisaProdutos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("Pesquisa Produtos");

        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            CarregaProdutos();
        }
        
    }//GEN-LAST:event_jtfPesquisaKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        Pro.CarregaDados(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));

        this.dispose();

    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaProdutos().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    public void SetProduto(Produto Prod){
            this.Pro = Prod;
    }

    private void CarregaProdutos(){

        String SQL;

        SQL = "select codigo, nome from t_produto where UPPER(nome) like '%" + jtfPesquisa.getText().toUpperCase() + "%' ";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        jTable1.updateUI();

        ResultSet RS = Conexao.Consultar();

        try{

            while (RS.next()){
                DefaultTableModel Tabela = (DefaultTableModel) jTable1.getModel();
                Object[] CarLinha = {RS.getString("codigo"),RS.getString("nome")};
                Tabela.addRow(CarLinha);
            }

        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfPesquisa;
    // End of variables declaration//GEN-END:variables

}