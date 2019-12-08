/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jeferson
 */
public class Funcoes {
    
    private ConexaoAccess Conexao;

    public String NomeCidade(int Codigo){
        String SQL, strCidade=null;
        SQL = "select cidade from cidade where codcidade = " + Codigo;
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strCidade = (RS.getString("cidade"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função cidade: " + Erro);
        }

        Conexao.Desconectar();

        return strCidade;
    }

    public String NomeEstado(int Codigo){
        String SQL, strEstado=null;
        SQL = "select uf from cidade_uf where coduf = " + Codigo;
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strEstado = (RS.getString("uf"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função Estado: " + Erro);
        }
        
        Conexao.Desconectar();

        return strEstado;
    }

    public String Proximo(String Campo, String Tabela, String Condicao){

        String SQL;
        String Codigo = null;

        SQL = "select (count(" + Campo + ") + 1) as prox from " + Tabela + " " + Condicao;

        System.out.println(SQL);
        
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                Codigo = (RS.getString("prox"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função: " + Erro);
        }

        Conexao.Desconectar();

        return Codigo;
    }

    public String Modelo(int Codigo){

        String SQL, strModelo=null;
        SQL = "select nome from t_modelo where codigo = " + Codigo;
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strModelo = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função modelo: " + Erro);
        }

        Conexao.Desconectar();

        return strModelo;
    }

    public String Tipo_Veiculo(int Codigo){

        String SQL, strVeiculo=null;
        SQL = "select nome from t_tipo_veiculo where codigo = " + Codigo;
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strVeiculo = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função modelo: " + Erro);
        }

        Conexao.Desconectar();

        return strVeiculo;

    }

    public String SiglaEstado(int Codigo){

        String SQL, strSigla=null;

        SQL = "select tuf.abreviacao ";
        SQL = SQL + "from cidade_uf tuf ";
        SQL = SQL + "inner join cidade tcd on tcd.coduf = tuf.coduf ";
        SQL = SQL + "where tcd.codcidade = " + Codigo;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strSigla = (RS.getString("abreviacao"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função sigla: " + Erro);
        }

        Conexao.Desconectar();

        return strSigla;

    }

    public String Marca(int Codigo){

        String SQL, strMarca=null;

        SQL = "select tma.nome ";
        SQL = SQL + "from t_marca tma ";
        SQL = SQL + "inner join t_modelo tmo on tmo.marca_cod = tma.codigo ";
        SQL = SQL + "where tmo.codigo = " + Codigo;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strMarca = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função marca: " + Erro);
        }

        Conexao.Desconectar();
        
        return strMarca;

    }

    public String Carroceria(int Codigo){

        String SQL, strCarroceria=null;

        SQL = "select ttc.nome ";
        SQL = SQL + "from t_tipo_carroceria ttc ";
        SQL = SQL + "where ttc.codigo = " + Codigo;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strCarroceria = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função marca: " + Erro);
        }

        Conexao.Desconectar();
        
        return strCarroceria;

    }
    
    public String Especie(int Codigo){

        String SQL, strEspecie=null;

        SQL = "select tte.nome ";
        SQL = SQL + "from t_tipo_especie tte ";
        SQL = SQL + "where tte.codigo = " + Codigo;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strEspecie = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função marca: " + Erro);
        }

        Conexao.Desconectar();
        
