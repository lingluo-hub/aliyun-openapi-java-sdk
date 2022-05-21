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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportApplianceDataRequest extends RpcAcsRequest<ReportApplianceDataResponse> {
	   

	private String applianceId;

	private String applianceData;

	private String category;
	public ReportApplianceDataRequest() {
		super("hbr", "2017-09-08", "ReportApplianceData", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApplianceId() {
		return this.applianceId;
	}

	public void setApplianceId(String applianceId) {
		this.applianceId = applianceId;
		if(applianceId != null){
			putQueryParameter("ApplianceId", applianceId);
		}
	}

	public String getApplianceData() {
		return this.applianceData;
	}

	public void setApplianceData(String applianceData) {
		this.applianceData = applianceData;
		if(applianceData != null){
			putQueryParameter("ApplianceData", applianceData);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	@Override
	public Class<ReportApplianceDataResponse> getResponseClass() {
		return ReportApplianceDataResponse.class;
	}

}
