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

import com.afklm.cargo.cgoml.api.interfaces.messaging.OutboundMessageService;
import com.afklm.cargo.cgoml.api.model.messaging.forms.OutboundMessageForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class OutboundMessageCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(OutboundMessageCommand.class);

@Inject
private OutboundMessageService outboundMessageService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<OutboundMessageForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<OutboundMessageForm>(OutboundMessageForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<OutboundMessageForm>(OutboundMessageForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute outboundMessageService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
OutboundMessageForm outboundMessageForm = mapper.mapFrom(new OutboundMessageForm(), args);

this.outboundMessageService.save(outboundMessageForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
