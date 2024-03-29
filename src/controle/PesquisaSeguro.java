/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class PesquisaSeguro extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    private Seguro Seg;
    String Meleca;
    
    /**
     * Creates new form PesquisaSeguro
     */
    public PesquisaSeguro() {
        initComponents();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaSeguro().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Pesquisa Seguro");

        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
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
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            CarregaModelo();
        }
    }//GEN-LAST:event_jtfPesquisaKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        System.out.println(Meleca);

//        if (Meleca.equals("Segurado")){
//            Seg.FuncaoGenerica("Segurado", jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
//        } else if (Meleca.equals("Veiculo")){
//            Seg.FuncaoGenerica("Veiculo", jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
//        } else if (Meleca.equals("Fornecedor")){
//            Seg.FuncaoGenerica("Fornecedor", jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
//        }   
        
        Seg.CarregaDados(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        
        this.dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    public void Validador(String Parametro){
        this.Meleca = Parametro;
    }

    public void SetPequisaSeguro(Seguro Segu){
        this.Seg = Segu;
    }
    
    private void CarregaModelo(){

        String SQL = null;

//        if (Meleca.equals("Segurado")){
//            SQL = "select (cnpj) as codigo, (nomefantasia) as nome from t_empresa ";
//            SQL = SQL + "where nomefantasia like '%" + jtfPesquisa.getText() + "%'";
//            SQL = SQL + "and exclusao = 0 ";
//        } else if (Meleca.equals("Veiculo")){
//            SQL = "select (chassis) as codigo, (placa) as nome from t_veiculo ";
//            SQL = SQL + "where placa like '%" + jtfPesquisa.getText() + "%'";
//            SQL = SQL + "and exclusao = 0 ";
//        } else if (Meleca.equals("Fornecedor")){
//            SQL = "select (cnpjcpf) as codigo, (nomefantasia) as nome from t_fornecedor ";
//            SQL = SQL + "where nomefantasia like '%" + jtfPesquisa.getText() + "%'";
//            SQL = SQL + "and exclusao = 0 ";
//        }
        
        SQL = "select (tse.num_apolice) as codigo, ";
        SQL = SQL + "(tse.veiculo_cod || ' - ' || tmo.nome || ' (' || tve.ano || ')') as nome ";
        SQL = SQL + "from t_seguro tse ";
        SQL = SQL + "inner join t_veiculo tve on tve.chassis = tse.veiculo_cod ";
        SQL = SQL + "inner join t_modelo tmo on tmo.codigo = tve.modelo_cod ";
        SQL = SQL + "where tse.num_apolice like '%" + jtfPesquisa.getText() + "%' ";
        SQL = SQL + "and tse.exclusao = 0 ";
        
        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        jTable1.updateUI();

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        
        ResultSet RS = Conexao.Consultar();
        
        System.out.println(SQL);

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
