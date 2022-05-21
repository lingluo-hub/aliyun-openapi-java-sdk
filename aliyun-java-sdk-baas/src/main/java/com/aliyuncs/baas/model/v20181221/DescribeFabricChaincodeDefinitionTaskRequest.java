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
public class DescribeFabricChaincodeDefinitionTaskRequest extends RpcAcsRequest<DescribeFabricChaincodeDefinitionTaskResponse> {
	   

	private String organizationId;

	private String chaincodeId;
	public DescribeFabricChaincodeDefinitionTaskRequest() {
		super("Baas", "2018-12-21", "DescribeFabricChaincodeDefinitionTask", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getChaincodeId() {
		return this.chaincodeId;
	}

	public void setChaincodeId(String chaincodeId) {
		this.chaincodeId = chaincodeId;
		if(chaincodeId != null){
			putBodyParameter("ChaincodeId", chaincodeId);
		}
	}

	@Override
	public Class<DescribeFabricChaincodeDefinitionTaskResponse> getResponseClass() {
		return DescribeFabricChaincodeDefinitionTaskResponse.class;
	}

}
