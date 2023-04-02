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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAutoSnapshotPoliciesRequest extends RpcAcsRequest<ListAutoSnapshotPoliciesResponse> {
	   

	private String filterValue;

	private Integer pageNumber;

	private String filterKey;

	private Integer pageSize;
	public ListAutoSnapshotPoliciesRequest() {
		super("DBFS", "2020-04-18", "ListAutoSnapshotPolicies", "dbfs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
		if(filterValue != null){
			putQueryParameter("FilterValue", filterValue);
		}
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

	public String getFilterKey() {
		return this.filterKey;
	}

	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
		if(filterKey != null){
			putQueryParameter("FilterKey", filterKey);
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

	@Override
	public Class<ListAutoSnapshotPoliciesResponse> getResponseClass() {
		return ListAutoSnapshotPoliciesResponse.class;
	}

}
