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

package com.aliyuncs.eais.model.v20190624;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eais.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteEaiRequest extends RpcAcsRequest<DeleteEaiResponse> {
	   

	private String elasticAcceleratedInstanceId;

	private Boolean force;
	public DeleteEaiRequest() {
		super("eais", "2019-06-24", "DeleteEai", "eais");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getElasticAcceleratedInstanceId() {
		return this.elasticAcceleratedInstanceId;
	}

	public void setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
		this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
		if(elasticAcceleratedInstanceId != null){
			putQueryParameter("ElasticAcceleratedInstanceId", elasticAcceleratedInstanceId);
		}
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	@Override
	public Class<DeleteEaiResponse> getResponseClass() {
		return DeleteEaiResponse.class;
	}

}
