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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTenantsRequest extends RpcAcsRequest<DeleteTenantsResponse> {
	   

	private String instanceId;

	private String tenantIds;
	public DeleteTenantsRequest() {
		super("OceanBasePro", "2019-09-01", "DeleteTenants");
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTenantIds() {
		return this.tenantIds;
	}

	public void setTenantIds(String tenantIds) {
		this.tenantIds = tenantIds;
		if(tenantIds != null){
			putBodyParameter("TenantIds", tenantIds);
		}
	}

	@Override
	public Class<DeleteTenantsResponse> getResponseClass() {
		return DeleteTenantsResponse.class;
	}

}
