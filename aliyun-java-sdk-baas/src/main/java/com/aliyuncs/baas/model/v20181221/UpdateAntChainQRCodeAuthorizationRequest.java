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
public class UpdateAntChainQRCodeAuthorizationRequest extends RpcAcsRequest<UpdateAntChainQRCodeAuthorizationResponse> {
	   

	private String authorizationType;

	private String antChainId;

	private String qRCodeType;
	public UpdateAntChainQRCodeAuthorizationRequest() {
		super("Baas", "2018-12-21", "UpdateAntChainQRCodeAuthorization", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthorizationType() {
		return this.authorizationType;
	}

	public void setAuthorizationType(String authorizationType) {
		this.authorizationType = authorizationType;
		if(authorizationType != null){
			putBodyParameter("AuthorizationType", authorizationType);
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	public String getQRCodeType() {
		return this.qRCodeType;
	}

	public void setQRCodeType(String qRCodeType) {
		this.qRCodeType = qRCodeType;
		if(qRCodeType != null){
			putBodyParameter("QRCodeType", qRCodeType);
		}
	}

	@Override
	public Class<UpdateAntChainQRCodeAuthorizationResponse> getResponseClass() {
		return UpdateAntChainQRCodeAuthorizationResponse.class;
	}

}
