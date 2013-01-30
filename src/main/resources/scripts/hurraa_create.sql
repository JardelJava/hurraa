=================== TABELAS POSTGRES IMPLEMENTADAS =============================

CREATE DATABASE "hurraa"
  WITH OWNER "postgres"
  ENCODING 'UTF8'
  LC_COLLATE = 'en_US.UTF-8'
  LC_CTYPE = 'en_US.UTF-8';

CREATE TABLE fabricante (
  id   serial      PRIMARY KEY,
  nome varchar(50) NOT NULL,
  tipo smallint
);

CREATE TABLE usuario (
  id	serial       PRIMARY KEY,
  nome	varchar(100) NOT NULL,
  email	varchar(100) NOT NULL,
  fone	varchar(10)
);

CREATE TABLE autenticacao (
  id         serial       PRIMARY KEY,
  usuario_id integer      NOT NULL,
  email      varchar(100) NOT NULL,
  senha      varchar(50)  NOT NULL
);

CREATE UNIQUE index idx_unique_aut_email ON autenticacao (email);

ALTER TABLE autenticacao ADD CONSTRAINT fk_usuario_autenticacao FOREIGN KEY (usuario_id) REFERENCES usuario ON DELETE CASCADE;

CREATE TABLE grupo (
    id   serial      PRIMARY KEY,
    nome varchar(50) NOT NULL
);

CREATE UNIQUE index idx_unique_grupo_nome on grupo (nome);

CREATE TABLE usuario_grupo (
    id         serial   PRIMARY KEY,
    grupo_id   integer  NOT NULL,
    usuario_id integer  NOT NULL
);

CREATE index idx_grupo_usuario on usuario_grupo (grupo_id);
CREATE index idx_usuario_grupo on usuario_grupo (usuario_id);
ALTER TABLE usuario_grupo ADD CONSTRAINT fk_grupo_usuario FOREIGN KEY (grupo_id) REFERENCES grupo ON DELETE CASCADE;
ALTER TABLE usuario_grupo ADD CONSTRAINT fk_usuario_grupo FOREIGN KEY (usuario_id) REFERENCES usuario ON DELETE CASCADE;