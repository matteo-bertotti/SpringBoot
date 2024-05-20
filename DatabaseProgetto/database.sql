create database gestione_auto;
use gestione_auto;

create table proprietario
(id int auto_increment primary key,
nome varchar(30) not null,
cognome varchar(30) not null,
telefono varchar(30) not null);

create table auto
(id int auto_increment primary key,
targa char(7) not null,
marca varchar(30) not null,
modello varchar(30) not null,
fkproprietario int not null);

alter table auto
add constraint fkautoproprietario
foreign key(fkproprietario)
references proprietario(id);

insert into proprietario
values
(default,'Mario','Rossi','333/12345678'),
(default,'Ugo','Rossi','320/4445566'),
(default,'Paolo','Verdi','321/1112233');

insert into auto
values
(default,'AA111BB','Fiat','Panda',1),
(default,'BB222CC','Fiat','Punto',1),
(default,'CC333DD','BMW','X3',2);