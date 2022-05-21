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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RescaleApplicationRequest extends RoaAcsRequest<RescaleApplicationResponse> {
	   

	private Integer minReadyInstances;

	private Integer replicas;

	private String appId;

	private Integer minReadyInstanceRatio;

	private Boolean autoEnableApplicationScalingRule;
	public RescaleApplicationRequest() {
		super("sae", "2019-05-06", "RescaleApplication", "serverless");
		setUriPattern("/pop/v1/sam/app/rescaleApplication");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMinReadyInstances() {
		return this.minReadyInstances;
	}

	public void setMinReadyInstances(Integer minReadyInstances) {
		this.minReadyInstances = minReadyInstances;
		if(minReadyInstances != null){
			putQueryParameter("MinReadyInstances", minReadyInstances.toString());
		}
	}

	public Integer getReplicas() {
		return this.replicas;
	}

	public void setReplicas(Integer replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putQueryParameter("Replicas", replicas.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Integer getMinReadyInstanceRatio() {
		return this.minReadyInstanceRatio;
	}

	public void setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
		this.minReadyInstanceRatio = minReadyInstanceRatio;
		if(minReadyInstanceRatio != null){
			putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio.toString());
		}
	}

	public Boolean getAutoEnableApplicationScalingRule() {
		return this.autoEnableApplicationScalingRule;
	}

	public void setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
		this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
		if(autoEnableApplicationScalingRule != null){
			putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule.toString());
		}
	}

	@Override
	public Class<RescaleApplicationResponse> getResponseClass() {
		return RescaleApplicationResponse.class;
	}

}
