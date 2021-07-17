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

public class SystemAdapterBuilder {

	private SystemAdapterImpl systemAdapterImpl;

	public SystemAdapterBuilder() {
		systemAdapterImpl = new SystemAdapterImpl();
	}

	public SystemAdapterBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		systemAdapterImpl.id = id;
	}


	final public SystemAdapterBuilder _appEndpoint_(java.util.ArrayList<? extends AppEndpoint> _appEndpoint_) {
		this.systemAdapterImpl._appEndpoint = _appEndpoint_;
		return this;
	}


	final public SystemAdapterBuilder _appDocumentation_(String _appDocumentation_) {
		this.systemAdapterImpl._appDocumentation = _appDocumentation_;
		return this;
	}

	public final SystemAdapter build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(systemAdapterImpl);
		return systemAdapterImpl;
	}
}
