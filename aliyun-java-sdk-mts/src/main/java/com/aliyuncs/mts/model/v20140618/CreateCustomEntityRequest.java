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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomEntityRequest extends RpcAcsRequest<CreateCustomEntityResponse> {
	   

	private Long resourceOwnerId;

	private String algorithm;

	private String customGroupId;

	private String customEntityName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String customEntityInfo;
	public CreateCustomEntityRequest() {
		super("Mts", "2014-06-18", "CreateCustomEntity", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm);
		}
	}

	public String getCustomGroupId() {
		return this.customGroupId;
	}

	public void setCustomGroupId(String customGroupId) {
		this.customGroupId = customGroupId;
		if(customGroupId != null){
			putQueryParameter("CustomGroupId", customGroupId);
		}
	}

	public String getCustomEntityName() {
		return this.customEntityName;
	}

	public void setCustomEntityName(String customEntityName) {
		this.customEntityName = customEntityName;
		if(customEntityName != null){
			putQueryParameter("CustomEntityName", customEntityName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getCustomEntityInfo() {
		return this.customEntityInfo;
	}

	public void setCustomEntityInfo(String customEntityInfo) {
		this.customEntityInfo = customEntityInfo;
		if(customEntityInfo != null){
			putQueryParameter("CustomEntityInfo", customEntityInfo);
		}
	}

	@Override
	public Class<CreateCustomEntityResponse> getResponseClass() {
		return CreateCustomEntityResponse.class;
	}

}
