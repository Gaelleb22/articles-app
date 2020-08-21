create table article (
id int not null auto_increment,
libelle VARCHAR(100) not null,
prix decimal(7,2) not null,
primary key (id)
);

insert into article(libelle, prix) values ('Roman policier', 20);
insert into article(libelle, prix) values ('Magasine sport', 8.90);
insert into article(libelle, prix) values ('Stylo x1', 1.20);
insert into article(libelle, prix) values ('Gomme x1', 0.95);
insert into article(libelle, prix) values ('Carte postale x1', 0.55);
insert into article(libelle, prix) values ('Livre Jeunesse', 12.55);