/*
select tnfi.produto_cod, tnf.codigo from t_fornecedor tfo inner join t_nota_fiscal tnf on tnf.fornecedor_cod = tfo.cnpjcpf inner join t_nota_fiscal_item tnfi on tnfi.nf_cod = tnf.codigo inner join t_produto tpro on tpro.codigo = tnfi.produto_cod where tfo.cnpjcpf = '215587000169'

select (sum(tnfi.qtde)) as qtde from t_nota_fiscal_item tnfi where tnfi.produto_cod = 4 and tnfi.nf_cod = '987654' 

select * from t_nota_fiscal_item
select * from t_nota_fiscal

select tnfi.codigo, (tnf.codigo) as nf, (tnf.codigo || ' - ' || tpro.nome) as nome 
from t_fornecedor tfo 
inner join t_nota_fiscal tnf on tnf.fornecedor_cod = tfo.cnpjcpf 
inner join t_nota_fiscal_item tnfi on tnfi.nf_cod = tnf.codigo and tnfi.chave_cod = tnf.chave 
inner join t_produto tpro on tpro.codigo = tnfi.produto_cod 
where tfo.cnpjcpf = '215587000169' 

select * from t_movimentacao_item
select * from t_evento_item
select * from t_produto
select * from unidade

select * from t_movimentacao_item where movimentacao_cod = 2
select * from t_movimentacao where codigo = 2

select * from t_nota_fiscal_item where nf_cod = '0001'
select * from t_nota_fiscal where codigo = '0001'

delete from t_movimentacao_item where movimentacao_cod = 2
delete from t_movimentacao where codigo = 2

delete from t_nota_fiscal_item where nf_cod = '0001'
delete from t_nota_fiscal where codigo = '0001'
*/

select tmi.codigo, tmi.fornecedor_cod, tfo.nomefornecedor, tmi.evento_item_cod, tei.descricao, tmi.produto_cod, (tpr.nome) as combustivel, tmo.km, tmi.qtde, uni.abreviacao, tve.placa
from t_movimentacao_item tmi
inner join t_movimentacao tmo on tmo.codigo = tmi.movimentacao_cod
inner join t_fornecedor tfo on tfo.cnpjcpf = tmi.fornecedor_cod
inner join t_evento_item tei on tei.codigo = tmi.evento_item_cod
inner join t_produto tpr on tpr.codigo = tmi.produto_cod
inner join t_veiculo tve on tve.chassis = tmo.chassis_cod
inner join unidade uni on uni.codunidade = tpr.unidade_cod
where tmi.evento_item_cod = 1
	and tve.placa = 'BMO2345'