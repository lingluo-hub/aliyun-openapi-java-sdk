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

package com.aliyuncs.httpdns.model.v20160201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetResolveCountSummaryRequest extends RpcAcsRequest<GetResolveCountSummaryResponse> {
	   

	private Integer timeSpan;

	private String granularity;
	public GetResolveCountSummaryRequest() {
		super("Httpdns", "2016-02-01", "GetResolveCountSummary");
		setMethod(MethodType.POST);
	}

	public Integer getTimeSpan() {
		return this.timeSpan;
	}

	public void setTimeSpan(Integer timeSpan) {
		this.timeSpan = timeSpan;
		if(timeSpan != null){
			putQueryParameter("TimeSpan", timeSpan.toString());
		}
	}

	public String getGranularity() {
		return this.granularity;
	}

	public void setGranularity(String granularity) {
		this.granularity = granularity;
		if(granularity != null){
			putQueryParameter("Granularity", granularity);
		}
	}

	@Override
	public Class<GetResolveCountSummaryResponse> getResponseClass() {
		return GetResolveCountSummaryResponse.class;
	}

}
