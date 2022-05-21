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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainBasicConfigsRequest extends RpcAcsRequest<DescribeDomainBasicConfigsResponse> {
	   

	private Integer pageNumber;

	private String resourceGroupId;

	private Integer pageSize;

	private String accessType;

	private Integer cloudNativeProductId;

	private String instanceId;

	private String domainKey;
	public DescribeDomainBasicConfigsRequest() {
		super("waf-openapi", "2019-09-10", "DescribeDomainBasicConfigs", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAccessType() {
		return this.accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
		if(accessType != null){
			putQueryParameter("AccessType", accessType);
		}
	}

	public Integer getCloudNativeProductId() {
		return this.cloudNativeProductId;
	}

	public void setCloudNativeProductId(Integer cloudNativeProductId) {
		this.cloudNativeProductId = cloudNativeProductId;
		if(cloudNativeProductId != null){
			putQueryParameter("CloudNativeProductId", cloudNativeProductId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDomainKey() {
		return this.domainKey;
	}

	public void setDomainKey(String domainKey) {
		this.domainKey = domainKey;
		if(domainKey != null){
			putQueryParameter("DomainKey", domainKey);
		}
	}

	@Override
	public Class<DescribeDomainBasicConfigsResponse> getResponseClass() {
		return DescribeDomainBasicConfigsResponse.class;
	}

}