        return strEspecie;

    }
    
    public String Proximo (String Tabela){

        String SQL, strProximo=null;

        SQL = "select (count(*) + 1) as prox from " + Tabela;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strProximo = (RS.getString("prox"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função próximo: " + Erro);
        }

        Conexao.Desconectar();

        return strProximo;

    }

    public String NomeMarca(int Codigo){

        String SQL, strMarca=null;

        SQL = "select nome from t_marca where codigo = " + Codigo;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strMarca = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função nome marca: " + Erro);
        }

        Conexao.Desconectar();
        
        return strMarca;

    }

    public boolean VerificarMotorista(String Placa){

        String SQL;
        boolean Verifica=false;

        SQL = "select * from t_direcao where chassis_cod = '" + Placa + "'";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                Verifica = false;
            }else{
                Verifica = true;
            }
            
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função Verifica Motorista: " + Erro);
        }

        Conexao.Desconectar();

        return Verifica;
        
    }

    public boolean VerificarRegistroMotorista(String cpf){

        String SQL;
        boolean Verifica=false;

        SQL = "select nome from t_motorista where cpf = '" + cpf + "'";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                Verifica = false;
            }else{
                Verifica = true;
            }
            
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação do Registro Motorista: " + Erro);
        }

        Conexao.Desconectar();

        return Verifica;
        
    }
    
    public static DefaultFormatterFactory setFormatoData(){
        MaskFormatter comFoco = null;
        try{
            comFoco = new MaskFormatter("##/##/####");
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao formatar o campo data! " + erro);
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);

        return factory;
     }

    public static DefaultFormatterFactory setFormatoTelefone(){
        MaskFormatter comFoco = null;
        try{           
            comFoco = new MaskFormatter("(##) ##### - ####");
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao formatar o campo telefone! " + erro);
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);

        return factory;
     }

    public static DefaultFormatterFactory setFormatoHora(){
        MaskFormatter comFoco = null;
        try{
            comFoco = new MaskFormatter("##:##");
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao formatar o campo hora! " + erro);
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);

        return factory;
     }

    public static DefaultFormatterFactory strformatoMoeda(){
        MaskFormatter comFoco = null;
        try{
            comFoco = new MaskFormatter("R$ ###,###,##0.00");
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao formatar o campo moeda! " + erro);
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);

        //java.text.DecimalFormat df = new java.text.DecimalFormat("R$ ###,###,##0.00");

        return factory;

    }

    public String GravidadeMulta(int Pontos){

        String GM=null;
        String Gravidade;

        switch (Pontos) {
            case 3: Gravidade = "LEVE";
                    break;
            case 4: Gravidade = "MÉDIA";
                    break;
            case 5: Gravidade = "GRAVE";
                    break;
            case 7: Gravidade = "GRAVISSÍMA";
                    break;
            default: Gravidade = "";
                    break;
        }

        GM = Gravidade;

        return GM;     
        
    }

    public double ValorUfir (int ufir, float peso){

        double Valor=0;
        String SQL;

        SQL = "select ufir from t_opcoes";

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                Valor = ((ufir * peso) * Double.parseDouble(RS.getString("ufir")));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função Verifica Motorista: " + Erro);
        }

        Conexao.Desconectar();

        return Valor;

    }

    public String FuncaoSQL (String SQL){

        String Resultado = null;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                Resultado = RS.getString("retorno");
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função SQL: " + Erro);
        }

        Conexao.Desconectar();

        return Resultado;

    }

    public String VerificaCampoFormatado(String Texto){

        String Resultado = null;

        System.out.println("Texto: " + Texto);

        if ((Texto.equals("  /  /    ")) || (Texto.equals("(  )      -     "))){
            Resultado = null;
            System.out.println("Resultado: " + Resultado);
        }

        return Resultado;

    }

    public boolean isValidDate(String inDate) {

        if (inDate == null) {
            return false;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (inDate.trim().length() != dateFormat.toPattern().length()) {
            return false;
        }

        dateFormat.setLenient(false);

        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }

        return true;
    }

    public boolean isValidTime(String horario) {

        String hora = horario.toString();

        if (hora.equals("  :  ")) {
            //JOptionPane.showMessageDialog(null, "Digite a hora" ,"Operador",JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String horas = null;
        String minutos = null ;
        int conta_horas = 0;
        int conta_minutos = 0;  
        horas  = hora.substring(0,2);
        minutos  = hora.substring(3,5);
        conta_horas = Integer.parseInt(horas);
        conta_minutos = Integer.parseInt(minutos);

        if(conta_horas > 23) {
            //JOptionPane.showMessageDialog(null, "Hora digitada inválida" ,"Operador",JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(conta_minutos > 59) {
            //JOptionPane.showMessageDialog(null, "Hora digitada inválida" ,"Operador",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;

    }

    public boolean ExistenciaMotorista(String cpf) {

        String CPF = cpf.toString();
        String SQL;
        boolean Resultado = false;
        
        SQL = "select nome from t_motorista where cpf = '" + CPF + "' and exclusao = 0 ";
                        
        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                Resultado = true;
            } else {
                Resultado = false;                
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função SQL: " + Erro);
        }

        Conexao.Desconectar();
        
        return Resultado;
            
    }
    
    public String FuncaoGenerica(String SQL){

        String strFuncao=null;

        Conexao = new ConexaoAccess();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();

        try{
            if (RS.next()){
                strFuncao = (RS.getString("nome"));
            }
        }catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação da função genérica: " + Erro);
        }

        Conexao.Desconectar();
        
        return strFuncao;

    }
    
/*

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Funcoes Func = new ResultSetFrame();
                Func.show();
            }
        });
    }
*/
}