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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.baas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InstallFabricChaincodePackageRequest extends RpcAcsRequest<InstallFabricChaincodePackageResponse> {
	   

	private String chaincodePackageId;

	private String organizationId;

	private String location;
	public InstallFabricChaincodePackageRequest() {
		super("Baas", "2018-12-21", "InstallFabricChaincodePackage", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChaincodePackageId() {
		return this.chaincodePackageId;
	}

	public void setChaincodePackageId(String chaincodePackageId) {
		this.chaincodePackageId = chaincodePackageId;
		if(chaincodePackageId != null){
			putBodyParameter("ChaincodePackageId", chaincodePackageId);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putBodyParameter("OrganizationId", organizationId);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	@Override
	public Class<InstallFabricChaincodePackageResponse> getResponseClass() {
		return InstallFabricChaincodePackageResponse.class;
	}

}
