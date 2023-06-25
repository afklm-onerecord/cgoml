package com.afklm.cargo.cgoml.services.inbound;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.core.FlightPreparationCoreService;
import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgoml.components.mapper.cxml.CxmlUldManifestMapper;
import com.afklm.cargo.cgoml.cxml.iata.xfum.v1.ULDManifestType;
import com.afklm.cargo.cgoml.services.CxmlInboundMessageReceiver;

@Component("XfumInboundReceiver")
public class XfumInboundReceiver implements CxmlInboundMessageReceiver {

	@Inject
	private FlightPreparationCoreService service;
	
	@Inject
	private CxmlUldManifestMapper mapper;
	
	@Override
	public ValidationReport receive(Object object) {
		
		UldOnFlightCoreForm form = mapper.mapFrom((ULDManifestType)object);
		ValidationReport report = service.registerUldOnFlight(form);

		return report;
	}
}
