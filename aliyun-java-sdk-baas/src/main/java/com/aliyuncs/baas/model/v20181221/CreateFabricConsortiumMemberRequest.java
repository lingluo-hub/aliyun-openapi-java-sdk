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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.baas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFabricConsortiumMemberRequest extends RpcAcsRequest<CreateFabricConsortiumMemberResponse> {
	   

	private String code;

	private List<Organization> organizations;

	private String consortiumId;
	public CreateFabricConsortiumMemberRequest() {
		super("Baas", "2018-12-21", "CreateFabricConsortiumMember", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	public List<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;	
		if (organizations != null) {
			for (int depth1 = 0; depth1 < organizations.size(); depth1++) {
				putQueryParameter("Organization." + (depth1 + 1) + ".OrganizationId" , organizations.get(depth1).getOrganizationId());
			}
		}	
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putQueryParameter("ConsortiumId", consortiumId);
		}
	}

	public static class Organization {

		private String organizationId;

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}
	}

	@Override
	public Class<CreateFabricConsortiumMemberResponse> getResponseClass() {
		return CreateFabricConsortiumMemberResponse.class;
	}

}
