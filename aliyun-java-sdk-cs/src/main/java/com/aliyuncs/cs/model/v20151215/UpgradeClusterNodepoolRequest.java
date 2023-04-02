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
public class UpgradeClusterNodepoolRequest extends RoaAcsRequest<UpgradeClusterNodepoolResponse> {
	   

	private String clusterId;

	private String body;

	private String nodepoolId;
	public UpgradeClusterNodepoolRequest() {
		super("CS", "2015-12-15", "UpgradeClusterNodepool");
		setUriPattern("/clusters/[ClusterId]/nodepools/[NodepoolId]/upgrade");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getNodepoolId() {
		return this.nodepoolId;
	}

	public void setNodepoolId(String nodepoolId) {
		this.nodepoolId = nodepoolId;
		if(nodepoolId != null){
			putPathParameter("NodepoolId", nodepoolId);
		}
	}

	@Override
	public Class<UpgradeClusterNodepoolResponse> getResponseClass() {
		return UpgradeClusterNodepoolResponse.class;
	}

}
