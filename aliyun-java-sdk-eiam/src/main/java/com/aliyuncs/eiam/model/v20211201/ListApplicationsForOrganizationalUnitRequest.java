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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationsForOrganizationalUnitRequest extends RpcAcsRequest<ListApplicationsForOrganizationalUnitResponse> {
	   

	private Long pageNumber;

	private Long pageSize;

	private List<String> applicationIds;

	private String instanceId;

	private String organizationalUnitId;
	public ListApplicationsForOrganizationalUnitRequest() {
		super("Eiam", "2021-12-01", "ListApplicationsForOrganizationalUnit", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getApplicationIds() {
		return this.applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;	
		if (applicationIds != null) {
			for (int depth1 = 0; depth1 < applicationIds.size(); depth1++) {
				putQueryParameter("ApplicationIds." + (depth1 + 1) , applicationIds.get(depth1));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getOrganizationalUnitId() {
		return this.organizationalUnitId;
	}

	public void setOrganizationalUnitId(String organizationalUnitId) {
		this.organizationalUnitId = organizationalUnitId;
		if(organizationalUnitId != null){
			putQueryParameter("OrganizationalUnitId", organizationalUnitId);
		}
	}

	@Override
	public Class<ListApplicationsForOrganizationalUnitResponse> getResponseClass() {
		return ListApplicationsForOrganizationalUnitResponse.class;
	}

}
