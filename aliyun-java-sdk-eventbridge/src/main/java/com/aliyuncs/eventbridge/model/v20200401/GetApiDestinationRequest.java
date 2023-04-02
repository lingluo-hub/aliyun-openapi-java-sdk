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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetApiDestinationRequest extends RpcAcsRequest<GetApiDestinationResponse> {
	   

	private String clientToken;

	private String apiDestinationName;
	public GetApiDestinationRequest() {
		super("eventbridge", "2020-04-01", "GetApiDestination");
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

	public String getApiDestinationName() {
		return this.apiDestinationName;
	}

	public void setApiDestinationName(String apiDestinationName) {
		this.apiDestinationName = apiDestinationName;
		if(apiDestinationName != null){
			putQueryParameter("ApiDestinationName", apiDestinationName);
		}
	}

	@Override
	public Class<GetApiDestinationResponse> getResponseClass() {
		return GetApiDestinationResponse.class;
	}

}
