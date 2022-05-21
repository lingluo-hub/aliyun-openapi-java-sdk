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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnUserDomainsByFuncRequest extends RpcAcsRequest<DescribeDcdnUserDomainsByFuncResponse> {
	   

	private Integer pageNumber;

	private String resourceGroupId;

	private Integer pageSize;

	private String funcFilter;

	private String domainName;

	private Long ownerId;

	private Integer funcId;
	public DescribeDcdnUserDomainsByFuncRequest() {
		super("dcdn", "2018-01-15", "DescribeDcdnUserDomainsByFunc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getFuncFilter() {
		return this.funcFilter;
	}

	public void setFuncFilter(String funcFilter) {
		this.funcFilter = funcFilter;
		if(funcFilter != null){
			putQueryParameter("FuncFilter", funcFilter);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getFuncId() {
		return this.funcId;
	}

	public void setFuncId(Integer funcId) {
		this.funcId = funcId;
		if(funcId != null){
			putQueryParameter("FuncId", funcId.toString());
		}
	}

	@Override
	public Class<DescribeDcdnUserDomainsByFuncResponse> getResponseClass() {
		return DescribeDcdnUserDomainsByFuncResponse.class;
	}

}
