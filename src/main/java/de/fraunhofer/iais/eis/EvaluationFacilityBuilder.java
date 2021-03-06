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

public class EvaluationFacilityBuilder {

	private EvaluationFacilityImpl evaluationFacilityImpl;

	public EvaluationFacilityBuilder() {
		evaluationFacilityImpl = new EvaluationFacilityImpl();
	}

	public EvaluationFacilityBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		evaluationFacilityImpl.id = id;
	}

	public final EvaluationFacility build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(evaluationFacilityImpl);
		return evaluationFacilityImpl;
	}
}
