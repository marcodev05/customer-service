
create user postgres2 with password 'password';
create database customerdb with template=template0 owner=postgres2;
\connect customerdb
alter default privileges grant all on tables to postgres2;
alter default privileges grant all on sequences to postgres2;

-- create table etudiant(
--     
--     id_etudiant varchar(10) primary key not null;
--     nom varchar(50) not null;
--     prenom varchar(50) ;
--     date_nais varchar(10) not null;
--     lieu_nais varchar(30) not null;
--      

-- );