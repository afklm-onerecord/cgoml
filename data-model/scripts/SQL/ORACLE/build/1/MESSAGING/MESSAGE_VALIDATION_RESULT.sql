-- create table --
CREATE TABLE MESSAGE_VALIDATION_RESULT
(
ID NUMBER(19,0),
INBOUND_MESSAGE_ID NUMBER(19,0) NOT NULL,
LEVEL VARCHAR2(255) NULL,
MIP_CODE VARCHAR2(255) NULL,
DESCRIPTION VARCHAR2(255) NULL,
CONSTRAINT PK_MESSAGE_VALIDATION_RESULT PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_MESSAGE_VALIDATION_RESULT_PK ON MESSAGE_VALIDATION_RESULT(ID)
)
/

-- create sequence --
CREATE SEQUENCE MESSAGE_VALIDATION_RESULT_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

