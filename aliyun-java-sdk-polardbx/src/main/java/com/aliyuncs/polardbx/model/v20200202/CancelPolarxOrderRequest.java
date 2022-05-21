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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CancelPolarxOrderRequest extends RpcAcsRequest<CancelPolarxOrderResponse> {
	   

	private String dBInstanceName;

	private String scaleOutToken;
	public CancelPolarxOrderRequest() {
		super("polardbx", "2020-02-02", "CancelPolarxOrder", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getScaleOutToken() {
		return this.scaleOutToken;
	}

	public void setScaleOutToken(String scaleOutToken) {
		this.scaleOutToken = scaleOutToken;
		if(scaleOutToken != null){
			putQueryParameter("ScaleOutToken", scaleOutToken);
		}
	}

	@Override
	public Class<CancelPolarxOrderResponse> getResponseClass() {
		return CancelPolarxOrderResponse.class;
	}

}
