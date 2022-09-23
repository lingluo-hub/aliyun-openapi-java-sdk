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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.viapi_regen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartTrainTaskRequest extends RpcAcsRequest<StartTrainTaskResponse> {
	   

	private Long relyOnTaskId;

	private Boolean forceStartFlag;

	private Long id;
	public StartTrainTaskRequest() {
		super("viapi-regen", "2021-11-19", "StartTrainTask", "selflearning");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRelyOnTaskId() {
		return this.relyOnTaskId;
	}

	public void setRelyOnTaskId(Long relyOnTaskId) {
		this.relyOnTaskId = relyOnTaskId;
		if(relyOnTaskId != null){
			putBodyParameter("RelyOnTaskId", relyOnTaskId.toString());
		}
	}

	public Boolean getForceStartFlag() {
		return this.forceStartFlag;
	}

	public void setForceStartFlag(Boolean forceStartFlag) {
		this.forceStartFlag = forceStartFlag;
		if(forceStartFlag != null){
			putBodyParameter("ForceStartFlag", forceStartFlag.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	@Override
	public Class<StartTrainTaskResponse> getResponseClass() {
		return StartTrainTaskResponse.class;
	}

}
