IF NOT EXISTS(SELECT * FROM sysobjects WHERE name='usuarios' and xtype='U')

create table usuarios(
	
ID BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY,
NOME VARCHAR (45)NOT NULL,
SOBRENOME VARCHAR(45) NOT NULL,
EMAIL VARCHAR(45) NOT NULL,
PASSWORD VARCHAR(200)NOT NULL,
TIPO_PRINCIPAL_USUARIO VARCHAR(45) NULL,
DATA_NASCIMENTO DATETIME NULL,
COD_STATUS_USUARIO BIT NULL,
UNIQUE(EMAIL)


);