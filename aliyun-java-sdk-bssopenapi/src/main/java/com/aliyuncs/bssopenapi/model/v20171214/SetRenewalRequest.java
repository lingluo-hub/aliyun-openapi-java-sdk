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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetRenewalRequest extends RpcAcsRequest<SetRenewalResponse> {
	   

	private String productCode;

	private String subscriptionType;

	private Integer renewalPeriod;

	private Long ownerId;

	private String productType;

	private String instanceIDs;

	private String renewalStatus;

	private String renewalPeriodUnit;
	public SetRenewalRequest() {
		super("BssOpenApi", "2017-12-14", "SetRenewal", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putQueryParameter("SubscriptionType", subscriptionType);
		}
	}

	public Integer getRenewalPeriod() {
		return this.renewalPeriod;
	}

	public void setRenewalPeriod(Integer renewalPeriod) {
		this.renewalPeriod = renewalPeriod;
		if(renewalPeriod != null){
			putQueryParameter("RenewalPeriod", renewalPeriod.toString());
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

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getInstanceIDs() {
		return this.instanceIDs;
	}

	public void setInstanceIDs(String instanceIDs) {
		this.instanceIDs = instanceIDs;
		if(instanceIDs != null){
			putQueryParameter("InstanceIDs", instanceIDs);
		}
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
		if(renewalStatus != null){
			putQueryParameter("RenewalStatus", renewalStatus);
		}
	}

	public String getRenewalPeriodUnit() {
		return this.renewalPeriodUnit;
	}

	public void setRenewalPeriodUnit(String renewalPeriodUnit) {
		this.renewalPeriodUnit = renewalPeriodUnit;
		if(renewalPeriodUnit != null){
			putQueryParameter("RenewalPeriodUnit", renewalPeriodUnit);
		}
	}

	@Override
	public Class<SetRenewalResponse> getResponseClass() {
		return SetRenewalResponse.class;
	}

}
