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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaskFlowCooperatorsRequest extends RpcAcsRequest<UpdateTaskFlowCooperatorsResponse> {
	   

	private Long dagId;

	private Long tid;

	@SerializedName("cooperatorIds")
	private List<String> cooperatorIds;
	public UpdateTaskFlowCooperatorsRequest() {
		super("dms-enterprise", "2018-11-01", "UpdateTaskFlowCooperators", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public List<String> getCooperatorIds() {
		return this.cooperatorIds;
	}

	public void setCooperatorIds(List<String> cooperatorIds) {
		this.cooperatorIds = cooperatorIds;	
		if (cooperatorIds != null) {
			putQueryParameter("CooperatorIds" , new Gson().toJson(cooperatorIds));
		}	
	}

	@Override
	public Class<UpdateTaskFlowCooperatorsResponse> getResponseClass() {
		return UpdateTaskFlowCooperatorsResponse.class;
	}

}
