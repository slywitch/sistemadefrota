/*
select * from t_tipo_combustivel
select * from t_modelo
select * from t_marca
select * from t_tipo_especie
select * from t_veiculo
select * from t_tipo_carroceria


select tve.chassis, tve.placa, tve.tipo_cor, (ttc.nome) as cor, tve.tipo_veiculo, (ttv.nome) as nome_veiculo, tve.renavam, tve.cidade_cod, tcd.cidade, tve.certificado, 
	tve.qtde_eixo, modelo_cod, (tmd.nome) as modelo, tve.ano, tve.capacidade, tipo_combustivel, (ttcb.nome) as combustivel, tipo_especie, (tte.nome) as especie,
	tipo_carroceria, (ttca.nome) as carroceria 
from t_veiculo tve 
inner join t_tipo_veiculo ttv on ttv.codigo = tve.tipo_veiculo 
inner join t_modelo tmd on tmd.codigo = tve.modelo_cod 
inner join cidade tcd on tcd.codcidade = tve.cidade_cod

inner join t_tipo_cor ttc on ttc.codigo = tve.tipo_cor 
inner join t_tipo_combustivel ttcb on ttcb.codigo = tve.tipo_combustivel
inner join t_tipo_especie tte on tte.codigo = tve.tipo_especie
inner join t_tipo_carroceria ttca on ttca.codigo = tve.tipo_carroceria

where chassis = '12345678'*/

select 	tnf.codigo,
	tfo.nomefantasia, tfo.nomefornecedor, tfo.enderecofornecedor, tfo.bairrofornecedor, cid.cidade, tfo.	cepfornecedor,
	tfo.fone1fornecedor, tfo.fone2fornecedor, tfo.faxfornecedor, tfo.iefornecedor, tfo.imfornecedor,tfo.contatofornecedor, tfo.emailfornecedor,
	to_char(tnf.data, 'DD/MM/YYYY') as data, (tnfi.codigo) as item, (tpr.nome) as produto, tnfi.qtde, uni.abreviacao, tnfi.preco,
	(tnfi.qtde * tnfi.preco) as subtotal
from t_nota_fiscal tnf
inner join t_fornecedor tfo on tfo.cnpjcpf = tnf.fornecedor_cod
inner join t_nota_fiscal_item tnfi on tnfi.nf_cod = tnf.codigo
inner join t_produto tpr on tpr.codigo = tnfi.produto_cod
inner join unidade uni on uni.codunidade = tpr.unidade_cod
inner join cidade cid on cid.codcidade = tfo.cidadecod
where tnf.codigo = '123456'