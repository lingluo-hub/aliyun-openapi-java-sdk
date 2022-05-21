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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataDispatchEnablingStateRequest extends RpcAcsRequest<UpdateDataDispatchEnablingStateResponse> {
	   

	private Boolean dataDispatchEnabled;

	private String nodeGroupId;
	public UpdateDataDispatchEnablingStateRequest() {
		super("LinkWAN", "2019-03-01", "UpdateDataDispatchEnablingState", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDataDispatchEnabled() {
		return this.dataDispatchEnabled;
	}

	public void setDataDispatchEnabled(Boolean dataDispatchEnabled) {
		this.dataDispatchEnabled = dataDispatchEnabled;
		if(dataDispatchEnabled != null){
			putQueryParameter("DataDispatchEnabled", dataDispatchEnabled.toString());
		}
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putQueryParameter("NodeGroupId", nodeGroupId);
		}
	}

	@Override
	public Class<UpdateDataDispatchEnablingStateResponse> getResponseClass() {
		return UpdateDataDispatchEnablingStateResponse.class;
	}

}
