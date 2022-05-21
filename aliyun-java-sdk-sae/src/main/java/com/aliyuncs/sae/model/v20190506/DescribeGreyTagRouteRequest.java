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
public class DescribeGreyTagRouteRequest extends RoaAcsRequest<DescribeGreyTagRouteResponse> {
	   

	private Long greyTagRouteId;
	public DescribeGreyTagRouteRequest() {
		super("sae", "2019-05-06", "DescribeGreyTagRoute", "serverless");
		setUriPattern("/pop/v1/sam/tagroute/greyTagRoute");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getGreyTagRouteId() {
		return this.greyTagRouteId;
	}

	public void setGreyTagRouteId(Long greyTagRouteId) {
		this.greyTagRouteId = greyTagRouteId;
		if(greyTagRouteId != null){
			putQueryParameter("GreyTagRouteId", greyTagRouteId.toString());
		}
	}

	@Override
	public Class<DescribeGreyTagRouteResponse> getResponseClass() {
		return DescribeGreyTagRouteResponse.class;
	}

}
