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
public class SetDomainWebSocketStatusRequest extends RpcAcsRequest<SetDomainWebSocketStatusResponse> {
	   

	private String wSSEnable;

	private String groupId;

	private String domainName;

	private String securityToken;

	private String actionValue;
	public SetDomainWebSocketStatusRequest() {
		super("CloudAPI", "2016-07-14", "SetDomainWebSocketStatus", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWSSEnable() {
		return this.wSSEnable;
	}

	public void setWSSEnable(String wSSEnable) {
		this.wSSEnable = wSSEnable;
		if(wSSEnable != null){
			putQueryParameter("WSSEnable", wSSEnable);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getActionValue() {
		return this.actionValue;
	}

	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
		if(actionValue != null){
			putQueryParameter("ActionValue", actionValue);
		}
	}

	@Override
	public Class<SetDomainWebSocketStatusResponse> getResponseClass() {
		return SetDomainWebSocketStatusResponse.class;
	}

}
