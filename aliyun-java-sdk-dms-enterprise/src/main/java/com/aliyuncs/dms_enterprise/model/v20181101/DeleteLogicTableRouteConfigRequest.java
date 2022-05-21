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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteLogicTableRouteConfigRequest extends RpcAcsRequest<DeleteLogicTableRouteConfigResponse> {
	   

	private String routeKey;

	private Long tid;

	private Long tableId;
	public DeleteLogicTableRouteConfigRequest() {
		super("dms-enterprise", "2018-11-01", "DeleteLogicTableRouteConfig", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRouteKey() {
		return this.routeKey;
	}

	public void setRouteKey(String routeKey) {
		this.routeKey = routeKey;
		if(routeKey != null){
			putQueryParameter("RouteKey", routeKey);
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

	public Long getTableId() {
		return this.tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
		if(tableId != null){
			putQueryParameter("TableId", tableId.toString());
		}
	}

	@Override
	public Class<DeleteLogicTableRouteConfigResponse> getResponseClass() {
		return DeleteLogicTableRouteConfigResponse.class;
	}

}
