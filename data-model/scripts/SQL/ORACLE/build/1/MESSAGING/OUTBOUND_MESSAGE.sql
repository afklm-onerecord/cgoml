-- create table --
CREATE TABLE OUTBOUND_MESSAGE
(
ID NUMBER(19,0),
UUID VARCHAR2(255) NOT NULL,
RECEPTION_DATE TIMESTAMP NOT NULL,
MESSAGE_TYPE VARCHAR2(255) NULL,
CONTENT CLOB NULL,
CONSTRAINT PK_OUTBOUND_MESSAGE PRIMARY KEY (ID) USING INDEX (CREATE INDEX IDX_OUTBOUND_MESSAGE_PK ON OUTBOUND_MESSAGE(ID)
)
/

-- create sequence --
CREATE SEQUENCE OUTBOUND_MESSAGE_SEQ MINVALUE 0 NOMAXVALUE START WITH 0 INCREMENT BY 1 NOCYCLE
/

-- Specific Code Start --
-- Specific Code End --

