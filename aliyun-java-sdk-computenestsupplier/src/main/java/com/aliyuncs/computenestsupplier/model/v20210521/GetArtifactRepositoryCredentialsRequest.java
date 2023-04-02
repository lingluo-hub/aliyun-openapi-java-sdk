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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetArtifactRepositoryCredentialsRequest extends RpcAcsRequest<GetArtifactRepositoryCredentialsResponse> {
	   

	private String deployRegionId;

	private String artifactType;
	public GetArtifactRepositoryCredentialsRequest() {
		super("ComputeNestSupplier", "2021-05-21", "GetArtifactRepositoryCredentials");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeployRegionId() {
		return this.deployRegionId;
	}

	public void setDeployRegionId(String deployRegionId) {
		this.deployRegionId = deployRegionId;
		if(deployRegionId != null){
			putQueryParameter("DeployRegionId", deployRegionId);
		}
	}

	public String getArtifactType() {
		return this.artifactType;
	}

	public void setArtifactType(String artifactType) {
		this.artifactType = artifactType;
		if(artifactType != null){
			putQueryParameter("ArtifactType", artifactType);
		}
	}

	@Override
	public Class<GetArtifactRepositoryCredentialsResponse> getResponseClass() {
		return GetArtifactRepositoryCredentialsResponse.class;
	}

}
