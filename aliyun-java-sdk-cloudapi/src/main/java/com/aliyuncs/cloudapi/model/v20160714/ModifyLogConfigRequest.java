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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyLogConfigRequest extends RpcAcsRequest<ModifyLogConfigResponse> {
	   

	private String slsLogStore;

	private String slsProject;

	private String logType;

	private String securityToken;
	public ModifyLogConfigRequest() {
		super("CloudAPI", "2016-07-14", "ModifyLogConfig", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSlsLogStore() {
		return this.slsLogStore;
	}

	public void setSlsLogStore(String slsLogStore) {
		this.slsLogStore = slsLogStore;
		if(slsLogStore != null){
			putQueryParameter("SlsLogStore", slsLogStore);
		}
	}

	public String getSlsProject() {
		return this.slsProject;
	}

	public void setSlsProject(String slsProject) {
		this.slsProject = slsProject;
		if(slsProject != null){
			putQueryParameter("SlsProject", slsProject);
		}
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
		if(logType != null){
			putQueryParameter("LogType", logType);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	@Override
	public Class<ModifyLogConfigResponse> getResponseClass() {
		return ModifyLogConfigResponse.class;
	}

}
