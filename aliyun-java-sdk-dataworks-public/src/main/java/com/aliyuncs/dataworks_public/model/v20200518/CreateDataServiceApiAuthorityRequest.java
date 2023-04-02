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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDataServiceApiAuthorityRequest extends RpcAcsRequest<CreateDataServiceApiAuthorityResponse> {
	   

	private Long authorizedProjectId;

	private Long endTime;

	private Long tenantId;

	private Long projectId;

	private Long apiId;
	public CreateDataServiceApiAuthorityRequest() {
		super("dataworks-public", "2020-05-18", "CreateDataServiceApiAuthority");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getAuthorizedProjectId() {
		return this.authorizedProjectId;
	}

	public void setAuthorizedProjectId(Long authorizedProjectId) {
		this.authorizedProjectId = authorizedProjectId;
		if(authorizedProjectId != null){
			putBodyParameter("AuthorizedProjectId", authorizedProjectId.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public Long getApiId() {
		return this.apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putBodyParameter("ApiId", apiId.toString());
		}
	}

	@Override
	public Class<CreateDataServiceApiAuthorityResponse> getResponseClass() {
		return CreateDataServiceApiAuthorityResponse.class;
	}

}
