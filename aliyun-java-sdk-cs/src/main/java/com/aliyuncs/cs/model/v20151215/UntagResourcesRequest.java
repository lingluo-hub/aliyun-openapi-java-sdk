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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UntagResourcesRequest extends RoaAcsRequest<UntagResourcesResponse> {
	   

	private Boolean all;

	private String region_id;

	private String resource_type;
	public UntagResourcesRequest() {
		super("CS", "2015-12-15", "UntagResources");
		setUriPattern("/tags");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putQueryParameter("all", all.toString());
		}
	}

	public String getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(String region_id) {
		this.region_id = region_id;
		if(region_id != null){
			putQueryParameter("region_id", region_id);
		}
	}

	public String getResource_type() {
		return this.resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
		if(resource_type != null){
			putQueryParameter("resource_type", resource_type);
		}
	}

	@Override
	public Class<UntagResourcesResponse> getResponseClass() {
		return UntagResourcesResponse.class;
	}

}
