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
public class DescribePolicyInstancesRequest extends RoaAcsRequest<DescribePolicyInstancesResponse> {
	   

	private String cluster_id;

	private String instance_name;

	private String policy_name;
	public DescribePolicyInstancesRequest() {
		super("CS", "2015-12-15", "DescribePolicyInstances");
		setUriPattern("/clusters/[cluster_id]/policies");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putPathParameter("cluster_id", cluster_id);
		}
	}

	public String getInstance_name() {
		return this.instance_name;
	}

	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
		if(instance_name != null){
			putQueryParameter("instance_name", instance_name);
		}
	}

	public String getPolicy_name() {
		return this.policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
		if(policy_name != null){
			putQueryParameter("policy_name", policy_name);
		}
	}

	@Override
	public Class<DescribePolicyInstancesResponse> getResponseClass() {
		return DescribePolicyInstancesResponse.class;
	}

}
