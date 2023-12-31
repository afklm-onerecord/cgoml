-- create table --
CREATE TABLE OUTBOUND_MESSAGE
(
id BIGINT,
UUID VARCHAR(255) NOT NULL,
RECEPTION_DATE TIMESTAMP WITH TIME ZONE NOT NULL,
MESSAGE_TYPE VARCHAR(255) NULL,
CONTENT TEXT NULL
);
/

ALTER TABLE OUTBOUND_MESSAGE ADD CONSTRAINT PK_OUTBOUND_MESSAGE PRIMARY KEY (ID);
/

-- create sequence --
CREATE SEQUENCE OUTBOUND_MESSAGE_SEQ
INCREMENT 1
MINVALUE 0
MAXVALUE 9223372036854775807
START 0
CACHE 1;
/

-- Specific Code Start --
-- Specific Code End --
