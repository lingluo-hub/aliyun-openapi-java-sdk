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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskReplicaPairsRequest extends RpcAcsRequest<DescribeDiskReplicaPairsResponse> {
	   

	private Integer pageNumber;

	private String nextToken;

	private Integer pageSize;

	private String pairIds;

	private String replicaGroupId;

	private String site;

	private Long maxResults;
	public DescribeDiskReplicaPairsRequest() {
		super("ebs", "2021-07-30", "DescribeDiskReplicaPairs", "ebs");
		setMethod(MethodType.POST);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPairIds() {
		return this.pairIds;
	}

	public void setPairIds(String pairIds) {
		this.pairIds = pairIds;
		if(pairIds != null){
			putQueryParameter("PairIds", pairIds);
		}
	}

	public String getReplicaGroupId() {
		return this.replicaGroupId;
	}

	public void setReplicaGroupId(String replicaGroupId) {
		this.replicaGroupId = replicaGroupId;
		if(replicaGroupId != null){
			putQueryParameter("ReplicaGroupId", replicaGroupId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeDiskReplicaPairsResponse> getResponseClass() {
		return DescribeDiskReplicaPairsResponse.class;
	}

}
