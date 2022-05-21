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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeIngressRequest extends RoaAcsRequest<DescribeIngressResponse> {
	   

	private Long ingressId;
	public DescribeIngressRequest() {
		super("sae", "2019-05-06", "DescribeIngress", "serverless");
		setUriPattern("/pop/v1/sam/ingress/Ingress");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getIngressId() {
		return this.ingressId;
	}

	public void setIngressId(Long ingressId) {
		this.ingressId = ingressId;
		if(ingressId != null){
			putQueryParameter("IngressId", ingressId.toString());
		}
	}

	@Override
	public Class<DescribeIngressResponse> getResponseClass() {
		return DescribeIngressResponse.class;
	}

}
