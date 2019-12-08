/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Carroceria.java
 *
 * Created on 19/01/2010, 09:00:27
 */

package controle;

import classes.ConexaoAccess;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class Carroceria extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;

    /** Creates new form Carroceria */
    public Carroceria() {
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

        jtfNome = new javax.swing.JTextField();
        jlbMarca = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbtPesquisar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("Cadastro de Carroceria");

        jlbMarca.setText("Carroceria");

        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyPressed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMarca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtPesquisar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtSalvar)
                        .addComponent(jbtNovo))
                    .addComponent(jbtExcluir)
                    .addComponent(jbtPesquisar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            CarregaDados(Integer.parseInt(jtfCodigo.getText()));
        }
    }//GEN-LAST:event_jtfCodigoKeyPressed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed

        PesquisaCarroceria A = new PesquisaCarroceria();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.setSelected(true);
            A.SetCarroceria(this);
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);
        
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed

        Object[] botoes = { "Sim", "Não" };
        
        int resposta;

        resposta = JOptionPane.showOptionDialog(null, "Você deseja realmente excluir este registro?", "Confirma exclusão", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

        if(resposta == JOptionPane.YES_OPTION){

            String SQL = "update t_tipo_carroceria set exclusao = 1 where codigo = " + jtfCodigo.getText() + "";

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);
            Conexao.Executar();
            Conexao.Desconectar();

            Limpar();

        }

        jtfCodigo.requestFocus();
        
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        Limpar();

        jtfNome.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        Conexao = new ConexaoAccess();
        Conexao.Conectar();
        Conexao.setSQL("select * from t_tipo_carroceria where codigo = " + jtfCodigo.getText() + " ");
        ResultSet RS = Conexao.Consultar();

        try {
            if(RS.next()){
                String SQL;
                SQL = "update t_tipo_carroceria set nome = '" + jtfNome.getText().toUpperCase() + "' where codigo = " + jtfCodigo.getText() + "";
                Conexao.setSQL(SQL);
                Conexao.Executar();
            } else {
                String SQL;
                SQL = "insert into t_tipo_carroceria (codigo, nome, exclusao) values (" + jtfCodigo.getText() + ", '" + jtfNome.getText().toUpperCase() + "', 0)";
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carroceria().setVisible(true);
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

        SQL = "select codigo, nome from t_tipo_carroceria where codigo = " + Codigo + " and exclusao = 0 ";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){

                jtfCodigo.setText(RS.getString("codigo"));
                jtfNome.setText(RS.getString("nome"));

                jtfNome.requestFocus();

            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

    }

    public void Limpar(){
        
        jtfCodigo.setText("");
        jtfNome.setText("");
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JLabel jlbMarca;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables

}
