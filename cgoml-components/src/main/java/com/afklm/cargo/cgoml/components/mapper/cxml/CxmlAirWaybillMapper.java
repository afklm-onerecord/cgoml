package com.afklm.cargo.cgoml.components.mapper.cxml;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgoml.cxml.iata.xfwb.v3.MasterConsignmentType;
import com.afklm.cargo.cgoml.cxml.iata.xfwb.v3.WaybillType;

@Component
public class CxmlAirWaybillMapper extends BasicMapperImpl<AirWaybillCoreForm, WaybillType> {

	public CxmlAirWaybillMapper() {
		super(AirWaybillCoreForm.class, WaybillType.class);
	}
	
	@Override
	public AirWaybillCoreForm mapFrom(AirWaybillCoreForm form, WaybillType waybill) {

		MasterConsignmentType masterConsignment = waybill.getMasterConsignment();
		
		//Number
		form.setAirWaybillNumber(waybill.getBusinessHeaderDocument().getID().getValue());
		
		//Forwarder name
		form.setForwarderName(waybill.getMasterConsignment().getFreightForwarderParty().getName().getValue());
		
		//O&D
		form.setOriginIataCode(masterConsignment.getOriginLocation().getID().getValue());
		form.setDestinationIataCode(masterConsignment.getFinalDestinationLocation().getID().getValue());

		// pieces
		if (masterConsignment.getTotalPieceQuantity() != null) {
			form.setNumberOfPieces(masterConsignment.getTotalPieceQuantity().getValue().intValue());
		}
		
		// weight
		if (masterConsignment.getIncludedTareGrossWeightMeasure() != null) {
			form.setGrossWeightUnitOfMeasureCode(masterConsignment.getIncludedTareGrossWeightMeasure().getUnitCode());
			form.setGrossWeight(masterConsignment.getIncludedTareGrossWeightMeasure().getValue());
		}

		// volume
		if (masterConsignment.getGrossVolumeMeasure() != null) {
			form.setGrossWeightUnitOfMeasureCode(masterConsignment.getIncludedTareGrossWeightMeasure().getUnitCode());
			form.setGrossWeight(masterConsignment.getIncludedTareGrossWeightMeasure().getValue());
		}
		return form;
	}
}	
