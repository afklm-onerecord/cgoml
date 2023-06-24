package com.afklm.cargo.cgoml.populator.command.messaging;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgoml.api.interfaces.messaging.InboundMessageService;
import com.afklm.cargo.cgoml.api.model.messaging.forms.InboundMessageForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class InboundMessageCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(InboundMessageCommand.class);

@Inject
private InboundMessageService inboundMessageService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<InboundMessageForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<InboundMessageForm>(InboundMessageForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<InboundMessageForm>(InboundMessageForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute inboundMessageService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
InboundMessageForm inboundMessageForm = mapper.mapFrom(new InboundMessageForm(), args);

this.inboundMessageService.save(inboundMessageForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
