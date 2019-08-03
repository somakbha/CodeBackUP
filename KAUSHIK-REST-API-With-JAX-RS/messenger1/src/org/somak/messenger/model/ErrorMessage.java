package org.somak.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errroMessage;
	private int errorCode;
	private String documentation;

	public ErrorMessage() {
		super();

	}

	public ErrorMessage(String errroMessage, int errorCode, String documentation) {
		super();
		this.errroMessage = errroMessage;
		this.errorCode = errorCode;
		this.documentation = documentation;
	}

	public String getErrroMessage() {
		return errroMessage;
	}

	public void setErrroMessage(String errroMessage) {
		this.errroMessage = errroMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

}
