package com.afklm.cargo.cgoml.components.mapper.cxml;

import java.time.LocalDate;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgoml.cxml.iata.xfum.v1.LogisticsTransportMovementType;
import com.afklm.cargo.cgoml.cxml.iata.xfum.v1.ULDManifestType;
import com.afklm.cargo.cgoml.cxml.iata.xfum.v1.UnitLoadTransportEquipmentType;

@Component
public class CxmlUldManifestMapper extends BasicMapperImpl<UldOnFlightCoreForm, ULDManifestType> {

	public CxmlUldManifestMapper() {
		super(UldOnFlightCoreForm.class, ULDManifestType.class);
	}
	
	@Override
	public UldOnFlightCoreForm mapFrom(UldOnFlightCoreForm form, ULDManifestType object) {

		UnitLoadTransportEquipmentType xfum = ((ULDManifestType)object).getUnitLoadTransportEquipment().get(0);
		LogisticsTransportMovementType transport = xfum.getMainCarriageLogisticsTransportMovement().get(0);
		
		String operatingAirline = transport.getUsedLogisticsTransportMeans().getID().getValue();
		String flightNumber = transport.getID().getValue();
		LocalDate departureDate = CxmlDateUtils.toLocalDate(transport.getDepartureEvent().getScheduledOccurrenceDateTime());
		
		String uldTypeCode = xfum.getCharacteristicCode().getValue();
		String uldCode = xfum.getID().getValue();
		String uldOwnerCode = xfum.getOperatingParty().getPrimaryID().getValue();
		
		form.setDatedFlightCompanyIataCode(operatingAirline);
		form.setDatedFlightFlightNumber(flightNumber);
		form.setDatedFlightDepartureDate(departureDate);
		form.setUldCode(uldCode);
		form.setUldOwnerCode(uldOwnerCode);
		form.setUldTypeCode(uldTypeCode);
		
		return form;
	}
}	
