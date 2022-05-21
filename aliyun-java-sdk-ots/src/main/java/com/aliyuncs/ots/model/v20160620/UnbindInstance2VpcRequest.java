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

package com.aliyuncs.ots.model.v20160620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnbindInstance2VpcRequest extends RpcAcsRequest<UnbindInstance2VpcResponse> {
	   

	private Long resourceOwnerId;

	private String regionNo;

	private String instanceVpcName;

	private String instanceName;
	public UnbindInstance2VpcRequest() {
		super("Ots", "2016-06-20", "UnbindInstance2Vpc");
		setMethod(MethodType.POST);
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

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getInstanceVpcName() {
		return this.instanceVpcName;
	}

	public void setInstanceVpcName(String instanceVpcName) {
		this.instanceVpcName = instanceVpcName;
		if(instanceVpcName != null){
			putQueryParameter("InstanceVpcName", instanceVpcName);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	@Override
	public Class<UnbindInstance2VpcResponse> getResponseClass() {
		return UnbindInstance2VpcResponse.class;
	}

}
