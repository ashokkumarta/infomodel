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

public class EndToEndRouteBuilder {

	private EndToEndRouteImpl endToEndRouteImpl;

	public EndToEndRouteBuilder() {
		endToEndRouteImpl = new EndToEndRouteImpl();
	}

	public EndToEndRouteBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		endToEndRouteImpl.id = id;
	}


	final public EndToEndRouteBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.endToEndRouteImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	final public EndToEndRouteBuilder _subRoute_(java.util.ArrayList<? extends EndToEndRoute> _subRoute_) {
		this.endToEndRouteImpl._subRoute = _subRoute_;
		return this;
	}


	final public EndToEndRouteBuilder _appRouteStart_(java.util.ArrayList<? extends AppEndpoint> _appRouteStart_) {
		this.endToEndRouteImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	final public EndToEndRouteBuilder _appRouteEnd_(java.util.ArrayList<? extends AppEndpoint> _appRouteEnd_) {
		this.endToEndRouteImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	final public EndToEndRouteBuilder _routeDescription_(String _routeDescription_) {
		this.endToEndRouteImpl._routeDescription = _routeDescription_;
		return this;
	}


	final public EndToEndRouteBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.endToEndRouteImpl._routeConfiguration = _routeConfiguration_;
		return this;
	}

	public final EndToEndRoute build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(endToEndRouteImpl);
		return endToEndRouteImpl;
	}
}
