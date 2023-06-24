package com.afklm.cargo.cgoml.services.inbound;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgoml.services.CxmlInboundMessageReceiver;

@Component("XfsuInboundReceiver")
public class XfsuInboundReceiver implements CxmlInboundMessageReceiver {

	@Override
	@Transactional
	public ValidationReport receive(Object object) {
		
		return null;

	}
}
