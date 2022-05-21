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

package com.aliyuncs.cdt.model.v20210813;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSwitchedCdtProductsRequest extends RpcAcsRequest<ListSwitchedCdtProductsResponse> {
	   

	private String product;

	private String businessRegionId;
	public ListSwitchedCdtProductsRequest() {
		super("CDT", "2021-08-13", "ListSwitchedCdtProducts");
		setMethod(MethodType.POST);
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public String getBusinessRegionId() {
		return this.businessRegionId;
	}

	public void setBusinessRegionId(String businessRegionId) {
		this.businessRegionId = businessRegionId;
		if(businessRegionId != null){
			putQueryParameter("BusinessRegionId", businessRegionId);
		}
	}

	@Override
	public Class<ListSwitchedCdtProductsResponse> getResponseClass() {
		return ListSwitchedCdtProductsResponse.class;
	}

}
