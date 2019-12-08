/*
select tmi.codigo, tmi.fornecedor_cod, tfo.nomefornecedor, tmi.evento_item_cod, tei.descricao, tmi.produto_cod, (tpr.nome) as combustivel, tmo.km, tmi.qtde, uni.abreviacao, 
	tve.placa 
from t_movimentacao_item tmi 
inner join t_movimentacao tmo on tmo.codigo = tmi.movimentacao_cod 
inner join t_fornecedor tfo on tfo.cnpjcpf = tmi.fornecedor_cod 
inner join t_evento_item tei on tei.codigo = tmi.evento_item_cod 
inner join t_produto tpr on tpr.codigo = tmi.produto_cod 
inner join t_veiculo tve on tve.chassis = tmo.chassis_cod 
inner join unidade uni on uni.codunidade = tpr.unidade_cod 
where tmi.evento_item_cod = 1 
	and tve.placa = 'BMO2345' 
order by tmo.km desc 

select * from t_temp_rendimento

*/


select ttr.codigo, ttr.movimentacao_cod, ttr.fornecedor_cod, tfo.nomefornecedor, ttr.evento_item_cod, tei.descricao, ttr.produto_cod, (tpr.nome) as combustivel, 
	ttr.km, ttr.qtde, ttr.abreviacao, ttr.placa
from t_temp_rendimento ttr
inner join t_fornecedor tfo on tfo.cnpjcpf = ttr.fornecedor_cod 
inner join t_evento_item tei on tei.codigo = ttr.evento_item_cod 
inner join t_produto tpr on tpr.codigo = ttr.produto_cod 
order by codigo

select tmi.codigo, tmi.fornecedor_cod, tfo.nomefornecedor, tmi.evento_item_cod, tei.descricao, tmi.produto_cod, (tpr.nome) as combustivel, tmo.km, tmi.qtde, uni.abreviacao, tve.placa from t_movimentacao_item tmi inner join t_movimentacao tmo on tmo.codigo = tmi.movimentacao_cod inner join t_fornecedor tfo on tfo.cnpjcpf = tmi.fornecedor_cod inner join t_evento_item tei on tei.codigo = tmi.evento_item_cod inner join t_produto tpr on tpr.codigo = tmi.produto_cod inner join t_veiculo tve on tve.chassis = tmo.chassis_cod inner join unidade uni on uni.codunidade = tpr.unidade_cod where tmi.evento_item_cod = 1 and tve.placa = 'BMO2345' order by tmo.km desc 