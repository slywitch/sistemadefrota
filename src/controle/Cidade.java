/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cidade.java
 *
 * Created on 30/10/2009, 07:16:11
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
public class Cidade extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    private Funcoes Fun;

    /** Creates new form Cidade */
    public Cidade() {
        initComponents();
        JogarEstados();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jlbNome = new javax.swing.JLabel();
        jlbEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox();
        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtPesquisar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("Cadastro de Cidades");

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyPressed(evt);
            }
        });

        jlbNome.setText("Nome");

        jlbEstado.setText("Estado");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisa.png"))); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbNome)
                    .addComponent(jlbEstado)
                    .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtSalvar)
                        .addComponent(jbtNovo))
                    .addComponent(jbtExcluir)
                    .addComponent(jbtPesquisar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            CarregaDados(Integer.parseInt(jtfCodigo.getText()));
        }
    }//GEN-LAST:event_jtfCodigoKeyPressed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        
        Limpar();

        jtfNome.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        
        String Codigo;
        String EstadoCode = ((Combo)cboEstado.getSelectedItem()).getKey();
        
        Fun = new Funcoes();
        Codigo = Fun.Proximo("codcidade", "cidade", "");

        if (jtfCodigo.getText().equals("")){
            jtfCodigo.setText(Codigo);
        }

        Conexao = new ConexaoAccess();
        Conexao.Conectar();
        Conexao.setSQL("select * from cidade where codcidade = '" + jtfCodigo.getText() + "' ");
        ResultSet RS = Conexao.Consultar();

        try {
            if(RS.next()){
                String SQL;
                SQL = "update cidade set cidade = '" + jtfNome.getText().toUpperCase() + "', coduf = '" + EstadoCode.toUpperCase() + "' where codcidade = '" + jtfCodigo.getText() + "'";
                Conexao.setSQL(SQL);
                Conexao.Executar();
            } else {
                String SQL;                
                SQL = "insert into cidade (codcidade, coduf, cidade, exclusao) values(" + jtfCodigo.getText().toUpperCase() + ", " + EstadoCode + ", '" + jtfNome.getText().toUpperCase() + "', 0)";
                Conexao.setSQL(SQL);
                Conexao.Executar();
            }

        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

        Limpar();

        jtfNome.requestFocus();
        
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        
        Object[] botoes = { "Sim", "Não" };

        int resposta;

        resposta = JOptionPane.showOptionDialog(null, "Você deseja realmente excluir este registro?", "Confirma exclusão", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

        if(resposta == JOptionPane.YES_OPTION){

            String SQL = "update cidade set exclusao = 1 where codcidade = '" + jtfCodigo.getText() + "'";

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);
            Conexao.Executar();
            Conexao.Desconectar();

            Limpar();

        }

        jtfNome.requestFocus();
        
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        
        PesquisaCidade A = new PesquisaCidade();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.setSelected(true);
            A.SetCidade(this);
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);
        
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cidade().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    public void CarregaDados(int Codigo){

        String SQL;

        SQL = "select cid.codcidade, cid.cidade, cid.coduf, cuf.uf ";
        SQL = SQL + "from cidade cid ";
        SQL = SQL + "inner join cidade_uf cuf on cuf.coduf = cid.coduf ";
        SQL = SQL + "where cid.codcidade = " + Codigo + " ";
        SQL = SQL + "and cid.exclusao = 0 ";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){

                jtfCodigo.setText(RS.getString("codcidade"));
                jtfNome.setText(RS.getString("cidade"));
                
                Combo Mot = new Combo(RS.getString("coduf"), RS.getString("uf"));
                ComboBoxModel CBM;
                CBM = cboEstado.getModel();
                CBM.setSelectedItem(Mot);

                jtfNome.requestFocus();

            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }
    }

    private void JogarEstados(){

        cboEstado.removeAllItems();

        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            String SQL;

            SQL = "select (coduf) as codigo, (uf) as nome from cidade_uf ";
            SQL = SQL + "order by uf ";

            Conexao.setSQL(SQL);
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }
            cboEstado.setModel(Modelo);
        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }

    }

    private void Limpar(){

        jtfCodigo.setText("");
        jtfNome.setText("");

        cboEstado.removeAllItems();
        JogarEstados();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JLabel jlbEstado;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables

}
