-- table unique constraints --
-- table foreign keys --
ALTER TABLE MESSAGE_VALIDATION_RESULT ADD CONSTRAINT FK_MESSAGE_VALIDATION_RESULT_0 FOREIGN KEY (INBOUND_MESSAGE_ID) REFERENCES INBOUND_MESSAGE ON DELETE CASCADE
/

-- table indexes --
CREATE INDEX IDX_MESSAGE_VALIDATION_RESULT_C0 ON MESSAGE_VALIDATION_RESULT(INBOUND_MESSAGE_ID)
/

-- Specific Code Start --
-- Specific Code End --

