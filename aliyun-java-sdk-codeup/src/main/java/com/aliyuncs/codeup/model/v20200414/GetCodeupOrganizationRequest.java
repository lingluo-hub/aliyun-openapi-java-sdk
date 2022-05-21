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

package com.aliyuncs.codeup.model.v20200414;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCodeupOrganizationRequest extends RoaAcsRequest<GetCodeupOrganizationResponse> {
	   

	private String organizationId;

	private String subUserId;

	private String organizationIdentity;

	private String accessToken;
	public GetCodeupOrganizationRequest() {
		super("codeup", "2020-04-14", "GetCodeupOrganization");
		setUriPattern("/api/v4/organization/[OrganizationIdentity]");
		setMethod(MethodType.GET);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("OrganizationId", organizationId);
		}
	}

	public String getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putQueryParameter("SubUserId", subUserId);
		}
	}

	public String getOrganizationIdentity() {
		return this.organizationIdentity;
	}

	public void setOrganizationIdentity(String organizationIdentity) {
		this.organizationIdentity = organizationIdentity;
		if(organizationIdentity != null){
			putPathParameter("OrganizationIdentity", organizationIdentity);
		}
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		if(accessToken != null){
			putQueryParameter("AccessToken", accessToken);
		}
	}

	@Override
	public Class<GetCodeupOrganizationResponse> getResponseClass() {
		return GetCodeupOrganizationResponse.class;
	}

}
