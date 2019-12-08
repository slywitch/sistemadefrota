/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultaVeiculo.java
 *
 * Created on 07/01/2010, 08:40:17
 */

package controle;

import classes.Combo;
import classes.ConexaoAccess;
import classes.Funcoes;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeferson
 */
public class ConsultaVeiculo extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    private Funcoes Fun;

    /** Creates new form ConsultaVeiculo */
    public ConsultaVeiculo() {
        initComponents();
        JogarVeiculo();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboVeiculo = new javax.swing.JComboBox();
        jlbInfo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jspMovimentacao = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jspRastreamento = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jspMultas = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jbtNovo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("Consulta de Veículo");

        cboVeiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboVeiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboVeiculoItemStateChanged(evt);
            }
        });

        jlbInfo.setText("Selecione o Veículo");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jspMovimentacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jspMovimentacao.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Motorista", "Km", "Obs"
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jspMovimentacao.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);

        jTabbedPane1.addTab("Movimentação", jspMovimentacao);

        jspRastreamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Motorista", "Data Saída", "Data Chegada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jspRastreamento.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(0).setResizable(false);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable2.getColumnModel().getColumn(1).setResizable(false);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable2.getColumnModel().getColumn(2).setResizable(false);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(3).setResizable(false);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(30);

        jTabbedPane1.addTab("Rastreamento", jspRastreamento);

        jspMultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data", "Motorista", "Código Multa", "Pontos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jspMultas.setViewportView(jTable3);
        jTable3.getColumnModel().getColumn(0).setResizable(false);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable3.getColumnModel().getColumn(1).setResizable(false);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(20);
        jTable3.getColumnModel().getColumn(2).setResizable(false);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable3.getColumnModel().getColumn(3).setResizable(false);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable3.getColumnModel().getColumn(4).setResizable(false);
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(5);

        jTabbedPane1.addTab("Multas", jspMultas);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Km", "Qtde", "Unidade", "Média"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable4);
        jTable4.getColumnModel().getColumn(0).setResizable(false);
        jTable4.getColumnModel().getColumn(1).setResizable(false);
        jTable4.getColumnModel().getColumn(2).setResizable(false);
        jTable4.getColumnModel().getColumn(3).setResizable(false);

        jTabbedPane1.addTab("Rendimento", jScrollPane1);

        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbInfo)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtNovo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtNovo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboVeiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboVeiculoItemStateChanged
        if (cboVeiculo.getItemCount()>0){
            String Placa = ((Combo)cboVeiculo.getSelectedItem()).toString();

            ConsultaMovimentacao(Placa);
            ConsultaRastreamento(Placa);
            ConsultaMultas(Placa);
            Rendimento(Placa);
        }
    }//GEN-LAST:event_cboVeiculoItemStateChanged

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        SubConsultaVeiculoMulta A = new SubConsultaVeiculoMulta();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.setSelected(true);
            A.setCPF(BuscarCPF(Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString())));
            A.setCodigo(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);

        A.CarregarDados(jTable3.getValueAt(jTable3.getSelectedRow(), 3).toString());
}//GEN-LAST:event_jTable3MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        SubConsultaVeiculoRastreamento A = new SubConsultaVeiculoRastreamento();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.setSelected(true);
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);

        A.CarregarDados(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
}//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
}//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        SubConsultaVeiculoMovimentacao A = new SubConsultaVeiculoMovimentacao();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.setSelected(true);
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);

        A.CarregaDados(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        Limpar();

        cboVeiculo.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JLabel jlbInfo;
    private javax.swing.JScrollPane jspMovimentacao;
    private javax.swing.JScrollPane jspMultas;
    private javax.swing.JScrollPane jspRastreamento;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    private void Limpar(){

        cboVeiculo.removeAllItems();
        JogarVeiculo();

        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        jTable1.updateUI();

        ((DefaultTableModel) jTable2.getModel()).setNumRows(0);
        jTable2.updateUI();

        ((DefaultTableModel) jTable3.getModel()).setNumRows(0);
        jTable3.updateUI();

        ((DefaultTableModel) jTable4.getModel()).setNumRows(0);
        jTable4.updateUI();

    }

    private void JogarVeiculo(){
        cboVeiculo.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select (chassis) as codigo, (placa) as nome from t_veiculo order by nome");
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }
            cboVeiculo.setModel(Modelo);
        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }
    }

    private void ConsultaMovimentacao(String Placa){

        String SQL;

        SQL = "select tmov.codigo, to_char(tmov.data,'DD/MM/YYYY') as data, tmo.nome, tmov.km, tmov.obs ";
        SQL = SQL + "from t_movimentacao tmov ";
        SQL = SQL + "inner join	t_motorista tmo on tmo.cpf = tmov.cpf_cod ";
        SQL = SQL + "inner join	t_veiculo tve on tve.chassis = tmov.chassis_cod ";
        SQL = SQL + "where tve.placa = '" + Placa + "' ";

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
                Object[] Linha = {RS.getString("codigo"), RS.getString("data"), RS.getString("nome"), RS.getString("km"), RS.getString("obs")};
                Tabela.addRow(Linha);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

        Conexao.Desconectar();
    }

    private void ConsultaRastreamento(String Placa){

        String SQL;

        SQL = "select tch.codigo, tmo.nome, to_char(tch.data,'DD/MM/YYYY') as data_saida, to_char(tcd.data,'DD/MM/YYYY') as data_chegada ";
        SQL = SQL + "from t_chaves tch ";
        SQL = SQL + "inner join t_motorista tmo on tmo.cpf = tch.cpf_cod ";
        SQL = SQL + "inner join t_chaves_devolucao tcd on tcd.codigo = tch.codigo ";
        SQL = SQL + "inner join t_veiculo tve on tve.chassis = tch.chassis_cod ";
        SQL = SQL + "where tve.placa = '" + Placa + "' ";

        try{

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            DefaultTableModel modelo2;
            modelo2 = (DefaultTableModel)jTable2.getModel();
            modelo2.setRowCount(0);

            ResultSet RS = Conexao.Consultar();

            while(RS.next()){
                DefaultTableModel Tabela = (DefaultTableModel) jTable2.getModel();
                Object[] Linha = {RS.getString("codigo"), RS.getString("nome"), RS.getString("data_saida"), RS.getString("data_chegada")};
                Tabela.addRow(Linha);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

        Conexao.Desconectar();

    }

    private void ConsultaMultas (String Placa){

        String SQL;

        SQL = "select tlm.codigo, to_char(tlm.data, 'DD/MM/YYYY') as data, tmo.nome, tlm.multa_cod, tpm.gravidade ";
        SQL = SQL + "from t_lancamento_multa tlm ";
        SQL = SQL + "inner join t_motorista tmo on tmo.cpf = tlm.cpf_cod ";
        SQL = SQL + "inner join t_pontuacao_multas tpm on tpm.codigo = tlm.multa_cod ";
        SQL = SQL + "inner join t_veiculo tve on tve.chassis = tlm.chassis_cod ";
        SQL = SQL + "where tve.placa = '" + Placa + "' ";

        try{

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            DefaultTableModel modelo2;
            modelo2 = (DefaultTableModel)jTable3.getModel();
            modelo2.setRowCount(0);

            ResultSet RS = Conexao.Consultar();

            while(RS.next()){
                DefaultTableModel Tabela = (DefaultTableModel) jTable3.getModel();
                Object[] Linha = {RS.getString("codigo"), RS.getString("data"), RS.getString("nome"), RS.getString("multa_cod"), Gravidade(Integer.parseInt(RS.getString("gravidade")))};
                Tabela.addRow(Linha);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

        Conexao.Desconectar();

    }

    private String Gravidade(int Pontos){

        String Resultado = null;

        Fun = new Funcoes();
        Resultado = Pontos + " - " + Fun.GravidadeMulta(Pontos);

        return Resultado;

    }

    private String BuscarCPF (int numero){

        String cCPF = null;
        String SQL;

        SQL = "select tmo.cpf ";
        SQL = SQL + "from t_motorista tmo ";
        SQL = SQL + "inner join t_lancamento_multa tlm on tlm.cpf_cod = tmo.cpf ";
        SQL = SQL + "where codigo = " + numero + " ";

        try{

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            ResultSet RS = Conexao.Consultar();

            if(RS.next()){
                cCPF = String.valueOf(RS.getString("cpf"));
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

        Conexao.Desconectar();
        
        return cCPF;

    }

    private void Rendimento(String Placa){

        String SQL;

        SQL = "select tmi.codigo, tmi.fornecedor_cod, tfo.nomefornecedor, tmi.evento_item_cod, tei.descricao, tmi.produto_cod, ";
        SQL = SQL + "(tpr.nome) as combustivel, tmo.km, tmi.qtde, uni.abreviacao, tve.placa ";
        SQL = SQL + "from t_movimentacao_item tmi ";
        SQL = SQL + "inner join t_movimentacao tmo on tmo.codigo = tmi.movimentacao_cod ";
        SQL = SQL + "inner join t_fornecedor tfo on tfo.cnpjcpf = tmi.fornecedor_cod ";
        SQL = SQL + "inner join t_evento_item tei on tei.codigo = tmi.evento_item_cod ";
        SQL = SQL + "inner join t_produto tpr on tpr.codigo = tmi.produto_cod ";
        SQL = SQL + "inner join t_veiculo tve on tve.chassis = tmo.chassis_cod ";
        SQL = SQL + "inner join unidade uni on uni.codunidade = tpr.unidade_cod ";
        SQL = SQL + "where tmi.evento_item_cod = 1 ";
        SQL = SQL + "and tve.placa = '" + Placa + "' ";
        SQL = SQL + "order by tmo.km desc ";

        System.out.println(SQL);

        try{

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);

            DefaultTableModel modelo2;
            modelo2 = (DefaultTableModel)jTable4.getModel();
            modelo2.setRowCount(0);

            ResultSet RS = Conexao.Consultar();

            Double Km1 = 0.00;
            Double Km2 = 0.00;
            Double L1 = 0.00;
            Double L2 = 0.00;

            Double Media = 0.00;

            while(RS.next()){
                
                DefaultTableModel Tabela = (DefaultTableModel) jTable4.getModel();
                
                Km1 = Double.parseDouble(RS.getString("km"));
                L1 = Double.parseDouble(RS.getString("qtde"));

                if (!(Km2 == 0)) {

                    Double Km = 0.00;

                    Km = Km2 - Km1;

                    Media = CalculoCombustivel(Km, L2);

                } else {
                    DecimalFormat df = new DecimalFormat("###.##");
                    Media = Double.parseDouble(df.format(0));
                }
                
                Object[] Linha = {RS.getString("km"), RS.getString("qtde"), RS.getString("abreviacao"), Media};
                Tabela.addRow(Linha);

                Km2 = Km1;
                L2 = L1;
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
        }

        Conexao.Desconectar();

    }

    private Double CalculoCombustivel(Double Km, Double Litros){

        Double Media = 0.00;

        Media = Km / Litros;

        return Media;

    }

}