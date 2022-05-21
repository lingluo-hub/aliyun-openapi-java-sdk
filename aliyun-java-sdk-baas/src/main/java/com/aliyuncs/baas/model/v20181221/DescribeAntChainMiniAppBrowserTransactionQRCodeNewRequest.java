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
public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest extends RpcAcsRequest<DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse> {
	   

	private String antChainId;

	private String contractId;

	private String transactionHash;
	public DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest() {
		super("Baas", "2018-12-21", "DescribeAntChainMiniAppBrowserTransactionQRCodeNew", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
		if(contractId != null){
			putBodyParameter("ContractId", contractId);
		}
	}

	public String getTransactionHash() {
		return this.transactionHash;
	}

	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
		if(transactionHash != null){
			putBodyParameter("TransactionHash", transactionHash);
		}
	}

	@Override
	public Class<DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse> getResponseClass() {
		return DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.class;
	}

}
