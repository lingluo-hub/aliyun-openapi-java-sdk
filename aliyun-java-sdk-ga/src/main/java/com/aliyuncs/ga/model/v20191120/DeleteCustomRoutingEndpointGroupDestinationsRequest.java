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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteCustomRoutingEndpointGroupDestinationsRequest extends RpcAcsRequest<DeleteCustomRoutingEndpointGroupDestinationsResponse> {
	   

	private List<String> destinationIdss;

	private Boolean dryRun;

	private String clientToken;

	private String endpointGroupId;
	public DeleteCustomRoutingEndpointGroupDestinationsRequest() {
		super("Ga", "2019-11-20", "DeleteCustomRoutingEndpointGroupDestinations", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDestinationIdss() {
		return this.destinationIdss;
	}

	public void setDestinationIdss(List<String> destinationIdss) {
		this.destinationIdss = destinationIdss;	
		if (destinationIdss != null) {
			for (int i = 0; i < destinationIdss.size(); i++) {
				putQueryParameter("DestinationIds." + (i + 1) , destinationIdss.get(i));
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
		if(endpointGroupId != null){
			putQueryParameter("EndpointGroupId", endpointGroupId);
		}
	}

	@Override
	public Class<DeleteCustomRoutingEndpointGroupDestinationsResponse> getResponseClass() {
		return DeleteCustomRoutingEndpointGroupDestinationsResponse.class;
	}

}
