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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterRouteTablesRequest extends RpcAcsRequest<ListTransitRouterRouteTablesResponse> {
	   

	private Long resourceOwnerId;

	private List<String> transitRouterRouteTableNamess;

	private RouteTableOptions routeTableOptions;

	private String transitRouterRouteTableType;

	private String transitRouterRouteTableStatus;

	private List<String> transitRouterRouteTableIdss;

	private String nextToken;

	private List<Tag> tags;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterId;

	private Integer maxResults;
	public ListTransitRouterRouteTablesRequest() {
		super("Cbn", "2017-09-12", "ListTransitRouterRouteTables");
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

	public List<String> getTransitRouterRouteTableNamess() {
		return this.transitRouterRouteTableNamess;
	}

	public void setTransitRouterRouteTableNamess(List<String> transitRouterRouteTableNamess) {
		this.transitRouterRouteTableNamess = transitRouterRouteTableNamess;	
		if (transitRouterRouteTableNamess != null) {
			for (int i = 0; i < transitRouterRouteTableNamess.size(); i++) {
				putQueryParameter("TransitRouterRouteTableNames." + (i + 1) , transitRouterRouteTableNamess.get(i));
			}
		}	
	}

	public RouteTableOptions getRouteTableOptions() {
		return this.routeTableOptions;
	}

	public void setRouteTableOptions(RouteTableOptions routeTableOptions) {
		this.routeTableOptions = routeTableOptions;	
		if (routeTableOptions != null) {
			
				putQueryParameter("RouteTableOptions.MultiRegionECMP" , routeTableOptions.getMultiRegionECMP());
		}	
	}

	public String getTransitRouterRouteTableType() {
		return this.transitRouterRouteTableType;
	}

	public void setTransitRouterRouteTableType(String transitRouterRouteTableType) {
		this.transitRouterRouteTableType = transitRouterRouteTableType;
		if(transitRouterRouteTableType != null){
			putQueryParameter("TransitRouterRouteTableType", transitRouterRouteTableType);
		}
	}

	public String getTransitRouterRouteTableStatus() {
		return this.transitRouterRouteTableStatus;
	}

	public void setTransitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
		this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
		if(transitRouterRouteTableStatus != null){
			putQueryParameter("TransitRouterRouteTableStatus", transitRouterRouteTableStatus);
		}
	}

	public List<String> getTransitRouterRouteTableIdss() {
		return this.transitRouterRouteTableIdss;
	}

	public void setTransitRouterRouteTableIdss(List<String> transitRouterRouteTableIdss) {
		this.transitRouterRouteTableIdss = transitRouterRouteTableIdss;	
		if (transitRouterRouteTableIdss != null) {
			for (int i = 0; i < transitRouterRouteTableIdss.size(); i++) {
				putQueryParameter("TransitRouterRouteTableIds." + (i + 1) , transitRouterRouteTableIdss.get(i));
			}
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public static class RouteTableOptions {

		private String multiRegionECMP;

		public String getMultiRegionECMP() {
			return this.multiRegionECMP;
		}

		public void setMultiRegionECMP(String multiRegionECMP) {
			this.multiRegionECMP = multiRegionECMP;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListTransitRouterRouteTablesResponse> getResponseClass() {
		return ListTransitRouterRouteTablesResponse.class;
	}

}
