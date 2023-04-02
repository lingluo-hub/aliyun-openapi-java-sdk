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
public class ListArtifactVersionsRequest extends RpcAcsRequest<ListArtifactVersionsResponse> {
	   

	private String nextToken;

	private String maxResult;

	private String artifactId;
	public ListArtifactVersionsRequest() {
		super("ComputeNestSupplier", "2021-05-21", "ListArtifactVersions");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(String maxResult) {
		this.maxResult = maxResult;
		if(maxResult != null){
			putQueryParameter("MaxResult", maxResult);
		}
	}

	public String getArtifactId() {
		return this.artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
		if(artifactId != null){
			putQueryParameter("ArtifactId", artifactId);
		}
	}

	@Override
	public Class<ListArtifactVersionsResponse> getResponseClass() {
		return ListArtifactVersionsResponse.class;
	}

}
