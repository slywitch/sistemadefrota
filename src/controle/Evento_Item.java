/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Evento_Item.java
 *
 * Created on 20/11/2009, 14:15:02
 */

package controle;

import classes.Combo;
import classes.ConexaoAccess;
import classes.Funcoes;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class Evento_Item extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    private Funcoes Fun;

    /** Creates new form Evento_Item */
    public Evento_Item() {
        initComponents();
        JogarNomeEvento();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfDescricao = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jlbCodigo = new javax.swing.JLabel();
        jlbEventoItem = new javax.swing.JLabel();
        jlbEvento = new javax.swing.JLabel();
        cboEvento = new javax.swing.JComboBox();
        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtPesquisar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("Item de Eventos");

        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyPressed(evt);
            }
        });

        jlbCodigo.setText("Código");

        jlbEventoItem.setText("Nome do Item do Evento");

        jlbEvento.setText("Evento");

        cboEvento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        jbtSalvar.setText("Salvar");
        jbtSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisa.png"))); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEvento, 0, 376, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtPesquisar))
                    .addComponent(jlbEvento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCodigo)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbEventoItem)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfDescricao))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbEventoItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jlbEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtSalvar)
                        .addComponent(jbtNovo))
                    .addComponent(jbtExcluir)
                    .addComponent(jbtPesquisar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            CarregaDados(Integer.parseInt(jtfCodigo.getText()));
        }

    }//GEN-LAST:event_jtfCodigoKeyPressed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        Limpar();

        jtfDescricao.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        String strEvento = ((Combo)cboEvento.getSelectedItem()).getKey();

        if (jtfCodigo.getText().equals("")){
            Fun = new Funcoes();
            jtfCodigo.setText(Fun.Proximo("t_evento_item"));
        }

        Conexao = new ConexaoAccess();
        Conexao.Conectar();
        Conexao.setSQL("select * from t_evento_item where codigo = '" + jtfCodigo.getText() + "' ");
        ResultSet RS = Conexao.Consultar();

        try {
            if(RS.next()){
                String SQL;
                SQL = "update t_evento_item set descricao = '" + jtfDescricao.getText().toUpperCase() + "', evento_cod = " + strEvento + " where codigo = " + jtfCodigo.getText() + "";
                Conexao.setSQL(SQL);
                Conexao.Executar();
            } else {
                String SQL;
                SQL = "insert into t_evento_item (codigo, evento_cod, descricao, exclusao) values (";
                SQL = SQL + jtfCodigo.getText() + ", " + strEvento + ", '" + jtfDescricao.getText().toUpperCase() + "', 0)";
                Conexao.setSQL(SQL);
                Conexao.Executar();
            }

        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

        Limpar();
        
        jtfDescricao.requestFocus();
        
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed

        Object[] botoes = { "Sim", "Não" };
        
        int resposta;

        resposta = JOptionPane.showOptionDialog(null, "Você deseja realmente excluir este registro?", "Confirma exclusão", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

        if(resposta == JOptionPane.YES_OPTION){

            String SQL = "delete from t_evento_item where codigo = " + jtfCodigo.getText() + "";

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);
            Conexao.Executar();
            Conexao.Desconectar();

            Limpar();

        }

        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed

        PesquisaEventoItem A = new PesquisaEventoItem();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.setSelected(true);
            A.SetEventoItem(this);
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);
        
    }//GEN-LAST:event_jbtPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboEvento;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbEvento;
    private javax.swing.JLabel jlbEventoItem;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescricao;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evento_Item().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    private void JogarNomeEvento(){
        cboEvento.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select codigo, descricao from t_evento order by descricao");
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("descricao"));
                Modelo.addElement(CB);
            }
            cboEvento.setModel(Modelo);
        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }
    }

    public void CarregaDados(int Codigo){

        String SQL;

        SQL = "select tei.codigo, tei.evento_cod, (tev.descricao) as nome_evento, tei.descricao ";
        SQL = SQL + "from t_evento_item tei ";
        SQL = SQL + "inner join t_evento tev on tev.codigo = tei.evento_cod ";
        SQL = SQL + "where tei.codigo = " + Codigo + " ";
        SQL = SQL + "and tei.exclusao = 0 ";
        
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                jtfCodigo.setText(RS.getString("codigo"));
                jtfDescricao.setText(RS.getString("descricao"));

                Combo TV = new Combo(RS.getString("evento_cod"), RS.getString("nome_evento"));
                ComboBoxModel CMB;
                CMB = cboEvento.getModel();
                CMB.setSelectedItem(TV);

            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }
        jtfDescricao.requestFocus();
        Conexao.Desconectar();

    }
    
    public void Limpar(){
        
        jtfCodigo.setText("");
        jtfDescricao.setText("");

        cboEvento.removeAllItems();
        JogarNomeEvento();

    }

}
