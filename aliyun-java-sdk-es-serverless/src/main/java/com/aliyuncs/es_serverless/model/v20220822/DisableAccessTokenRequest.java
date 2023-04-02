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

package com.aliyuncs.es_serverless.model.v20220822;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DisableAccessTokenRequest extends RoaAcsRequest<DisableAccessTokenResponse> {
	   

	private String tokenId;
	public DisableAccessTokenRequest() {
		super("es-serverless", "2022-08-22", "DisableAccessToken", "elkxops");
		setUriPattern("/openapi/xops/tokens/[tokenId]/actions/disable");
		setMethod(MethodType.POST);
	}

	public String getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
		if(tokenId != null){
			putPathParameter("tokenId", tokenId);
		}
	}

	@Override
	public Class<DisableAccessTokenResponse> getResponseClass() {
		return DisableAccessTokenResponse.class;
	}

}
