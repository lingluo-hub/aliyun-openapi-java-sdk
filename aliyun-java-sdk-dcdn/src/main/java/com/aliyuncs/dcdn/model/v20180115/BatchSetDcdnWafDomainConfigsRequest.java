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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchSetDcdnWafDomainConfigsRequest extends RpcAcsRequest<BatchSetDcdnWafDomainConfigsResponse> {
	   

	private String domainNames;

	private String clientIpTag;

	private Long ownerId;

	private String defenseStatus;
	public BatchSetDcdnWafDomainConfigsRequest() {
		super("dcdn", "2018-01-15", "BatchSetDcdnWafDomainConfigs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		if(domainNames != null){
			putBodyParameter("DomainNames", domainNames);
		}
	}

	public String getClientIpTag() {
		return this.clientIpTag;
	}

	public void setClientIpTag(String clientIpTag) {
		this.clientIpTag = clientIpTag;
		if(clientIpTag != null){
			putBodyParameter("ClientIpTag", clientIpTag);
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

	public String getDefenseStatus() {
		return this.defenseStatus;
	}

	public void setDefenseStatus(String defenseStatus) {
		this.defenseStatus = defenseStatus;
		if(defenseStatus != null){
			putBodyParameter("DefenseStatus", defenseStatus);
		}
	}

	@Override
	public Class<BatchSetDcdnWafDomainConfigsResponse> getResponseClass() {
		return BatchSetDcdnWafDomainConfigsResponse.class;
	}

}
