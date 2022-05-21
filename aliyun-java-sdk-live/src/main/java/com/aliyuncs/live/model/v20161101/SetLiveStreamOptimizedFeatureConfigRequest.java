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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLiveStreamOptimizedFeatureConfigRequest extends RpcAcsRequest<SetLiveStreamOptimizedFeatureConfigResponse> {
	   

	private String configStatus;

	private String configName;

	private String domainName;

	private String configValue;

	private Long ownerId;
	public SetLiveStreamOptimizedFeatureConfigRequest() {
		super("live", "2016-11-01", "SetLiveStreamOptimizedFeatureConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigStatus() {
		return this.configStatus;
	}

	public void setConfigStatus(String configStatus) {
		this.configStatus = configStatus;
		if(configStatus != null){
			putQueryParameter("ConfigStatus", configStatus);
		}
	}

	public String getConfigName() {
		return this.configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
		if(configName != null){
			putQueryParameter("ConfigName", configName);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getConfigValue() {
		return this.configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
		if(configValue != null){
			putQueryParameter("ConfigValue", configValue);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<SetLiveStreamOptimizedFeatureConfigResponse> getResponseClass() {
		return SetLiveStreamOptimizedFeatureConfigResponse.class;
	}

}
