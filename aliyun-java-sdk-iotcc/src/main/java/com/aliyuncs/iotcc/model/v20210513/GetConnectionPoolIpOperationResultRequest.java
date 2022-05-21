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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetConnectionPoolIpOperationResultRequest extends RpcAcsRequest<GetConnectionPoolIpOperationResultResponse> {
	   

	private String queryRequestId;

	private String connectionPoolId;

	private String ioTCloudConnectorId;
	public GetConnectionPoolIpOperationResultRequest() {
		super("IoTCC", "2021-05-13", "GetConnectionPoolIpOperationResult", "IoTCC");
		setMethod(MethodType.POST);
	}

	public String getQueryRequestId() {
		return this.queryRequestId;
	}

	public void setQueryRequestId(String queryRequestId) {
		this.queryRequestId = queryRequestId;
		if(queryRequestId != null){
			putQueryParameter("QueryRequestId", queryRequestId);
		}
	}

	public String getConnectionPoolId() {
		return this.connectionPoolId;
	}

	public void setConnectionPoolId(String connectionPoolId) {
		this.connectionPoolId = connectionPoolId;
		if(connectionPoolId != null){
			putQueryParameter("ConnectionPoolId", connectionPoolId);
		}
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	@Override
	public Class<GetConnectionPoolIpOperationResultResponse> getResponseClass() {
		return GetConnectionPoolIpOperationResultResponse.class;
	}

}
