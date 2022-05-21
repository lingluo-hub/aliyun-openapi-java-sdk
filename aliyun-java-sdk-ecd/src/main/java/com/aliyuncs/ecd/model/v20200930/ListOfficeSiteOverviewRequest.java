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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListOfficeSiteOverviewRequest extends RpcAcsRequest<ListOfficeSiteOverviewResponse> {
	   

	private List<String> officeSiteIds;

	private Integer queryRange;

	private Boolean forceRefresh;

	private String nextToken;

	private Integer maxResults;
	public ListOfficeSiteOverviewRequest() {
		super("ecd", "2020-09-30", "ListOfficeSiteOverview");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getOfficeSiteIds() {
		return this.officeSiteIds;
	}

	public void setOfficeSiteIds(List<String> officeSiteIds) {
		this.officeSiteIds = officeSiteIds;	
		if (officeSiteIds != null) {
			for (int i = 0; i < officeSiteIds.size(); i++) {
				putQueryParameter("OfficeSiteId." + (i + 1) , officeSiteIds.get(i));
			}
		}	
	}

	public Integer getQueryRange() {
		return this.queryRange;
	}

	public void setQueryRange(Integer queryRange) {
		this.queryRange = queryRange;
		if(queryRange != null){
			putQueryParameter("QueryRange", queryRange.toString());
		}
	}

	public Boolean getForceRefresh() {
		return this.forceRefresh;
	}

	public void setForceRefresh(Boolean forceRefresh) {
		this.forceRefresh = forceRefresh;
		if(forceRefresh != null){
			putQueryParameter("ForceRefresh", forceRefresh.toString());
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
	public Class<ListOfficeSiteOverviewResponse> getResponseClass() {
		return ListOfficeSiteOverviewResponse.class;
	}

}
