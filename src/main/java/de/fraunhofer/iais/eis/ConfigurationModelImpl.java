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

/** 
	"Configuration Model"@en

	"Configuration Model is used for Connector deployment."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ConfigurationModel")
public class ConfigurationModelImpl implements Serializable, ConfigurationModel {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Configuration Model", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Configuration Model is used for Connector deployment.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"app route"
	*/
	@JsonAlias({"ids:appRoute", "appRoute"})
	 java.util.ArrayList<? extends AppRoute> _appRoute;

	/**
	"configuration model log level"@en

	"Log level configuration for a Connector which is deployed using the Configuration Model"@en
	*/
	@NotNull@JsonAlias({"ids:configurationModelLogLevel", "configurationModelLogLevel"})
	 LogLevel _configurationModelLogLevel;

	/**
	"connector deploy mode"@en

	"Deply mode of a Connector in the Configuration Model"@en
	*/
	@NotNull@JsonAlias({"ids:connectorDeployMode", "connectorDeployMode"})
	 ConnectorDeployMode _connectorDeployMode;

	/**
	"Connector description"@en

	"References to Connector which is deployed / maintained in the Configuration Model"@en
	*/
	@JsonAlias({"ids:connectorDescription", "connectorDescription"})
	 Connector _connectorDescription;

	/**
	"Connector proxy"@en

	"Proxies for a Connector which is deployed using the Configuration Model"@en
	*/
	@JsonAlias({"ids:connectorProxy", "connectorProxy"})
	 java.util.ArrayList<? extends Proxy> _connectorProxy;

	/**
	"Connector Status"@en

	"Status of a Connector deployed by the Configuration Model"@en
	*/
	@NotNull@JsonAlias({"ids:connectorStatus", "connectorStatus"})
	 ConnectorStatus _connectorStatus;

	/**
	"key store"@en

	"URI of the key store server."@en
	*/
	@JsonAlias({"ids:keyStore", "keyStore"})
	 URI _keyStore;

	/**
	"trust store"@en

	"URI of the trust store server."@en
	*/
	@JsonAlias({"ids:trustStore", "trustStore"})
	 URI _trustStore;

	/**
	"user authentication"@en

	"authentication methods allowed in a Configuration Model"@en
	*/
	@JsonAlias({"ids:userAuthentication", "userAuthentication"})
	 java.util.ArrayList<? extends UserAuthentication> _userAuthentication;

	// no manual construction
	ConfigurationModelImpl() {
		id = VocabUtil.getInstance().createRandomUrl("configurationModel");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	@NotNull
	@JsonProperty("ids:configurationModelLogLevel")
	LogLevel getConfigurationModelLogLevel() {
		return _configurationModelLogLevel;
	}
	final public void setConfigurationModelLogLevel (LogLevel _configurationModelLogLevel_) {
		this._configurationModelLogLevel = _configurationModelLogLevel_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:connectorStatus")
	ConnectorStatus getConnectorStatus() {
		return _connectorStatus;
	}
	final public void setConnectorStatus (ConnectorStatus _connectorStatus_) {
		this._connectorStatus = _connectorStatus_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:connectorDeployMode")
	ConnectorDeployMode getConnectorDeployMode() {
		return _connectorDeployMode;
	}
	final public void setConnectorDeployMode (ConnectorDeployMode _connectorDeployMode_) {
		this._connectorDeployMode = _connectorDeployMode_;
	}

	final public 
	
	
	@JsonProperty("ids:userAuthentication")
	java.util.ArrayList<? extends UserAuthentication> getUserAuthentication() {
		return _userAuthentication;
	}
	final public void setUserAuthentication (java.util.ArrayList<? extends UserAuthentication> _userAuthentication_) {
		this._userAuthentication = _userAuthentication_;
	}

	final public 
	
	
	@JsonProperty("ids:connectorProxy")
	java.util.ArrayList<? extends Proxy> getConnectorProxy() {
		return _connectorProxy;
	}
	final public void setConnectorProxy (java.util.ArrayList<? extends Proxy> _connectorProxy_) {
		this._connectorProxy = _connectorProxy_;
	}

	final public 
	
	
	@JsonProperty("ids:appRoute")
	java.util.ArrayList<? extends AppRoute> getAppRoute() {
		return _appRoute;
	}
	final public void setAppRoute (java.util.ArrayList<? extends AppRoute> _appRoute_) {
		this._appRoute = _appRoute_;
	}

	final public 
	
	
	@JsonProperty("ids:connectorDescription")
	Connector getConnectorDescription() {
		return _connectorDescription;
	}
	final public void setConnectorDescription (Connector _connectorDescription_) {
		this._connectorDescription = _connectorDescription_;
	}

	final public 
	
	
	@JsonProperty("ids:trustStore")
	URI getTrustStore() {
		return _trustStore;
	}
	final public void setTrustStore (URI _trustStore_) {
		this._trustStore = _trustStore_;
	}

	final public 
	
	
	@JsonProperty("ids:keyStore")
	URI getKeyStore() {
		return _keyStore;
	}
	final public void setKeyStore (URI _keyStore_) {
		this._keyStore = _keyStore_;
	}
}
