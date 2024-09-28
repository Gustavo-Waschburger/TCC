create database csrc;
drop database csrc;
use csrc;

ALTER USER 'root'@'localhost' IDENTIFIED BY 'gustavo';

create database clientespetshop;

use petshop;
select * from clientes;
select * from enderecos;