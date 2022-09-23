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
public class CreateDNSServiceRuleRequest extends RpcAcsRequest<CreateDNSServiceRuleResponse> {
	   

	private String clientToken;

	private String destination;

	private String source;

	private String dNSServiceRuleDescription;

	private Boolean dryRun;

	private String serviceType;

	private String ioTCloudConnectorId;

	private String dNSServiceRuleName;
	public CreateDNSServiceRuleRequest() {
		super("IoTCC", "2021-05-13", "CreateDNSServiceRule", "IoTCC");
		setMethod(MethodType.POST);
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

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getDNSServiceRuleDescription() {
		return this.dNSServiceRuleDescription;
	}

	public void setDNSServiceRuleDescription(String dNSServiceRuleDescription) {
		this.dNSServiceRuleDescription = dNSServiceRuleDescription;
		if(dNSServiceRuleDescription != null){
			putQueryParameter("DNSServiceRuleDescription", dNSServiceRuleDescription);
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

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
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

	public String getDNSServiceRuleName() {
		return this.dNSServiceRuleName;
	}

	public void setDNSServiceRuleName(String dNSServiceRuleName) {
		this.dNSServiceRuleName = dNSServiceRuleName;
		if(dNSServiceRuleName != null){
			putQueryParameter("DNSServiceRuleName", dNSServiceRuleName);
		}
	}

	@Override
	public Class<CreateDNSServiceRuleResponse> getResponseClass() {
		return CreateDNSServiceRuleResponse.class;
	}

}
