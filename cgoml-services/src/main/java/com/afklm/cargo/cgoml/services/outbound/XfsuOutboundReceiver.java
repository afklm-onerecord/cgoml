package com.afklm.cargo.cgoml.services.outbound;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgoml.services.CxmlOutboundMessageReceiver;

@Component("XfsuOutboundReceiver")
public class XfsuOutboundReceiver implements CxmlOutboundMessageReceiver {

	@Override
	@Transactional
	public void receive(Object object) {
		

	}
}
