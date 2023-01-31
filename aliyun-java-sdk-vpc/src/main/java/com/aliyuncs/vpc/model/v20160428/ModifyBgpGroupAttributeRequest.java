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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBgpGroupAttributeRequest extends RpcAcsRequest<ModifyBgpGroupAttributeResponse> {
	   

	private String authKey;

	private Long resourceOwnerId;

	private String clientToken;

	private String bgpGroupId;

	private String description;

	private Long peerAsn;

	private Boolean isFakeAsn;

	private Boolean clearAuthKey;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer routeQuota;

	private Long ownerId;

	private String name;

	private Long localAsn;
	public ModifyBgpGroupAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyBgpGroupAttribute", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBgpGroupId() {
		return this.bgpGroupId;
	}

	public void setBgpGroupId(String bgpGroupId) {
		this.bgpGroupId = bgpGroupId;
		if(bgpGroupId != null){
			putQueryParameter("BgpGroupId", bgpGroupId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getPeerAsn() {
		return this.peerAsn;
	}

	public void setPeerAsn(Long peerAsn) {
		this.peerAsn = peerAsn;
		if(peerAsn != null){
			putQueryParameter("PeerAsn", peerAsn.toString());
		}
	}

	public Boolean getIsFakeAsn() {
		return this.isFakeAsn;
	}

	public void setIsFakeAsn(Boolean isFakeAsn) {
		this.isFakeAsn = isFakeAsn;
		if(isFakeAsn != null){
			putQueryParameter("IsFakeAsn", isFakeAsn.toString());
		}
	}

	public Boolean getClearAuthKey() {
		return this.clearAuthKey;
	}

	public void setClearAuthKey(Boolean clearAuthKey) {
		this.clearAuthKey = clearAuthKey;
		if(clearAuthKey != null){
			putQueryParameter("ClearAuthKey", clearAuthKey.toString());
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

	public Integer getRouteQuota() {
		return this.routeQuota;
	}

	public void setRouteQuota(Integer routeQuota) {
		this.routeQuota = routeQuota;
		if(routeQuota != null){
			putQueryParameter("RouteQuota", routeQuota.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getLocalAsn() {
		return this.localAsn;
	}

	public void setLocalAsn(Long localAsn) {
		this.localAsn = localAsn;
		if(localAsn != null){
			putQueryParameter("LocalAsn", localAsn.toString());
		}
	}

	@Override
	public Class<ModifyBgpGroupAttributeResponse> getResponseClass() {
		return ModifyBgpGroupAttributeResponse.class;
	}

}
