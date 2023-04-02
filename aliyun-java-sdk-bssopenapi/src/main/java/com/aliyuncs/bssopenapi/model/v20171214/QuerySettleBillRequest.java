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
public class QuerySettleBillRequest extends RpcAcsRequest<QuerySettleBillResponse> {
	   

	private String productCode;

	private Boolean isHideZeroCharge;

	private Boolean isDisplayLocalCurrency;

	private String subscriptionType;

	private String billingCycle;

	private String type;

	private Long ownerId;

	private Long billOwnerId;

	private String productType;

	private String recordID;

	private String nextToken;

	private Integer maxResults;
	public QuerySettleBillRequest() {
		super("BssOpenApi", "2017-12-14", "QuerySettleBill", "bssopenapi");
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

	public Boolean getIsHideZeroCharge() {
		return this.isHideZeroCharge;
	}

	public void setIsHideZeroCharge(Boolean isHideZeroCharge) {
		this.isHideZeroCharge = isHideZeroCharge;
		if(isHideZeroCharge != null){
			putQueryParameter("IsHideZeroCharge", isHideZeroCharge.toString());
		}
	}

	public Boolean getIsDisplayLocalCurrency() {
		return this.isDisplayLocalCurrency;
	}

	public void setIsDisplayLocalCurrency(Boolean isDisplayLocalCurrency) {
		this.isDisplayLocalCurrency = isDisplayLocalCurrency;
		if(isDisplayLocalCurrency != null){
			putQueryParameter("IsDisplayLocalCurrency", isDisplayLocalCurrency.toString());
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

	public String getBillingCycle() {
		return this.billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
		if(billingCycle != null){
			putQueryParameter("BillingCycle", billingCycle);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public Long getBillOwnerId() {
		return this.billOwnerId;
	}

	public void setBillOwnerId(Long billOwnerId) {
		this.billOwnerId = billOwnerId;
		if(billOwnerId != null){
			putQueryParameter("BillOwnerId", billOwnerId.toString());
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

	public String getRecordID() {
		return this.recordID;
	}

	public void setRecordID(String recordID) {
		this.recordID = recordID;
		if(recordID != null){
			putQueryParameter("RecordID", recordID);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<QuerySettleBillResponse> getResponseClass() {
		return QuerySettleBillResponse.class;
	}

}
