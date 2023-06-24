package com.afklm.cargo.cgoml.messages.resolver;

import com.afklm.cargo.cgoml.cxml.iata.xfum.v1.ULDManifestType;
import com.afklm.cargo.cgoml.cxml.iata.xfwb.v3.WaybillType;
import com.afklm.cargo.cgoml.services.CxmlInboundMessageReceiver;
import com.afklm.cargo.cgoml.services.CxmlOutboundMessageReceiver;
import com.afklm.cargo.cgoml.services.inbound.XfumInboundReceiver;
import com.afklm.cargo.cgoml.services.inbound.XfwbInboundReceiver;
import com.afklm.cargo.cgoml.services.outbound.XfwbOutboundReceiver;


public enum CxmlMessageTypes {
	
	XFUM("(?s).*?<(.*?):ULDManifest[^>]*>.*?</\\1:ULDManifest>.*", ULDManifestType.class, XfumInboundReceiver.class, null),
	XFWB("(?s).*?<(.*?):Waybill[^>]*>.*?</\\1:Waybill>.*", WaybillType.class, XfwbInboundReceiver.class, XfwbOutboundReceiver.class);
	
	/*
	 * constructor
	 */
	private CxmlMessageTypes(String regexp, Class<?> objectType, Class<? extends CxmlInboundMessageReceiver> inboundServiceType, Class<? extends CxmlOutboundMessageReceiver> outboundServiceType) {
		this.regexp = regexp;
		this.objectType = objectType;
		this.inboundServiceType = inboundServiceType;
	}
	
	/*
	 * properties
	 */
	private String regexp;
	private Class<?> objectType;
	private Class<? extends CxmlInboundMessageReceiver> inboundServiceType;
	private Class<? extends CxmlOutboundMessageReceiver> outboundServiceType;
	
	/*
	 * getters and setters
	 */
	public String getRegexp() {
		return regexp;
	}
	public Class<?> getObjectType() {
		return objectType;
	}
	public Class<? extends CxmlInboundMessageReceiver> getInboundServiceType() {
		return inboundServiceType;
	}
	public Class<? extends CxmlOutboundMessageReceiver> getOutboundServiceType() {
		return outboundServiceType;
	}
	
	public static final String UNKNOWN = "UNKNOWN";
}
