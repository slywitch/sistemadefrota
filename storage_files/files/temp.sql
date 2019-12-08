/*
select * from t_nota_fiscal
select * from t_nota_fiscal_item
select * from t_movimentacao_item;
select * from t_movimentacao

delete from t_nota_fiscal

select (cnpjcpf) as codigo, (nomefantasia) as nome from t_fornecedor order by nome

delete from t_movimentacao
delete from t_movimentacao_item
*/

select tnf.codigo, (tnf.codigo || ' - ' || tfo.nomefornecedor) as nome
from t_fornecedor tfo
inner join t_nota_fiscal tnf on tnf.fornecedor_cod = tfo.cnpjcpf
inner join t_nota_fiscal_item tnfi on tnfi.nf_cod = tnf.codigo
inner join t_movimentacao_item tmi on tmi.nf_item_cod = tnf.codigo
where tnfi.qtde > tmi.qtde


select codigo, nome from t_produto

select codigo, nome from t_produto order by nome