package org.eclipse.mdht.uml.term.ui.service.fhir;

import java.util.ArrayList;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.mdht.uml.term.ui.TerminologyService;
import org.eclipse.mdht.uml.term.ui.service.fhir.internal.Activator;
import org.eclipse.mdht.uml.term.ui.service.fhir.preferences.PreferenceConstants;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.ValueSet;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.client.ServerValidationModeEnum;
import ca.uhn.fhir.rest.client.interceptor.BasicAuthInterceptor;

public class FHIRTerminologyService implements TerminologyService {

	private static FhirContext ourCtx;

	private static IGenericClient ourClient;

	private static ArrayList<String> result = new ArrayList<String>();

	private void init() {
		if (ourCtx == null) {
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			String base = store.getString(PreferenceConstants.P_FHIRURL);
			String username = store.getString(PreferenceConstants.P_FHIRUSER);
			String password = store.getString(PreferenceConstants.P_FHIRPASSWORD);
			ourCtx = new FhirContext(FhirVersionEnum.DSTU3);
			ourCtx.getRestfulClientFactory().setServerValidationMode(ServerValidationModeEnum.NEVER);
			ourClient = ourCtx.newRestfulGenericClient(base);
			BasicAuthInterceptor authInterceptor = new BasicAuthInterceptor(username, password);
			ourClient.registerInterceptor(authInterceptor);
		}
		// Perform a ValueSet search
		Bundle results = ourClient.search().forResource(ValueSet.class).count(10000).returnBundle(
			Bundle.class).execute();
		int ctr = 0;
		for (BundleEntryComponent bec : results.getEntry()) {
			ValueSet valueSet = (org.hl7.fhir.dstu3.model.ValueSet) bec.getResource();
			result.add(valueSet.getId());
			// if (ctr++ < 50) {
			// try {
			// ValueSet vs2 = ourClient.read().resource(ValueSet.class).withId(
			// valueSet.getIdElement().getIdPart()).execute();
			//
			// System.out.println(vs2.getId());
			// System.out.println(vs2.getUrl());
			// System.out.println(vs2.getName());
			// System.out.println(vs2.getDescription());
			//
			// // result.add(vs2.getUrl());
			// } catch (Exception e) {
			// }
			// }

		}
	}

	public FHIRTerminologyService() {
		System.out.println("ffffffx");
		;
	}

	@Override
	public ArrayList<String> getValueSets() {
		try {
			if (result.isEmpty()) {
				init();
			}
		} catch (RuntimeException re) {

		}
		return result;
	}

}
