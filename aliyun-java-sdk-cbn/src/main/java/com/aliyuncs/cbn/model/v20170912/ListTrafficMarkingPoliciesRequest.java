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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTrafficMarkingPoliciesRequest extends RpcAcsRequest<ListTrafficMarkingPoliciesResponse> {
	   

	private Long resourceOwnerId;

	private String trafficMarkingPolicyDescription;

	private String trafficMarkingPolicyId;

	private String nextToken;

	private String trafficMarkingPolicyName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterId;

	private Integer maxResults;
	public ListTrafficMarkingPoliciesRequest() {
		super("Cbn", "2017-09-12", "ListTrafficMarkingPolicies", "cbn");
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

	public String getTrafficMarkingPolicyDescription() {
		return this.trafficMarkingPolicyDescription;
	}

	public void setTrafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
		this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
		if(trafficMarkingPolicyDescription != null){
			putQueryParameter("TrafficMarkingPolicyDescription", trafficMarkingPolicyDescription);
		}
	}

	public String getTrafficMarkingPolicyId() {
		return this.trafficMarkingPolicyId;
	}

	public void setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
		this.trafficMarkingPolicyId = trafficMarkingPolicyId;
		if(trafficMarkingPolicyId != null){
			putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getTrafficMarkingPolicyName() {
		return this.trafficMarkingPolicyName;
	}

	public void setTrafficMarkingPolicyName(String trafficMarkingPolicyName) {
		this.trafficMarkingPolicyName = trafficMarkingPolicyName;
		if(trafficMarkingPolicyName != null){
			putQueryParameter("TrafficMarkingPolicyName", trafficMarkingPolicyName);
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

	public String getTransitRouterId() {
		return this.transitRouterId;
	}

	public void setTransitRouterId(String transitRouterId) {
		this.transitRouterId = transitRouterId;
		if(transitRouterId != null){
			putQueryParameter("TransitRouterId", transitRouterId);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListTrafficMarkingPoliciesResponse> getResponseClass() {
		return ListTrafficMarkingPoliciesResponse.class;
	}

}
