/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import classes.Combo;
import classes.ConexaoAccess;
import classes.Funcoes;
import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class Manutencao extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    private Funcoes Fun;
    
    /**
     * Creates new form Manutencao
     */
    public Manutencao() {        
        initComponents();
        JogarUnidade();
        JogarTipoManutencao();
        JogarGrupoManutencao();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manutencao().setVisible(true);
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

        label1 = new java.awt.Label();
        jlbCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JFormattedTextField();
        jlbNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JFormattedTextField();
        jlbUnidade = new javax.swing.JLabel();
        jcbUnidade = new javax.swing.JComboBox();
        jlbIntervalo = new javax.swing.JLabel();
        jtfIntervalo = new javax.swing.JFormattedTextField();
        jlbTipoManutencao = new javax.swing.JLabel();
        jcbTipoManutencao = new javax.swing.JComboBox();
        jlbGrupoManutencao = new javax.swing.JLabel();
        jcbGrupoManutencao = new javax.swing.JComboBox();
        jbtPesquisar = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();

        label1.setText("label1");

        setClosable(true);
        setTitle("Manutenção");

        jlbCodigo.setText("Código");

        jlbNome.setText("Nome");

        jlbUnidade.setText("Unidade");

        jcbUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlbIntervalo.setText("Intervalo");

        jlbTipoManutencao.setText("Tipos Manutenção");

        jcbTipoManutencao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlbGrupoManutencao.setText("Grupo Manutenção");

        jcbGrupoManutencao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisa.png"))); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtNovo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtPesquisar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbGrupoManutencao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbGrupoManutencao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNome)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbUnidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbUnidade, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbIntervalo)
                            .addComponent(jtfIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbTipoManutencao)
                            .addComponent(jcbTipoManutencao, 0, 187, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigo)
                    .addComponent(jlbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbUnidade)
                            .addComponent(jlbIntervalo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbTipoManutencao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbTipoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbGrupoManutencao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbGrupoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtSalvar)
                        .addComponent(jbtNovo))
                    .addComponent(jbtExcluir)
                    .addComponent(jbtPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed

        PesquisaManutencao A = new PesquisaManutencao();
        A.setVisible(true);
        JDesktopPane JDP = this.getDesktopPane();
        JDP.add(A);
        A.centralizar(JDP);
        try{
            A.Validador("Manutencao");
            A.setSelected(true);
            A.SetPequisaManutencao(this);
        }catch (Exception E){
            JOptionPane.showMessageDialog(null, "Erro: " + E);
        }
        A.setVisible(true);
        
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        String Unidade = ((Combo)jcbUnidade.getSelectedItem()).getKey();
        String TipoManutencao = ((Combo)jcbTipoManutencao.getSelectedItem()).getKey();
        String GrupoManutencao = ((Combo)jcbGrupoManutencao.getSelectedItem()).getKey();
        
        Conexao = new ConexaoAccess();
        Conexao.Conectar();
        Conexao.setSQL("select * from t_manutencao where codigo = '" + jtfCodigo.getText() + "' ");
        ResultSet RS = Conexao.Consultar();

        try {
            if(RS.next()){
                String SQL;

                SQL = "update t_manutencao set nome = '" + jtfNome.getText() + "', unidade_cod = " + Unidade + ", ";
                SQL = SQL + "intervalo = " + jtfIntervalo.getText() + ", tipomanutencao_cod = " + TipoManutencao + ", ";
                SQL = SQL + "grupomanutencao_cod = " + GrupoManutencao + " ";
                SQL = SQL + "where codigo = " + jtfCodigo.getText() + " ";

                Conexao.setSQL(SQL);
                Conexao.Executar();
            } else {
                String SQL;

                SQL = "insert into t_manutencao (codigo, nome, unidade_cod, intervalo, tipomanutencao_cod, ";
                SQL = SQL + "grupomanutencao_cod, exclusao) values (";
                SQL = SQL + jtfCodigo.getText() + ", '" + jtfNome.getText() + "', ";
                SQL = SQL + Unidade + ", '" + jtfIntervalo.getText() + "', " + TipoManutencao + ", ";
                SQL = SQL + GrupoManutencao + ", 0) ";

                Conexao.setSQL(SQL);
                Conexao.Executar();
            }

        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();

        Limpar();

        jtfCodigo.requestFocus();
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed

        Object[] botoes = { "Sim", "Não" };

        int resposta;

        resposta = JOptionPane.showOptionDialog(null, "Você deseja realmente excluir este registro?", "Confirma exclusão", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

        if(resposta == JOptionPane.YES_OPTION){

            String SQL = "update t_manutencao set exclusao = 1 where chassis = '" + jtfCodigo.getText() + "'";

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

        jtfCodigo.requestFocus();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void Limpar (){
        
        jtfCodigo.setText("");
        jtfNome.setText("");
        
        jcbUnidade.removeAllItems();
        JogarUnidade();
        
        jtfIntervalo.setText("");
        
        jcbTipoManutencao.removeAllItems();
        JogarTipoManutencao();
        
        jcbGrupoManutencao.removeAllItems();
        JogarGrupoManutencao();
        
    }
    
    private void JogarUnidade(){
        jcbUnidade.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select codigo, nome from t_unidade_manutencao where exclusao = 0 order by nome");
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }
            jcbUnidade.setModel(Modelo);
        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }
    }
    
    private void JogarTipoManutencao(){
        jcbTipoManutencao.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select codigo, nome from t_tipo_manutencao where exclusao = 0 order by nome");
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }
            jcbTipoManutencao.setModel(Modelo);
        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }
    }
    
    private void JogarGrupoManutencao(){
        jcbGrupoManutencao.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select codigo, nome from t_grupo_manutencao where exclusao = 0 order by nome");
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }
            jcbGrupoManutencao.setModel(Modelo);
        } catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }
    }
    
    public void CarregaDados(String Codigo){

        String SQL;
        
        SQL = "select tma.codigo, tma.nome, tma.unidade_cod, (ttc.nome) as cor, tma.intervalo, tma.tipomanutencao_cod, ";
        SQL = SQL + "tma.grupomanutencao_cod, ";
        SQL = SQL + "from t_manutencao tma ";
        SQL = SQL + "inner join t_tipo_unidade ttu on ttu.codigo = tma.unidade_cod ";
        SQL = SQL + "inner join t_tipo_manutencao ttm on ttm.codigo = tve.tipomanutencao_cod ";
        SQL = SQL + "inner join t_grupo_manutencao tgm on tgm.codigo = tmd.grupomanutencao_cod ";        
        SQL = SQL + "where tma.codigo = " + Codigo + " ";
        SQL = SQL + "and tma.exclusao = 0 ";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                jtfCodigo.setText(RS.getString("codigo"));
                jtfNome.setText(RS.getString("nome"));
                
                Combo Tipo_VE = new Combo(RS.getString("unidade_cod"), RS.getString("nome_unidade"));
                ComboBoxModel CMB;
                CMB = jcbUnidade.getModel();
                CMB.setSelectedItem(Tipo_VE);

                jtfIntervalo.setText(RS.getString("intervalo"));
              
                Combo Cor = new Combo(RS.getString("tipomanutencao_cod"), RS.getString("nome_tipomanutencao"));
                ComboBoxModel ComboCor;
                ComboCor = jcbTipoManutencao.getModel();
                ComboCor.setSelectedItem(Cor);

                Combo Combustivel = new Combo(RS.getString("codigo_grupomanutencao"), RS.getString("nome_grupomanutencao"));
                ComboBoxModel ComboCombustivel;
                ComboCombustivel = jcbGrupoManutencao.getModel();
                ComboCombustivel.setSelectedItem(Combustivel);
               
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }
        
        jtfCodigo.requestFocus();
        Conexao.Desconectar();

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JComboBox jcbGrupoManutencao;
    private javax.swing.JComboBox jcbTipoManutencao;
    private javax.swing.JComboBox jcbUnidade;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbGrupoManutencao;
    private javax.swing.JLabel jlbIntervalo;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbTipoManutencao;
    private javax.swing.JLabel jlbUnidade;
    private javax.swing.JFormattedTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfIntervalo;
    private javax.swing.JFormattedTextField jtfNome;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
