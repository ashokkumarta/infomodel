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

public class AppRouteBuilder {

	private AppRouteImpl appRouteImpl;

	public AppRouteBuilder() {
		appRouteImpl = new AppRouteImpl();
	}

	public AppRouteBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appRouteImpl.id = id;
	}

	final public AppRouteBuilder _routeDeployMethod_(String _routeDeployMethod_) {
		this.appRouteImpl._routeDeployMethod = _routeDeployMethod_;
		return this;
	}


	final public AppRouteBuilder _subRoute_(java.util.ArrayList<? extends EndToEndRoute> _subRoute_) {
		this.appRouteImpl._subRoute = _subRoute_;
		return this;
	}


	final public AppRouteBuilder _appRouteStart_(java.util.ArrayList<? extends AppEndpoint> _appRouteStart_) {
		this.appRouteImpl._appRouteStart = _appRouteStart_;
		return this;
	}


	final public AppRouteBuilder _appRouteEnd_(java.util.ArrayList<? extends AppEndpoint> _appRouteEnd_) {
		this.appRouteImpl._appRouteEnd = _appRouteEnd_;
		return this;
	}


	final public AppRouteBuilder _routeDescription_(String _routeDescription_) {
		this.appRouteImpl._routeDescription = _routeDescription_;
		return this;
	}


	final public AppRouteBuilder _routeConfiguration_(String _routeConfiguration_) {
		this.appRouteImpl._routeConfiguration = _routeConfiguration_;
		return this;
	}

	public final AppRoute build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appRouteImpl);
		return appRouteImpl;
	}
}
