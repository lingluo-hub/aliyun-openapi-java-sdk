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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceRequest extends RpcAcsRequest<DescribeDeviceResponse> {
	   

	private Boolean includeDirectory;

	private Boolean includeStats;

	private String id;

	private Long ownerId;
	public DescribeDeviceRequest() {
		super("vs", "2018-12-12", "DescribeDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIncludeDirectory() {
		return this.includeDirectory;
	}

	public void setIncludeDirectory(Boolean includeDirectory) {
		this.includeDirectory = includeDirectory;
		if(includeDirectory != null){
			putQueryParameter("IncludeDirectory", includeDirectory.toString());
		}
	}

	public Boolean getIncludeStats() {
		return this.includeStats;
	}

	public void setIncludeStats(Boolean includeStats) {
		this.includeStats = includeStats;
		if(includeStats != null){
			putQueryParameter("IncludeStats", includeStats.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
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

	@Override
	public Class<DescribeDeviceResponse> getResponseClass() {
		return DescribeDeviceResponse.class;
	}

}
