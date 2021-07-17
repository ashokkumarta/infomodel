package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class AccessTokenResponseMessageBuilder {

	private AccessTokenResponseMessageImpl accessTokenResponseMessageImpl;

	public AccessTokenResponseMessageBuilder() {
		accessTokenResponseMessageImpl = new AccessTokenResponseMessageImpl();
	}

	public AccessTokenResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		accessTokenResponseMessageImpl.id = id;
	}



	final public AccessTokenResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.accessTokenResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.accessTokenResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.accessTokenResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.accessTokenResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.accessTokenResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.accessTokenResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.accessTokenResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.accessTokenResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.accessTokenResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.accessTokenResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AccessTokenResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.accessTokenResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AccessTokenResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessTokenResponseMessageImpl);
		return accessTokenResponseMessageImpl;
	}
}
