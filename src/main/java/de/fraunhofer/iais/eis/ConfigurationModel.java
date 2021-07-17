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

	"Configuration Model is used for Connector deployment."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ConfigurationModelImpl.class),})
public interface ConfigurationModel {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"configuration model log level"@en

	"Log level configuration for a Connector which is deployed using the Configuration Model"@en
	*/
	
	@NotNull
	@JsonProperty("ids:configurationModelLogLevel")
	LogLevel getConfigurationModelLogLevel();
	/**
	"Connector Status"@en

	"Status of a Connector deployed by the Configuration Model"@en
	*/
	
	@NotNull
	@JsonProperty("ids:connectorStatus")
	ConnectorStatus getConnectorStatus();
	/**
	"connector deploy mode"@en

	"Deply mode of a Connector in the Configuration Model"@en
	*/
	
	@NotNull
	@JsonProperty("ids:connectorDeployMode")
	ConnectorDeployMode getConnectorDeployMode();
	/**
	"user authentication"@en

	"authentication methods allowed in a Configuration Model"@en
	*/
	
	
	@JsonProperty("ids:userAuthentication")
	java.util.ArrayList<? extends UserAuthentication> getUserAuthentication();
	/**
	"Connector proxy"@en

	"Proxies for a Connector which is deployed using the Configuration Model"@en
	*/
	
	
	@JsonProperty("ids:connectorProxy")
	java.util.ArrayList<? extends Proxy> getConnectorProxy();
	/**
	"app route"
	*/
	
	
	@JsonProperty("ids:appRoute")
	java.util.ArrayList<? extends AppRoute> getAppRoute();
	/**
	"Connector description"@en

	"References to Connector which is deployed / maintained in the Configuration Model"@en
	*/
	
	
	@JsonProperty("ids:connectorDescription")
	Connector getConnectorDescription();
	/**
	"trust store"@en

	"URI of the trust store server."@en
	*/
	
	
	@JsonProperty("ids:trustStore")
	URI getTrustStore();
	/**
	"key store"@en

	"URI of the key store server."@en
	*/
	
	
	@JsonProperty("ids:keyStore")
	URI getKeyStore();
}
