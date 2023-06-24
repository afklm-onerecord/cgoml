-- table unique constraints --
ALTER TABLE OUTBOUND_MESSAGE ADD CONSTRAINT UC_OUTBOUND_MESSAGE UNIQUE (UUID) USING INDEX (CREATE INDEX IDX_OUTBOUND_MESSAGE_UC ON OUTBOUND_MESSAGE(UUID))
/

-- table foreign keys --
-- table indexes --
-- Specific Code Start --
-- Specific Code End --

