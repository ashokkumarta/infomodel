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
	"Resource Catalog"@en

	"Class that aggregates Resources which, as a whole, form a (distributable) Catalog."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ResourceCatalog")
public class ResourceCatalogImpl implements Serializable, ResourceCatalog {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Resource Catalog", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Class that aggregates Resources which, as a whole, form a (distributable) Catalog.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"offered resource"@en

	"A Resource that is part of a resource catalog, indicating an offering (of, e.g., data)."@en
	*/
	@JsonAlias({"ids:offeredResource", "offeredResource"})
	 java.util.ArrayList<? extends Resource> _offeredResource;

	/**
	"requested resource"@en

	"A Resource that is part of a resource catalog, indicating a request (of, e.g., data, software,...)."@en
	*/
	@JsonAlias({"ids:requestedResource", "requestedResource"})
	 java.util.ArrayList<? extends Resource> _requestedResource;

	// no manual construction
	ResourceCatalogImpl() {
		id = VocabUtil.getInstance().createRandomUrl("resourceCatalog");
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
	
	
	@JsonProperty("ids:requestedResource")
	java.util.ArrayList<? extends Resource> getRequestedResource() {
		return _requestedResource;
	}
	final public void setRequestedResource (java.util.ArrayList<? extends Resource> _requestedResource_) {
		this._requestedResource = _requestedResource_;
	}

	final public 
	
	
	@JsonProperty("ids:offeredResource")
	java.util.ArrayList<? extends Resource> getOfferedResource() {
		return _offeredResource;
	}
	final public void setOfferedResource (java.util.ArrayList<? extends Resource> _offeredResource_) {
		this._offeredResource = _offeredResource_;
	}


}
