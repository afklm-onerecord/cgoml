package com.afklm.cargo.cgoml.services.inbound;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.core.AirWaybillCoreService;
import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgoml.components.mapper.cxml.CxmlAirWaybillMapper;
import com.afklm.cargo.cgoml.cxml.iata.xfwb.v3.WaybillType;
import com.afklm.cargo.cgoml.services.CxmlInboundMessageReceiver;

@Component("XfwbInboundReceiver")
public class XfwbInboundReceiver implements CxmlInboundMessageReceiver {

	
	@Inject
	private CxmlAirWaybillMapper mapper;
	
	@Inject
	private AirWaybillCoreService service;
	
	@Override
	@Transactional
	public ValidationReport receive(Object object) {
		
		AirWaybillCoreForm form = mapper.mapFrom((WaybillType)object);
		ValidationReport report = service.register(form);

		return report;
	}
}
