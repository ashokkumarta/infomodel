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
	"App Route"@en

	"\n    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.\n    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between data apps is represented by the ids:EndToEndRoutes class.\n    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.\n    "@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppRouteImpl.class),
@JsonSubTypes.Type(value = EndToEndRoute.class),})
public interface AppRoute {

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
	"route deploy method"@en

	"Supplementary information about, e.g., the technology used, for routes."
	*/
	
	@NotNull
	@JsonProperty("ids:routeDeployMethod")
	String getRouteDeployMethod();
	/**
	"sub route"@en

	"Route between two or more app endpoints inside a app routing pipeline."@en
	*/
	
	
	@JsonProperty("ids:subRoute")
	java.util.ArrayList<? extends EndToEndRoute> getSubRoute();
	/**
	"app route start"@en

	"Start of a route."@en
	*/
	
	
	@JsonProperty("ids:appRouteStart")
	java.util.ArrayList<? extends AppEndpoint> getAppRouteStart();
	/**
	"app route end"@en

	"End of a route."@en
	*/
	
	
	@JsonProperty("ids:appRouteEnd")
	java.util.ArrayList<? extends AppEndpoint> getAppRouteEnd();
	/**
	"route description "@en

	"Route description."@en
	*/
	
	
	@JsonProperty("ids:routeDescription")
	String getRouteDescription();
	/**
	"route configuration"@en

	"Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	*/
	
	
	@JsonProperty("ids:routeConfiguration")
	String getRouteConfiguration();
}
