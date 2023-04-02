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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySignatureRequest extends RpcAcsRequest<ModifySignatureResponse> {
	   

	private String signatureName;

	private String signatureId;

	private String signatureSecret;

	private String securityToken;

	private String signatureKey;
	public ModifySignatureRequest() {
		super("CloudAPI", "2016-07-14", "ModifySignature", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSignatureName() {
		return this.signatureName;
	}

	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
		if(signatureName != null){
			putQueryParameter("SignatureName", signatureName);
		}
	}

	public String getSignatureId() {
		return this.signatureId;
	}

	public void setSignatureId(String signatureId) {
		this.signatureId = signatureId;
		if(signatureId != null){
			putQueryParameter("SignatureId", signatureId);
		}
	}

	public String getSignatureSecret() {
		return this.signatureSecret;
	}

	public void setSignatureSecret(String signatureSecret) {
		this.signatureSecret = signatureSecret;
		if(signatureSecret != null){
			putQueryParameter("SignatureSecret", signatureSecret);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getSignatureKey() {
		return this.signatureKey;
	}

	public void setSignatureKey(String signatureKey) {
		this.signatureKey = signatureKey;
		if(signatureKey != null){
			putQueryParameter("SignatureKey", signatureKey);
		}
	}

	@Override
	public Class<ModifySignatureResponse> getResponseClass() {
		return ModifySignatureResponse.class;
	}

}
