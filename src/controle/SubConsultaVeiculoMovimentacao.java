/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SubConsultaVeiculoMovimentacao.java
 *
 * Created on 07/01/2010, 14:47:59
 */

package controle;

import classes.ConexaoAccess;
import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.InputStream;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jeferson
 */
public class SubConsultaVeiculoMovimentacao extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    String Veiculo;

    /** Creates new form SubConsultaVeiculoMovimentacao */
    public SubConsultaVeiculoMovimentacao() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("Detalhes de Movimentação");

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Fornecedor", "Produto", "Evento", "Qtde"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        String Codigo = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String Placa;
        String SQL;

        try{

            SQL = "select tve.placa ";
            SQL = SQL + "from t_veiculo tve ";
            SQL = SQL + "inner join t_movimentacao tmov on tmov.chassis_cod = tve.chassis ";
            SQL = SQL + "where tmov.codigo = " + Codigo + " ";

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            ResultSet RS = Conexao.Consultar();
            
            if (RS.next()) {
                Placa = RS.getString("placa");                
                Impressao(Placa, Codigo);
            }
            
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubConsultaVeiculoMovimentacao().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    public void CarregaDados(String Codigo){

        String SQL;

        SQL = "select tmi.codigo, (tfo.nomefantasia) as fornecedor, (tei.descricao) as evento, ";
        SQL = SQL + "(tpro.nome) as produto, tmi.qtde ";
        SQL = SQL + "from t_movimentacao_item tmi ";
        SQL = SQL + "inner join t_fornecedor tfo on tfo.cnpjcpf = tmi.fornecedor_cod ";
        SQL = SQL + "inner join t_evento_item tei on tei.codigo = tmi.evento_item_cod ";
        SQL = SQL + "inner join t_produto tpro on tpro.codigo = tmi.produto_cod ";
        //SQL = SQL + "inner join t_movimentacao tmov on tmov.codigo = tmi.movimentacao_cod ";
        //SQL = SQL + "inner join t_veiculo tve on tve.chassis = tmov.chassis_cod ";
        SQL = SQL + "where tmi.movimentacao_cod = " + Codigo + "";

        try{

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            DefaultTableModel modelo2;
            modelo2 = (DefaultTableModel)jTable1.getModel();
            modelo2.setRowCount(0);

            ResultSet RS = Conexao.Consultar();

            while(RS.next()){
                DefaultTableModel Tabela = (DefaultTableModel) jTable1.getModel();
                Object[] Linha = {RS.getString("codigo"), RS.getString("fornecedor"), RS.getString("evento"), RS.getString("produto"), RS.getString("qtde")};
                Tabela.addRow(Linha);
            }

        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

        Conexao.Desconectar();

    }

    private void Impressao (String Placa, String Codigo){

        try {

            String SQL;

            SQL = "select tmov.codigo, tve.placa, (tmo.nome) as motorista, to_char(tmov.data, 'DD/MM/YYYY') as data, ";
            SQL = SQL + "tmov.km, tmov.obs, tfo.nomefantasia, (tev.descricao) as evento, (tei.descricao) as evento_item, ";
            SQL = SQL + "(tpro.nome) as produto, (tmvi.qtde || ' ' || uni.abreviacao) as qtde ";
            SQL = SQL + "from t_movimentacao tmov ";
            SQL = SQL + "inner join t_veiculo tve on tve.chassis = tmov.chassis_cod ";
            SQL = SQL + "inner join t_motorista tmo on tmo.cpf = tmov.cpf_cod ";
            SQL = SQL + "inner join t_movimentacao_item tmvi on tmvi.movimentacao_cod = tmov.codigo ";
            SQL = SQL + "inner join t_fornecedor tfo on tfo.cnpjcpf = tmvi.fornecedor_cod ";
            SQL = SQL + "inner join t_evento_item tei on tei.codigo = tmvi.evento_item_cod ";
            SQL = SQL + "inner join t_evento tev on tev.codigo = tei.evento_cod ";
            SQL = SQL + "inner join t_produto tpro on tpro.codigo = produto_cod ";
            SQL = SQL + "inner join unidade uni on uni.codunidade = tpro.unidade_cod ";
            SQL = SQL + "where tve.placa = '" + Placa + "' ";
            SQL = SQL + "and tmov.codigo = " + Codigo + " ";

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            JRResultSetDataSource jrRS = new JRResultSetDataSource(Conexao.Consultar());
            InputStream is = getClass().getResourceAsStream("/reports/movimentacao.jasper");

            JasperPrint print = JasperFillManager.fillReport(is, new HashMap(), jrRS);
            JasperViewer viewer = new JasperViewer(print, false);

            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            viewer.setVisible(true);

        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "Erro na busca: " + Erro.getMessage());
            System.out.println(Erro);
        }

    }

}