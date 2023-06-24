-- table unique constraints --
ALTER TABLE INBOUND_MESSAGE ADD CONSTRAINT UC_INBOUND_MESSAGE UNIQUE (UUID) USING INDEX (CREATE INDEX IDX_INBOUND_MESSAGE_UC ON INBOUND_MESSAGE(UUID))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

