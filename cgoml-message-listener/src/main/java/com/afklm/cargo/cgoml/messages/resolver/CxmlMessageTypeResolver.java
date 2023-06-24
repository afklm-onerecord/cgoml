package com.afklm.cargo.cgoml.messages.resolver;

import java.util.regex.Pattern;


public class CxmlMessageTypeResolver {

	public static CxmlMessageTypes getType(String message) {
		
		for (CxmlMessageTypes type:CxmlMessageTypes.values()) {
			if (Pattern.matches(type.getRegexp(), message)) {
				return type;
			}
		}
		return null;
	}
}
