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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitGatewayLocalConfigDeletingTaskRequest extends RpcAcsRequest<SubmitGatewayLocalConfigDeletingTaskResponse> {
	   

	private String gwEui;

	private String d2dAddr;
	public SubmitGatewayLocalConfigDeletingTaskRequest() {
		super("LinkWAN", "2019-03-01", "SubmitGatewayLocalConfigDeletingTask", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGwEui() {
		return this.gwEui;
	}

	public void setGwEui(String gwEui) {
		this.gwEui = gwEui;
		if(gwEui != null){
			putQueryParameter("GwEui", gwEui);
		}
	}

	public String getD2dAddr() {
		return this.d2dAddr;
	}

	public void setD2dAddr(String d2dAddr) {
		this.d2dAddr = d2dAddr;
		if(d2dAddr != null){
			putQueryParameter("D2dAddr", d2dAddr);
		}
	}

	@Override
	public Class<SubmitGatewayLocalConfigDeletingTaskResponse> getResponseClass() {
		return SubmitGatewayLocalConfigDeletingTaskResponse.class;
	}

}
