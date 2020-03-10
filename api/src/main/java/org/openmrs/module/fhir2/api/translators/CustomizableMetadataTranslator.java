/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.fhir2.api.translators;

import org.hl7.fhir.r4.model.Provenance;
import org.openmrs.attribute.Attribute;

/**
 * Generic interface for a translator between OpenMRS data and FHIR Provenance resources
 *
 * @param <A> Associated Attribute ({@link org.openmrs.LocationAttribute},
 *            {@link org.openmrs.ProviderAttribute})
 * @param <T> OpenMRS data type
 */
public interface CustomizableMetadataTranslator<A extends Attribute, T> {
	
	/**
	 * Maps an OpenMRS Object to a {@link org.hl7.fhir.r4.model.Provenance} resource
	 *
	 * @param openMrsObject the OpenMRS object to translate
	 * @return the corresponding {@link org.hl7.fhir.r4.model.Provenance} resource
	 */
	Provenance getCreateProvenance(T openMrsObject);
	
	/**
	 * Maps an OpenMRS Object to a {@link org.hl7.fhir.r4.model.Provenance} resource
	 *
	 * @param openMrsObject the OpenMRS object to translate
	 * @return the corresponding {@link org.hl7.fhir.r4.model.Provenance} resource
	 */
	Provenance getUpdateProvenance(T openMrsObject);
}