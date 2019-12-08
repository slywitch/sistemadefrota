/*

select * from t_tipo_combustivel

select * from t_tipo_cor
*/




select tve.chassis, tve.placa, tve.cor, tve.tipo_veiculo, (ttv.nome) as nome_veiculo, tve.renavam, tve.cidade_cod, tcd.cidade, tve.certificado, tve.qtde_eixo, modelo_cod, 
	(tmd.nome) as modelo, tve.ano, tve.capacidade, (ttc.nome) as combustivel, (ttcr.nome) as cor,
from t_veiculo tve 
inner join t_tipo_veiculo ttv on ttv.codigo = tve.tipo_veiculo 
inner join t_modelo tmd on tmd.codigo = tve.modelo_cod 
inner join cidade tcd on tcd.codcidade = tve.cidade_cod
inner join t_tipo_combustivel ttc on ttc.codigo = tve.tipo_combustivel
inner join t_tipo_cor ttcr on ttcr.codigo = tve.tipo_cor
where chassis = '12345678'
