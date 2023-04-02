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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateNamespaceVpcRequest extends RoaAcsRequest<UpdateNamespaceVpcResponse> {
	   

	private String namespaceId;

	private String vpcId;

	private String nameSpaceShortId;
	public UpdateNamespaceVpcRequest() {
		super("sae", "2019-05-06", "UpdateNamespaceVpc", "serverless");
		setUriPattern("/pop/v1/sam/namespace/updateNamespaceVpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getNameSpaceShortId() {
		return this.nameSpaceShortId;
	}

	public void setNameSpaceShortId(String nameSpaceShortId) {
		this.nameSpaceShortId = nameSpaceShortId;
		if(nameSpaceShortId != null){
			putQueryParameter("NameSpaceShortId", nameSpaceShortId);
		}
	}

	@Override
	public Class<UpdateNamespaceVpcResponse> getResponseClass() {
		return UpdateNamespaceVpcResponse.class;
	}

}
