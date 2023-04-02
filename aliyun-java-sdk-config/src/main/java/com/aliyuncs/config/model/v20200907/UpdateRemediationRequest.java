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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRemediationRequest extends RpcAcsRequest<UpdateRemediationResponse> {
	   

	private String remediationType;

	private String clientToken;

	private String remediationId;

	private String sourceType;

	private String remediationTemplateId;

	private String params;

	private String invokeType;
	public UpdateRemediationRequest() {
		super("Config", "2020-09-07", "UpdateRemediation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemediationType() {
		return this.remediationType;
	}

	public void setRemediationType(String remediationType) {
		this.remediationType = remediationType;
		if(remediationType != null){
			putBodyParameter("RemediationType", remediationType);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getRemediationId() {
		return this.remediationId;
	}

	public void setRemediationId(String remediationId) {
		this.remediationId = remediationId;
		if(remediationId != null){
			putBodyParameter("RemediationId", remediationId);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putBodyParameter("SourceType", sourceType);
		}
	}

	public String getRemediationTemplateId() {
		return this.remediationTemplateId;
	}

	public void setRemediationTemplateId(String remediationTemplateId) {
		this.remediationTemplateId = remediationTemplateId;
		if(remediationTemplateId != null){
			putBodyParameter("RemediationTemplateId", remediationTemplateId);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putBodyParameter("Params", params);
		}
	}

	public String getInvokeType() {
		return this.invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
		if(invokeType != null){
			putBodyParameter("InvokeType", invokeType);
		}
	}

	@Override
	public Class<UpdateRemediationResponse> getResponseClass() {
		return UpdateRemediationResponse.class;
	}

}
