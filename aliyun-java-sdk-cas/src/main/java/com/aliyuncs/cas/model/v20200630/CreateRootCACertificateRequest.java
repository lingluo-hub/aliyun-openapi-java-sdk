/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cas.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRootCACertificateRequest extends RpcAcsRequest<CreateRootCACertificateResponse> {
	   

	private String countryCode;

	private String locality;

	private Integer years;

	private String commonName;

	private String organization;

	private String state;

	private String organizationUnit;

	private String algorithm;
	public CreateRootCACertificateRequest() {
		super("cas", "2020-06-30", "CreateRootCACertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if(countryCode != null){
			putQueryParameter("CountryCode", countryCode);
		}
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
		if(locality != null){
			putQueryParameter("Locality", locality);
		}
	}

	public Integer getYears() {
		return this.years;
	}

	public void setYears(Integer years) {
		this.years = years;
		if(years != null){
			putQueryParameter("Years", years.toString());
		}
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
		if(commonName != null){
			putQueryParameter("CommonName", commonName);
		}
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
		if(organization != null){
			putQueryParameter("Organization", organization);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getOrganizationUnit() {
		return this.organizationUnit;
	}

	public void setOrganizationUnit(String organizationUnit) {
		this.organizationUnit = organizationUnit;
		if(organizationUnit != null){
			putQueryParameter("OrganizationUnit", organizationUnit);
		}
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm);
		}
	}

	@Override
	public Class<CreateRootCACertificateResponse> getResponseClass() {
		return CreateRootCACertificateResponse.class;
	}

}
