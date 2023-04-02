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
public class DescribeSignaturesRequest extends RpcAcsRequest<DescribeSignaturesResponse> {
	   

	private String signatureName;

	private String signatureId;

	private Integer pageNumber;

	private String securityToken;

	private Integer pageSize;
	public DescribeSignaturesRequest() {
		super("CloudAPI", "2016-07-14", "DescribeSignatures", "apigateway");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescribeSignaturesResponse> getResponseClass() {
		return DescribeSignaturesResponse.class;
	}

}
