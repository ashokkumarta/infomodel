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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	/** 
	"Content type"@en

	"Enumerated types of content expanding upon the Digital Content hierarchy."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ContentType")
public enum ContentType {
	/** 
	"Interface definition"

	"Formal, machine-interpretable definition of a protocol-specific API, e.g. OpenAPI, GraphQL, API Blueprint, WSDL."@en */
	INTERFACE_DEFINITION("https://w3id.org/idsa/code/INTERFACE_DEFINITION", Arrays.asList(new TypedLiteral("Interface definition", "")), Arrays.asList(new TypedLiteral("Formal, machine-interpretable definition of a protocol-specific API, e.g. OpenAPI, GraphQL, API Blueprint, WSDL.", "en"))),
	/** 
	"Schema definition"

	"Formal, machine-interpretable definition of a data schema, e.g. XMLSchema, JSONSchema"@en */
	SCHEMA_DEFINITION("https://w3id.org/idsa/code/SCHEMA_DEFINITION", Arrays.asList(new TypedLiteral("Schema definition", "")), Arrays.asList(new TypedLiteral("Formal, machine-interpretable definition of a data schema, e.g. XMLSchema, JSONSchema", "en")));

	private static final Map<String,ContentType> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private java.util.List<TypedLiteral> label;
	private java.util.List<TypedLiteral> comment;

	//TODO dummy method for generic properties, should be deleted in future versions
	public java.util.Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}

	ContentType(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getLabel() {
		return label;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getComment() {
		return comment;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	@JsonProperty("@id")
	final public URI getSerializedId() {
		try {
			 return new URI("idsc:" + id.toString().substring(id.toString().lastIndexOf("/") + 1));
		} catch (Exception e) {}
		return null;
	}
	

	@JsonCreator
	public static ContentType deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}


}
