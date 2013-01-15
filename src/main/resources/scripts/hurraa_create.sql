CREATE DATABASE "hurraa"
  WITH OWNER "postgres"
  ENCODING 'UTF8'
  LC_COLLATE = 'en_US.UTF-8'
  LC_CTYPE = 'en_US.UTF-8';
  
CREATE TABLE fabricante (
  id serial PRIMARY KEY,
  nome text NOT NULL,
  tipo smallint
);  
