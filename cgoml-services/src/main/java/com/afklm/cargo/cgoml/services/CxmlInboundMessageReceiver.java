package com.afklm.cargo.cgoml.services;

import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;

public interface CxmlInboundMessageReceiver {

	ValidationReport receive(Object object);
}
