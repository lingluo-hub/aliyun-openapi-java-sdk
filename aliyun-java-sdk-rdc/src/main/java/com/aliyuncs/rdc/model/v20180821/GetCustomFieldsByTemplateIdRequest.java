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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rdc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCustomFieldsByTemplateIdRequest extends RpcAcsRequest<GetCustomFieldsByTemplateIdResponse> {
	   

	private String corpIdentifier;

	private Integer aKProjectId;

	private Integer templateId;
	public GetCustomFieldsByTemplateIdRequest() {
		super("Rdc", "2018-08-21", "GetCustomFieldsByTemplateId");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCorpIdentifier() {
		return this.corpIdentifier;
	}

	public void setCorpIdentifier(String corpIdentifier) {
		this.corpIdentifier = corpIdentifier;
		if(corpIdentifier != null){
			putQueryParameter("CorpIdentifier", corpIdentifier);
		}
	}

	public Integer getAKProjectId() {
		return this.aKProjectId;
	}

	public void setAKProjectId(Integer aKProjectId) {
		this.aKProjectId = aKProjectId;
		if(aKProjectId != null){
			putBodyParameter("AKProjectId", aKProjectId.toString());
		}
	}

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	@Override
	public Class<GetCustomFieldsByTemplateIdResponse> getResponseClass() {
		return GetCustomFieldsByTemplateIdResponse.class;
	}

}
