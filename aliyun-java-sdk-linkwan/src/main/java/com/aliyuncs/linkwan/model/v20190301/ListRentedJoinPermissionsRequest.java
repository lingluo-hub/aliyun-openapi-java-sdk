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
public class ListRentedJoinPermissionsRequest extends RpcAcsRequest<ListRentedJoinPermissionsResponse> {
	   

	private String type;

	private Boolean enabled;

	private String iotInstanceId;

	private String fuzzyJoinEui;

	private Long limit;

	private String fuzzyJoinPermissionName;

	private Long offset;

	private Boolean ascending;

	private Boolean boundNodeGroup;

	private String fuzzyOwnerAliyunId;

	private String sortingField;
	public ListRentedJoinPermissionsRequest() {
		super("LinkWAN", "2019-03-01", "ListRentedJoinPermissions", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getFuzzyJoinEui() {
		return this.fuzzyJoinEui;
	}

	public void setFuzzyJoinEui(String fuzzyJoinEui) {
		this.fuzzyJoinEui = fuzzyJoinEui;
		if(fuzzyJoinEui != null){
			putQueryParameter("FuzzyJoinEui", fuzzyJoinEui);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getFuzzyJoinPermissionName() {
		return this.fuzzyJoinPermissionName;
	}

	public void setFuzzyJoinPermissionName(String fuzzyJoinPermissionName) {
		this.fuzzyJoinPermissionName = fuzzyJoinPermissionName;
		if(fuzzyJoinPermissionName != null){
			putQueryParameter("FuzzyJoinPermissionName", fuzzyJoinPermissionName);
		}
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public Boolean getAscending() {
		return this.ascending;
	}

	public void setAscending(Boolean ascending) {
		this.ascending = ascending;
		if(ascending != null){
			putQueryParameter("Ascending", ascending.toString());
		}
	}

	public Boolean getBoundNodeGroup() {
		return this.boundNodeGroup;
	}

	public void setBoundNodeGroup(Boolean boundNodeGroup) {
		this.boundNodeGroup = boundNodeGroup;
		if(boundNodeGroup != null){
			putQueryParameter("BoundNodeGroup", boundNodeGroup.toString());
		}
	}

	public String getFuzzyOwnerAliyunId() {
		return this.fuzzyOwnerAliyunId;
	}

	public void setFuzzyOwnerAliyunId(String fuzzyOwnerAliyunId) {
		this.fuzzyOwnerAliyunId = fuzzyOwnerAliyunId;
		if(fuzzyOwnerAliyunId != null){
			putQueryParameter("FuzzyOwnerAliyunId", fuzzyOwnerAliyunId);
		}
	}

	public String getSortingField() {
		return this.sortingField;
	}

	public void setSortingField(String sortingField) {
		this.sortingField = sortingField;
		if(sortingField != null){
			putQueryParameter("SortingField", sortingField);
		}
	}

	@Override
	public Class<ListRentedJoinPermissionsResponse> getResponseClass() {
		return ListRentedJoinPermissionsResponse.class;
	}

}
