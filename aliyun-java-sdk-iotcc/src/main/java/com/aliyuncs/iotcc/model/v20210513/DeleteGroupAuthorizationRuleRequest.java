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
public class DeleteGroupAuthorizationRuleRequest extends RpcAcsRequest<DeleteGroupAuthorizationRuleResponse> {
	   

	private String ioTCloudConnectorGroupId;

	private Boolean dryRun;

	private String clientToken;

	private String authorizationRuleId;
	public DeleteGroupAuthorizationRuleRequest() {
		super("IoTCC", "2021-05-13", "DeleteGroupAuthorizationRule", "IoTCC");
		setMethod(MethodType.POST);
	}

	public String getIoTCloudConnectorGroupId() {
		return this.ioTCloudConnectorGroupId;
	}

	public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
		this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		if(ioTCloudConnectorGroupId != null){
			putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getAuthorizationRuleId() {
		return this.authorizationRuleId;
	}

	public void setAuthorizationRuleId(String authorizationRuleId) {
		this.authorizationRuleId = authorizationRuleId;
		if(authorizationRuleId != null){
			putQueryParameter("AuthorizationRuleId", authorizationRuleId);
		}
	}

	@Override
	public Class<DeleteGroupAuthorizationRuleResponse> getResponseClass() {
		return DeleteGroupAuthorizationRuleResponse.class;
	}

}
