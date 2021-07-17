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

	"\n    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.\n    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between data apps is represented by the ids:EndToEndRoutes class.\n    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.\n    "@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppRoute")
public class AppRouteImpl implements Serializable, AppRoute {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Route", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between data apps is represented by the ids:EndToEndRoutes class.    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.    ", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"app route end"@en

	"End of a route."@en
	*/
	@JsonAlias({"ids:appRouteEnd", "appRouteEnd"})
	 java.util.ArrayList<? extends AppEndpoint> _appRouteEnd;

	/**
	"app route start"@en

	"Start of a route."@en
	*/
	@JsonAlias({"ids:appRouteStart", "appRouteStart"})
	 java.util.ArrayList<? extends AppEndpoint> _appRouteStart;

	/**
	"route configuration"@en

	"Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	*/
	@JsonAlias({"ids:routeConfiguration", "routeConfiguration"})
	 String _routeConfiguration;

	/**
	"route deploy method"@en

	"Supplementary information about, e.g., the technology used, for routes."
	*/
	@NotNull@JsonAlias({"ids:routeDeployMethod", "routeDeployMethod"})
	 String _routeDeployMethod;

	/**
	"route description "@en

	"Route description."@en
	*/
	@JsonAlias({"ids:routeDescription", "routeDescription"})
	 String _routeDescription;

	/**
	"sub route"@en

	"Route between two or more app endpoints inside a app routing pipeline."@en
	*/
	@JsonAlias({"ids:subRoute", "subRoute"})
	 java.util.ArrayList<? extends EndToEndRoute> _subRoute;

	// no manual construction
	AppRouteImpl() {
		id = VocabUtil.getInstance().createRandomUrl("appRoute");
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
	@JsonProperty("ids:routeDeployMethod")
	String getRouteDeployMethod() {
		return _routeDeployMethod;
	}
	final public void setRouteDeployMethod (String _routeDeployMethod_) {
		this._routeDeployMethod = _routeDeployMethod_;
	}

	final public 
	
	
	@JsonProperty("ids:subRoute")
	java.util.ArrayList<? extends EndToEndRoute> getSubRoute() {
		return _subRoute;
	}
	final public void setSubRoute (java.util.ArrayList<? extends EndToEndRoute> _subRoute_) {
		this._subRoute = _subRoute_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteStart")
	java.util.ArrayList<? extends AppEndpoint> getAppRouteStart() {
		return _appRouteStart;
	}
	final public void setAppRouteStart (java.util.ArrayList<? extends AppEndpoint> _appRouteStart_) {
		this._appRouteStart = _appRouteStart_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteEnd")
	java.util.ArrayList<? extends AppEndpoint> getAppRouteEnd() {
		return _appRouteEnd;
	}
	final public void setAppRouteEnd (java.util.ArrayList<? extends AppEndpoint> _appRouteEnd_) {
		this._appRouteEnd = _appRouteEnd_;
	}

	final public 
	
	
	@JsonProperty("ids:routeDescription")
	String getRouteDescription() {
		return _routeDescription;
	}
	final public void setRouteDescription (String _routeDescription_) {
		this._routeDescription = _routeDescription_;
	}

	final public 
	
	
	@JsonProperty("ids:routeConfiguration")
	String getRouteConfiguration() {
		return _routeConfiguration;
	}
	final public void setRouteConfiguration (String _routeConfiguration_) {
		this._routeConfiguration = _routeConfiguration_;
	}
}
