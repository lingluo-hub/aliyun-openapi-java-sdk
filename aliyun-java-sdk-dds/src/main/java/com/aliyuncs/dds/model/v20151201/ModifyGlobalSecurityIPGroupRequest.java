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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyGlobalSecurityIPGroupRequest extends RpcAcsRequest<ModifyGlobalSecurityIPGroupResponse> {
	   

	private Long resourceOwnerId;

	private String gIpList;

	private String globalSecurityGroupId;

	private String securityToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String globalIgName;
	public ModifyGlobalSecurityIPGroupRequest() {
		super("Dds", "2015-12-01", "ModifyGlobalSecurityIPGroup", "dds");
		setMethod(MethodType.POST);
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

	public String getGIpList() {
		return this.gIpList;
	}

	public void setGIpList(String gIpList) {
		this.gIpList = gIpList;
		if(gIpList != null){
			putQueryParameter("GIpList", gIpList);
		}
	}

	public String getGlobalSecurityGroupId() {
		return this.globalSecurityGroupId;
	}

	public void setGlobalSecurityGroupId(String globalSecurityGroupId) {
		this.globalSecurityGroupId = globalSecurityGroupId;
		if(globalSecurityGroupId != null){
			putQueryParameter("GlobalSecurityGroupId", globalSecurityGroupId);
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

	public String getGlobalIgName() {
		return this.globalIgName;
	}

	public void setGlobalIgName(String globalIgName) {
		this.globalIgName = globalIgName;
		if(globalIgName != null){
			putQueryParameter("GlobalIgName", globalIgName);
		}
	}

	@Override
	public Class<ModifyGlobalSecurityIPGroupResponse> getResponseClass() {
		return ModifyGlobalSecurityIPGroupResponse.class;
	}

}
