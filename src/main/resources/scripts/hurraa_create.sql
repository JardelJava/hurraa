drop table if exists fabricante;
drop table if exists autenticacao;
drop table if exists usuario_grupo;
drop table if exists grupo;
drop table if exists usuario;

create table fabricante (
  id   char(32)    not null,
  nome varchar(50) not null,
  tipo smallint
);

alter table fabricante add constraint pk_fabricante primary key (id);

create table usuario (
  id	char(32)     not null,
  nome	varchar(100) not null,
  email	varchar(100) not null,
  fone	varchar(10)
);

alter table usuario add constraint pk_usuario primary key (id);

create table autenticacao (
  id         char(32)     not null,
  usuario_id char(32)     not null,
  email      varchar(100) not null,
  senha      varchar(50)  not null
);

alter table autenticacao add constraint pk_autenticacao primary key (id);
create unique index idx_unique_autenticacao_email ON autenticacao (email);
alter table autenticacao add constraint fk_usuario_autenticacao foreign key (usuario_id) references usuario on delete cascade;

create table grupo (
    id   char(32)    not null,
    nome varchar(50) not null
);

alter table grupo add constraint pk_grupo primary key (id);
create unique index idx_unique_grupo_nome on grupo (nome);

CREATE TABLE usuario_grupo (
    id         char(32) not null,
    grupo_id   char(32) not null,
    usuario_id char(32) not null
);

alter table usuario_grupo add constraint pk_usuario_grupo primary key (id);
create index idx_grupo_usuario on usuario_grupo (grupo_id);
create index idx_usuario_grupo on usuario_grupo (usuario_id);
alter table usuario_grupo add constraint fk_grupo_usuario foreign key (grupo_id) references grupo on delete cascade;
alter table usuario_grupo add constraint fk_usuario_grupo foreign key (usuario_id) references usuario on delete cascade;
