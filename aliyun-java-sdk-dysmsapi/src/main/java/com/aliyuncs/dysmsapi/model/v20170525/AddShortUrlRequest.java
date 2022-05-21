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

package com.aliyuncs.dysmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dysmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddShortUrlRequest extends RpcAcsRequest<AddShortUrlResponse> {
	   

	private Long resourceOwnerId;

	private String shortUrlName;

	private String resourceOwnerAccount;

	private String effectiveDays;

	private Long ownerId;

	private String sourceUrl;
	public AddShortUrlRequest() {
		super("Dysmsapi", "2017-05-25", "AddShortUrl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getShortUrlName() {
		return this.shortUrlName;
	}

	public void setShortUrlName(String shortUrlName) {
		this.shortUrlName = shortUrlName;
		if(shortUrlName != null){
			putBodyParameter("ShortUrlName", shortUrlName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getEffectiveDays() {
		return this.effectiveDays;
	}

	public void setEffectiveDays(String effectiveDays) {
		this.effectiveDays = effectiveDays;
		if(effectiveDays != null){
			putBodyParameter("EffectiveDays", effectiveDays);
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

	public String getSourceUrl() {
		return this.sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
		if(sourceUrl != null){
			putBodyParameter("SourceUrl", sourceUrl);
		}
	}

	@Override
	public Class<AddShortUrlResponse> getResponseClass() {
		return AddShortUrlResponse.class;
	}

}
