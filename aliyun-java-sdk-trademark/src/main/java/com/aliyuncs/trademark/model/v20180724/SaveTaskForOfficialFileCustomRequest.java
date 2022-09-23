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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveTaskForOfficialFileCustomRequest extends RpcAcsRequest<SaveTaskForOfficialFileCustomResponse> {
	   

	private Long startAcceptTime;

	private Long endAcceptTime;
	public SaveTaskForOfficialFileCustomRequest() {
		super("Trademark", "2018-07-24", "SaveTaskForOfficialFileCustom");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartAcceptTime() {
		return this.startAcceptTime;
	}

	public void setStartAcceptTime(Long startAcceptTime) {
		this.startAcceptTime = startAcceptTime;
		if(startAcceptTime != null){
			putQueryParameter("StartAcceptTime", startAcceptTime.toString());
		}
	}

	public Long getEndAcceptTime() {
		return this.endAcceptTime;
	}

	public void setEndAcceptTime(Long endAcceptTime) {
		this.endAcceptTime = endAcceptTime;
		if(endAcceptTime != null){
			putQueryParameter("EndAcceptTime", endAcceptTime.toString());
		}
	}

	@Override
	public Class<SaveTaskForOfficialFileCustomResponse> getResponseClass() {
		return SaveTaskForOfficialFileCustomResponse.class;
	}

}
