/*
select * from t_produto
select * from t_nota_fiscal
select * from t_nota_fiscal_item
select * from t_fornecedor
select * from t_movimentacao
select * from t_movimentacao_item

select tnfi.codigo, (tnf.codigo || ' - ' || tpro.nome) as produto
from t_fornecedor tfo
inner join t_nota_fiscal tnf on tnf.fornecedor_cod = tfo.cnpjcpf
inner join t_nota_fiscal_item tnfi on tnfi.nf_cod = tnf.codigo
inner join t_produto tpro on tpro.codigo = tnfi.produto_cod
where tfo.cnpjcpf = '22533780898'

select (cnpjcpf) as codigo, (nomefantasia) as nome 
from t_fornecedor
where cnpjcpf in (select fornecedor_cod from t_nota_fiscal) 
order by nome

select tpro.nome, (sum(qtde)) as qtde
from t_nota_fiscal_item tnfi
inner join t_nota_fiscal tnf on tnf.codigo = tnfi.nf_cod
inner join t_produto tpro on tpro.codigo = tnfi.produto_cod
where tnf.fornecedor_cod = '22533780898'
	and tnf.codigo = '32587'
group by tpro.nome

*/

select tnf.codigo
from t_nota_fiscal tnf
inner join t_nota_fiscal_item tnfi on tnfi.nf_cod = tnf.codigo
where tnfi.codigo = 1

select tpro.nome, (sum(qtde)) as qtde 
from t_nota_fiscal_item tnfi 
inner join t_nota_fiscal tnf on tnf.codigo = tnfi.nf_cod 
inner join t_produto tpro on tpro.codigo = tnfi.produto_cod 
where tnf.fornecedor_cod = 'jefinho blz' 
	and tnfi.codigo = 1 
group by tpro.nome 


