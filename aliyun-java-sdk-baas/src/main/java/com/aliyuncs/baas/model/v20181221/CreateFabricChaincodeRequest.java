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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.baas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFabricChaincodeRequest extends RpcAcsRequest<CreateFabricChaincodeResponse> {
	   

	private String endorsePolicy;

	private String ossBucket;

	private String organizationId;

	private String ossUrl;

	private String location;

	private String channelId;

	private String consortiumId;
	public CreateFabricChaincodeRequest() {
		super("Baas", "2018-12-21", "CreateFabricChaincode", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndorsePolicy() {
		return this.endorsePolicy;
	}

	public void setEndorsePolicy(String endorsePolicy) {
		this.endorsePolicy = endorsePolicy;
		if(endorsePolicy != null){
			putBodyParameter("EndorsePolicy", endorsePolicy);
		}
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putBodyParameter("OssBucket", ossBucket);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putBodyParameter("OrganizationId", organizationId);
		}
	}

	public String getOssUrl() {
		return this.ossUrl;
	}

	public void setOssUrl(String ossUrl) {
		this.ossUrl = ossUrl;
		if(ossUrl != null){
			putBodyParameter("OssUrl", ossUrl);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putBodyParameter("ConsortiumId", consortiumId);
		}
	}

	@Override
	public Class<CreateFabricChaincodeResponse> getResponseClass() {
		return CreateFabricChaincodeResponse.class;
	}

}
