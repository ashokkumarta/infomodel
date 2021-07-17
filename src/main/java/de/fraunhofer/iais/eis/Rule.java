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
	"Rule"@en

	"Superclass of Permissions, Prohibitions and Duties."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = Duty.class),

@JsonSubTypes.Type(value = Permission.class),

@JsonSubTypes.Type(value = Prohibition.class),})
public interface Rule extends Described {

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
	"applied actions"@en

	"action"@en

	"The sequence of executed actions on the data object. Must be an element of ids:Action."@en

	"The operation relating to the asset for which permission is being granted."@en
	*/
	
	@NotEmpty
	@JsonProperty("ids:action")
	java.util.ArrayList<? extends Action> getAction();
	/**
	"constraint"@en

	"The constraint to be used for a specific rule."@en
	*/
	
	
	@JsonProperty("ids:constraint")
	java.util.ArrayList<? extends Constraint> getConstraint();
	/**
	"assigner"@en

	"The issuer of the policy statement."@en
	*/
	
	
	@JsonProperty("ids:assigner")
	java.util.ArrayList<? extends URI> getAssigner();
	/**
	"assignee"@en

	"The recipient of the policy statement."@en
	*/
	
	
	@JsonProperty("ids:assignee")
	java.util.ArrayList<? extends URI> getAssignee();
	/**
	"target"@en

	"The subject of the policy statement (ids:Rule)."@en
	*/
	
	
	@JsonProperty("ids:target")
	URI getTarget();
}
