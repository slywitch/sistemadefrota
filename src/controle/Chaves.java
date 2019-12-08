/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Chaves.java
 *
 * Created on 04/12/2009, 08:44:56
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
public class Chaves extends javax.swing.JInternalFrame {

    private ConexaoAccess Conexao;
    private Funcoes Fun;

    /** Creates new form Chaves */
    public Chaves() {
        initComponents();
        JogarMotorista();
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

        jlbCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jlbVeiculo = new javax.swing.JLabel();
        cboVeiculo = new javax.swing.JComboBox();
        jlbMotorista = new javax.swing.JLabel();
        cboMotorista = new javax.swing.JComboBox();
        jlbKmInicial = new javax.swing.JLabel();
        jtfKm = new javax.swing.JTextField();
        jlbDataInicial = new javax.swing.JLabel();
        jtfData = new javax.swing.JFormattedTextField();
        jlbHoraSaida = new javax.swing.JLabel();
        jtfHora = new javax.swing.JFormattedTextField();
        jlbDestino = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpDestino = new javax.swing.JTextPane();
        jbtSalvar3 = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("Entrega de Chaves");

        jlbCodigo.setText("Código");

        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyPressed(evt);
            }
        });

        jlbVeiculo.setText("Veículo");

        cboVeiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlbMotorista.setText("Motorista");

        cboMotorista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlbKmInicial.setText("Km Inicial");

        jlbDataInicial.setText("Data Inicial");

        jtfData.setFormatterFactory(Fun.setFormatoData());

        jlbHoraSaida.setText("Hora Saída");

        jtfHora.setFormatterFactory(Fun.setFormatoHora());

        jlbDestino.setText("Destino");

        jScrollPane1.setViewportView(jtpDestino);

        jbtSalvar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        jbtSalvar3.setText("Salvar");
        jbtSalvar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtSalvar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtSalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvar3ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbDataInicial)
                                    .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbKmInicial)
                                    .addComponent(jtfKm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbHoraSaida)
                                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlbDestino))
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSalvar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbVeiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbMotorista)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboMotorista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbVeiculo)
                    .addComponent(jlbMotorista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbDataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbKmInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbHoraSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtSalvar3)
                        .addComponent(jbtNovo))
                    .addComponent(jbtExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String SQL;

            SQL = "select tcha.codigo, tcha.chassis_cod, tvei.placa, tcha.cpf_cod, tmot.nome, tcha.km, ";
            SQL = SQL + "to_char(tcha.data,'DD/MM/YYYY') as data2, tcha.hora, tcha.destino ";
            SQL = SQL + "from t_chaves tcha ";
            SQL = SQL + "inner join t_veiculo tvei on tvei.chassis = tcha.chassis_cod ";
            SQL = SQL + "inner join t_motorista tmot on tmot.cpf = tcha.cpf_cod ";
            SQL = SQL + "where tcha.codigo = ";
            SQL = SQL + jtfCodigo.getText() + " ";
            SQL = SQL + "and tcha.exclusao = 0 ";

            Conexao = new ConexaoAccess();
            Conexao.Conectar() ;
            Conexao.setSQL(SQL);

            ResultSet RS = Conexao.Consultar();

            try{
                if (RS.next()){
                    Combo Ve = new Combo(RS.getString("chassis_cod"), RS.getString("placa"));
                    ComboBoxModel CboV;
                    CboV = cboVeiculo.getModel();
                    CboV.setSelectedItem(Ve);

                    Combo Mo = new Combo(RS.getString("cpf_cod"), RS.getString("nome"));
                    ComboBoxModel CboM;
                    CboM = cboMotorista.getModel();
                    CboM.setSelectedItem(Mo);

                    jtfData.setText(RS.getString("data2"));
                    jtfKm.setText(RS.getString("km"));
                    jtfHora.setText(RS.getString("hora"));
                    jtpDestino.setText(RS.getString("destino"));
                }else{
                    Limpar();

                    cboVeiculo.requestFocus();
                }
            }catch (Exception Erro){
                JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
            }
            
            cboVeiculo.requestFocus();
            Conexao.Desconectar();
        }

    }//GEN-LAST:event_jtfCodigoKeyPressed

    private void jbtSalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvar3ActionPerformed

        String Veiculo = ((Combo)cboVeiculo.getSelectedItem()).getKey();
        String Motorista = ((Combo)cboMotorista.getSelectedItem()).getKey();

        Conexao = new ConexaoAccess();
        Conexao.Conectar();

        if (jtfCodigo.getText().equals("")){
            jtfCodigo.setText("0");
        }

        String sSQL = "select * from t_chaves where codigo = " + jtfCodigo.getText() + " ";
        System.out.println(sSQL);
        Conexao.setSQL(sSQL);
        ResultSet RS = Conexao.Consultar();

        try {
            
            Fun = new Funcoes();
            String Data;
            String strSQLData;

            if (!(Fun.isValidDate(jtfData.getText()))){
                strSQLData = "data = " + null;
                Data = null;
            } else {
                strSQLData = "data = '" + jtfData.getText() + "'";
                Data = "'" + jtfData.getText() + "'";
            }
            
            Fun = new Funcoes();
            String Hora;
            String strSQLHora;
           
            if (!(Fun.isValidTime(jtfHora.getText()))){
                strSQLHora = "hora = " + null;
                Hora = null;
            } else {
                strSQLHora = "hora = '" + jtfHora.getText() + "'";
                Hora = "'" + jtfHora.getText() + "'";
            }
            
            if(RS.next()){
                String SQL;
                
                SQL = "update t_chaves set chassis_cod = '" + Veiculo + "', cpf_cod = '" + Motorista + "', km = '";
                SQL = SQL + jtfKm.getText() + "', " + strSQLData + ", " + strSQLHora + ", ";
                SQL = SQL + "destino = '" + jtpDestino.getText() + "' " ;
                SQL = SQL + "where codigo = " + jtfCodigo.getText() + " ";

                System.out.println(SQL);

                Conexao.setSQL(SQL);
                Conexao.Executar();
            } else {
                String SQL;

                Fun = new Funcoes();
                String ProxReg;

                ProxReg = Fun.Proximo("t_chaves");

                SQL = "insert into t_chaves (codigo, chassis_cod, cpf_cod, km, data, hora, destino, exclusao) values (";
                SQL = SQL + ProxReg + ", '" + Veiculo + "', '" + Motorista + "', '" + jtfKm.getText() + "";
                SQL = SQL + "', " + Data + ", " + Hora + ", '";
                SQL = SQL + jtpDestino.getText() + "', 0)";

                Conexao.setSQL(SQL);
                Conexao.Executar();
            }
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "(Erro na validação): " + Erro);
        }

        Conexao.Desconectar();

        Limpar();

        cboVeiculo.requestFocus();

    }//GEN-LAST:event_jbtSalvar3ActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        Limpar();

        cboVeiculo.requestFocus();
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed

        Object[] botoes = { "Sim", "Não" };

        int resposta;

        resposta = JOptionPane.showOptionDialog(null, "Você deseja realmente excluir este registro?", "Confirma exclusão", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

        if(resposta == JOptionPane.YES_OPTION){

            String SQL = "update t_chaves set exclusao = 1 where codigo = " + jtfCodigo.getText() + "";

            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL(SQL);
            Conexao.Executar();
            Conexao.Desconectar();

            Limpar();

        }

        cboVeiculo.requestFocus();
        
    }//GEN-LAST:event_jbtExcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chaves().setVisible(true);
            }
        });
    }

    public void centralizar(JDesktopPane dp) {
        Dimension ds = dp.getSize();
        Dimension dw = this.getSize();
        this.setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    private void Limpar(){

        jtfCodigo.setText("");

        cboVeiculo.removeAllItems();
        JogarVeiculo();

        cboMotorista.removeAllItems();
        JogarMotorista();

        jtfKm.setText("");
        jtfData.setText("");
        jtfHora.setText("");
        jtpDestino.setText("");
    }

    private void JogarMotorista(){
        cboMotorista.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select (cpf) as codigo, nome from t_motorista where exclusao = 0 order by nome");
            ResultSet RS = Conexao.Consultar();
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            while(RS.next()){
                Combo CB = new Combo(RS.getString("codigo"),RS.getString("nome"));
                Modelo.addElement(CB);
            }
            cboMotorista.setModel(Modelo);
        }catch(Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro: " + Erro);
        }
    }

    private void JogarVeiculo(){
        cboVeiculo.removeAllItems();
        try {
            Conexao = new ConexaoAccess();
            Conexao.Conectar();
            Conexao.setSQL("select (chassis) as codigo, (placa) as nome from t_veiculo where exclusao = 0 order by nome");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboMotorista;
    private javax.swing.JComboBox cboVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar3;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbDataInicial;
    private javax.swing.JLabel jlbDestino;
    private javax.swing.JLabel jlbHoraSaida;
    private javax.swing.JLabel jlbKmInicial;
    private javax.swing.JLabel jlbMotorista;
    private javax.swing.JLabel jlbVeiculo;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfData;
    private javax.swing.JFormattedTextField jtfHora;
    private javax.swing.JTextField jtfKm;
    private javax.swing.JTextPane jtpDestino;
    // End of variables declaration//GEN-END:variables

}
